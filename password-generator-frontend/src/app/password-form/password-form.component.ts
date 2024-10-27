import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-password-form',
  templateUrl: './password-form.component.html',
  styleUrls: ['./password-form.component.css']
})
export class PasswordFormComponent {
  length: number = 8;
  useUpperCase: boolean = false;
  useNumbers: boolean = false;
  useSpecialChars: boolean = false;
  generatedPassword: string = '';

  constructor(private http: HttpClient) {}

  generatePassword(event: Event): void {
    event.preventDefault();

    // Parâmetros de requisição
    const params = {
      length: this.length,
      useUpperCase: this.useUpperCase,
      useNumbers: this.useNumbers,
      useSpecialChars: this.useSpecialChars
    };

    this.http.post('http://localhost:8080/api/password/generate', params, { responseType: 'text' })
      .subscribe(password => {
        this.generatedPassword = password;
      }, error => {
        console.error('Erro ao gerar a senha:', error);
      });
  }
}
