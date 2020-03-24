package com.example.poo2aula09032020.controller;

import java.util.ArrayList;

import com.example.poo2aula09032020.model.Produto;
import com.example.poo2aula09032020.service.ProdutosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class ProdutoController {

    @Autowired
    private ProdutosService ps;

    @GetMapping("/produto/{id}")
    public ModelAndView getProduto(
        @PathVariable("id") String id
        ) {
        ModelAndView mv = new ModelAndView("produtoView");
        
        Produto produto = ps.getProduto(Integer.parseInt(id));
        
        mv.addObject("produto", produto);

        return mv;
    }

    @GetMapping("/produtoemEstoque")
    public ModelAndView getProdutoemEstoque(
        ) {
        ArrayList<Produto> produtos = ps.getProdutosEmEstoque();
        
        ModelAndView mv = new ModelAndView("produtoEstoque");
        
        mv.addObject("produtos", produtos);

        return mv;
    }

    @GetMapping("/produtoAcima/{x}")
    public ModelAndView getProdutosAcima(
        @PathVariable("x") String x
        ) {
        ArrayList<Produto> produtos = ps.getProdutosAcimaValor(Integer.parseInt(x));
        
        ModelAndView mv = new ModelAndView("produtosAcima");
        
        mv.addObject("produtos", produtos);

        return mv;
    }

    @GetMapping("/produtoAbaixo/{x}")
    public ModelAndView getProdutosAbaixo(
        @PathVariable("x") String x
        ) {
        ArrayList<Produto> produtos = ps.getProdutosAbaixoValor(Integer.parseInt(x));
        
        ModelAndView mv = new ModelAndView("produtosAbaixo");
        
        mv.addObject("produtos", produtos);

        return mv;
    }

}