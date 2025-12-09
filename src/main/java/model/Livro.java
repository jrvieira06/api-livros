package com.jr.api_livros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Cria a tabela no banco automaticamente
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Chave primária [cite: 8]

    private String titulo; // [cite: 9]
    private String autor; // [cite: 10]
    private String isbn; // [cite: 11]
    private Integer anoPublicacao; // [cite: 12]
    private Boolean disponivel; // [cite: 13]

    // Construtor vazio (obrigatório)
    public Livro() {
    }

    // Construtor cheio (para facilitar)
    public Livro(String titulo, String autor, String isbn, Integer anoPublicacao, Boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    // Getters e Setters (Obrigatórios para o Spring ler os dados)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Integer getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(Integer anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public Boolean getDisponivel() { return disponivel; }
    public void setDisponivel(Boolean disponivel) { this.disponivel = disponivel; }
}