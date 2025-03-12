package com.exemplo.cadastro.controller;

import com.exemplo.cadastro.model.Pessoa;
import com.exemplo.cadastro.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pessoas", service.listarTodos());
        return "pessoas/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "pessoas/form";
    }

    @PostMapping
    public String salvar(@Valid @ModelAttribute Pessoa pessoa, BindingResult result) {
        if (result.hasErrors()) {
            return "pessoas/form";
        }
        service.salvar(pessoa);
        return "redirect:/pessoas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Pessoa pessoa = service.buscarPorId(id).orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("pessoa", pessoa);
        return "pessoas/form";
    }

    @PostMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @Valid @ModelAttribute Pessoa pessoa, BindingResult result) {
        if (result.hasErrors()) {
            return "pessoas/form";
        }
        pessoa.setId(id);
        service.salvar(pessoa);
        return "redirect:/pessoas";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/pessoas";
    }
}