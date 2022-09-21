package com.lucca.provaonsafety.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucca.provaonsafety.model.pessoaModel;
import com.lucca.provaonsafety.repository.pessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class pessoaController {

   private pessoaRepository repository;

   pessoaController(pessoaRepository repository) {
       this.repository = repository;
   }

@GetMapping
public List<pessoaModel> findAll(){
   return repository.findAll();
}

@GetMapping(path = {"/{id}"})
public ResponseEntity<pessoaModel> findById(@PathVariable long id){
   return repository.findById(id)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
}

@PostMapping(path = {"/criar"})
public pessoaModel create(@RequestBody pessoaModel pessoa){
   return repository.save(pessoa);
}

@PutMapping(path = {"/atualiza/{id}"})
public ResponseEntity<pessoaModel> update(@PathVariable("id") long id,@RequestBody pessoaModel pessoa) {
   return repository.findById(id)
           .map(record -> {
               record.setNome(pessoa.getNome());
               record.setCpf(pessoa.getCpf());
               record.setDataNascimento(pessoa.getDataNascimento());
               record.setEmail(pessoa.getEmail());
               pessoaModel updated = repository.save(record);
               return ResponseEntity.ok().body(updated);
           }).orElse(ResponseEntity.notFound().build());
}

@DeleteMapping(path ={"/apaga/{id}"})
public ResponseEntity <?> delete(@PathVariable long id) {
   return repository.findById(id)
           .map(record -> {
               repository.deleteById(id);
               return ResponseEntity.ok().build();
           }).orElse(ResponseEntity.notFound().build());
}
}

