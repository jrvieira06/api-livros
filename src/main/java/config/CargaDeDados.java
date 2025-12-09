package com.jr.api_livros.config;

import com.jr.api_livros.model.Livro;
import com.jr.api_livros.repository.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class CargaDeDados {

    @Bean
    public CommandLineRunner executar(LivroRepository repository) {
        return args -> {
            Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-000", 1954, true);
            Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", "978-111", 1899, true);
            Livro l3 = new Livro("Clean Code", "Robert C. Martin", "978-222", 2008, true);

            repository.saveAll(Arrays.asList(l1, l2, l3));
        };
    }
}