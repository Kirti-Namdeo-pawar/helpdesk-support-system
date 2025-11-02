document.getElementById("ticketForm").addEventListener("submit", async (e) => {
  e.preventDefault();

  const user = JSON.parse(localStorage.getItem("loggedInUser"));
  const token = localStorage.getItem("token");

  if (!user || !token) {
    alert("Please login first.");
    window.location.href = "index.html";
    return;
  }

  const ticket = {
    title: document.getElementById("title").value,
    description: document.getElementById("description").value,
    user: { id: user.id }
  };

  const res = await fetch("http://localhost:8080/api/tickets", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      "Authorization": `Bearer ${token}`
    },
    body: JSON.stringify(ticket)
  });

  if (res.ok) {
    alert("✅ Ticket Created Successfully!");
    document.getElementById("ticketForm").reset();
  } else {
    const error = await res.text();
    alert("❌ Failed to create ticket: " + error);
  }
});
