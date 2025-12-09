package com.jr.api_livros.controller;

import com.jr.api_livros.model.Livro;
import com.jr.api_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Diz que esta classe controla endpoints da API
@RequestMapping("/api/livros") // Define o endereço base: http://localhost:8080/api/livros
public class LivroController {

    @Autowired // Injeta o Repository automaticamente
    private LivroRepository livroRepository;

    // 1. LER TODOS
    @GetMapping
    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    // 2. CRIAR
    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    // 3. LER POR ID
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
        return livroRepository.findById(id)
                .map(livro -> ResponseEntity.ok(livro)) // Se achar, retorna 200 OK
                .orElse(ResponseEntity.notFound().build()); // Se não achar, retorna 404 Not Found
    }

    // 4. ATUALIZAR
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        Optional<Livro> livroExistente = livroRepository.findById(id);

        if (livroExistente.isPresent()) {
            Livro livro = livroExistente.get();
            // Atualiza os dados
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setIsbn(livroAtualizado.getIsbn());
            livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
            livro.setDisponivel(livroAtualizado.getDisponivel());

            // Salva
            return ResponseEntity.ok(livroRepository.save(livro));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // 5. EXCLUIR
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (livroRepository.existsById(id)) {
            livroRepository.deleteById(id);
            return ResponseEntity.noContent().build(); // Retorna 204 (Sucesso sem conteúdo)
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}