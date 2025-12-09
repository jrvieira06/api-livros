package com.jr.api_livros.repository;

import com.jr.api_livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    // É só isto!
    // O Spring Data JPA cria automaticamente o código para:
    // .save() (Criar/Atualizar)
    // .findAll() (Ler todos)
    // .findById() (Ler um)
    // .deleteById() (Apagar)
}