package com.project.sistema_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "index"; 
    }
    @GetMapping("/laudos")
    public String laudos() {
        return "laudos"; 
    }
    @GetMapping("/resultados")
    public String resultados() {
        return "resultados"; 
    }
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; 
    }
    @GetMapping("/filtroAresultados")
    public String filtroAresultados() {
        return "filtroAresultados"; 
    }
    @GetMapping("/saidaAmostra")
    public String saidaAmostra() {
        return "saidaAmostra"; 
    }
    @GetMapping("/filtrosaida")
    public String filtrosaida() {
        return "filtrosaida"; 
    }
    @GetMapping("/filtrocadastro")
    public String filtrocadastro() {
        return "filtrocadastro"; 
    }
    @GetMapping("/estoque")
    public String estoque() {
        return "estoque"; 
    }


}