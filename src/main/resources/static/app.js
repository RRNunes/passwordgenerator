document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('password-form').addEventListener('submit', function(event) {
        event.preventDefault(); // evitar o recarregamento da página
        const length = document.getElementById('length').value;
        const useUpperCase = document.getElementById('uppercase').checked;
        const useNumbers = document.getElementById('numbers').checked;
        const useSpecialChars = document.getElementById('special').checked;
        const params = new URLSearchParams({
            length: length,
            useUpperCase: useUpperCase,
            useNumbers: useNumbers,
            useSpecialChars: useSpecialChars
        });
        fetch(`http://localhost:8080/api/password/generate?${params.toString()}`, {
            method: 'POST'
        })
        .then(response => response.text())
        .then(password => {
            console.log("Generated Password:", password); // verificar a resposta
            // exibir a senha gerada
            document.getElementById('password-result').innerText = password;
        })
        .catch(error => {
            console.error('Error generating password:', error);
        });
    });
});
