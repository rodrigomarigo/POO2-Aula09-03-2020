package com.example.poo2aula09032020.service;

import java.util.ArrayList;

import com.example.poo2aula09032020.model.Produto;
import com.example.poo2aula09032020.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
@Service
public class ProdutosService {

    @Autowired
    private ProdutoRepository ur;

    public Produto getProduto(int id)
    {
        Produto produto = ur.getProdutoByID(id);

        return produto;
    }

    public ArrayList<Produto> getProdutosEmEstoque(){
        ArrayList<Produto> p = new ArrayList<Produto>();
        for(String i : ur.hm.keySet()){
            if(ur.hm.get(i).getEstoque() > 0)
                p.add(ur.hm.get(i));
        }

        return p;
    }

    public ArrayList<Produto> getProdutosAcimaValor(int v){
        ArrayList<Produto> p = new ArrayList<Produto>();
        for(String i : ur.hm.keySet()){
            if(ur.hm.get(i).getValor() > v)
                p.add(ur.hm.get(i));
        }

        return p;
    }

    public ArrayList<Produto> getProdutosAbaixoValor(int v){
        ArrayList<Produto> p = new ArrayList<Produto>();
        for(String i : ur.hm.keySet()){
            if(ur.hm.get(i).getValor() < v)
                p.add(ur.hm.get(i));
        }

        return p;
    }

}