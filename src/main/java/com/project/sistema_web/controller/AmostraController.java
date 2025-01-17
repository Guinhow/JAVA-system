package com.project.sistema_web.controller;

import com.project.sistema_web.model.Amostra;
import com.project.sistema_web.repository.AmostraRepository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/amostras")
public class AmostraController {

    @Autowired
    private AmostraRepository repository;

    @GetMapping("/entradaAmostra")
    public String mostrarFormulario(Model model) {
        model.addAttribute("amostra", new Amostra());
        return "entradaAmostra";
    }

    @PostMapping("/salvar")
    public String salvarAmostra(@ModelAttribute Amostra amostra) {
        repository.save(amostra);
        return "redirect:/";
    }


    @GetMapping("/filtroAmostra")
    public String mostrarFormulario() {
        return "filtroAmostra";
}


    @GetMapping("/buscar")
    @ResponseBody
    public List<Amostra> buscarAmostras(
            @RequestParam(required = false) Integer codigoBq,
            @RequestParam(required = false) String cliente,
            @RequestParam(required = false) String sample,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataEntrada
    ) {
        return repository.findByFilters(codigoBq, cliente, sample, dataEntrada);
    }

}
