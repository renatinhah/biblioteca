package br.com.aceleradev.biblioteca.controllers;

import br.com.aceleradev.biblioteca.models.Livro;
import br.com.aceleradev.biblioteca.services.impl.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    //injeção de dependencia
    //geral responsabilidade do controller
//    @Autowired
//    private LivroService livroService;

    //no construtor
    //responsabilidade de um elemento de fora
    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }

    @PostMapping
    public Livro save(@RequestBody  Livro livro){
        return this.livroService.save(livro);
    }

    @GetMapping
    public List<Livro> findAll(){
        return  this.livroService.findAll();
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable Long id){
        return this.livroService.findById(id);
    }



//    no metodo de injetar dependencia (pouco utilizado)
//    responsabilidade de um elemento de fora
//    public  void setLivroService(LivroService livroService){
//        this.livroService = livroService;
//    }

}
