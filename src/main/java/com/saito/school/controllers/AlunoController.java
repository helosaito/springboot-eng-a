package com.saito.school.controllers;

import com.saito.school.models.AlunoModel;
import com.saito.school.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoModel criarAluno( @RequestBody AlunoModel alunoModel){
        return alunoService.criarAluno(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> bucarTodosAlunos(){
        return alunoService.bucarTodosAlunos();
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);
    }
}
