document.getElementById("userForm").addEventListener("submit", async (e) => {
    e.preventDefault();

    const user = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        department: document.getElementById("department").value,
    };

    const res = await fetch("http://localhost:8080/api/users", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(user)
    });

    if (res.ok) {
        alert("User Registered Successfully!");
        document.getElementById("userForm").reset();
    } else {
        alert("Failed to register user");
    }
});
