# 📚 API de Gerenciamento de Livros

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.0-green)
![Swagger](https://img.shields.io/badge/Swagger-UI-blue)

API REST desenvolvida para o gerenciamento de livros de uma biblioteca, desenvolvido com a ajuda de um dos meus melhores amigos (Gemini🤖). Projeto realizado para a disciplina de **Arquitetura e Desenvolvimento Back-end**.

## 🚀 Tecnologias Utilizadas

* **Java 17**: Linguagem de programação.
* **Spring Boot 3**: Framework principal.
* **Spring Data JPA**: Para persistência de dados.
* **H2 Database**: Banco de dados em memória.
* **OpenAPI / Swagger UI**: Documentação interativa da API.

## ✨ Funcionalidades

O sistema permite realizar operações CRUD (Criar, Ler, Atualizar, Deletar) na entidade **Livro**:

| Método | Rota | Descrição |
|---|---|---|
| **GET** | `/api/livros` | Lista todos os livros cadastrados. |
| **GET** | `/api/livros/{id}` | Busca um livro específico pelo ID. |
| **POST** | `/api/livros` | Cadastra um novo livro. |
| **PUT** | `/api/livros/{id}` | Atualiza os dados de um livro existente. |
| **DELETE** | `/api/livros/{id}` | Remove um livro do sistema. |

### 📝 Exemplo de JSON (Livro)

```json
{
  "titulo": "O Senhor dos Anéis",
  "autor": "J.R.R. Tolkien",
  "isbn": "978-000",
  "anoPublicacao": 1954,
  "disponivel": true
}
