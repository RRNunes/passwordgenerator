document.getElementById("password-form").addEventListener("submit", async function(event) {
    event.preventDefault();

    const length = document.getElementById("length").value;
    const useNumbers = document.getElementById("useNumbers").checked;
    const useUpperCase = document.getElementById("useUpperCase").checked;
    const useSpecialChars = document.getElementById("useSpecialChars").checked;

    // monta a requisição com os dados do formulario
    const requestData = {
        length: parseInt(length),
        useNumbers: useNumbers,
        useUpperCase: useUpperCase,
        useSpecialChars: useSpecialChars
    };

    try {
        const response = await fetch("http://localhost:8080/api/password/generate", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(requestData)
        });

        if (!response.ok) {
            throw new Error("Erro na resposta do servidor");
        }

        const password = await response.text(); // captura a resposta em texto
        console.log("Response Status:", response.status);

        // exibe a senha no elemento com id 'password-result'
        document.getElementById("password-result").textContent = password;
    } catch (error) {
        console.error("Erro ao gerar senha:", error);
        document.getElementById("password-result").textContent = "Erro ao gerar senha. Tente novamente.";
    }
});
