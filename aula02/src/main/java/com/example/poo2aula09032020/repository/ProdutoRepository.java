package com.example.poo2aula09032020.repository;

import java.util.HashMap;

import com.example.poo2aula09032020.model.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {

    public HashMap<String, Produto> hm = new HashMap<String,Produto>();

    public ProdutoRepository()
    {
        hm.put("batata",new Produto(1, "Batata", 1.5, 5));
        hm.put("cebola",new Produto(2, "Cebola", 0.5, 0));
        hm.put("cenoura",new Produto(3, "Cenoura", 1.0, 6));
        hm.put("arroz",new Produto(4, "Arroz", 2.5, 1));
        hm.put("feijao",new Produto(5, "Feijao", 3.5, 0));
        hm.put("sal",new Produto(6, "Sal", 1.8, 1));
        hm.put("banana",new Produto(7, "Banana", 3.2, 4));
        hm.put("queijo",new Produto(8, "Queijo", 7.5, 1));
        hm.put("frango",new Produto(9, "Frango", 12.5, 5));
        hm.put("chocolate",new Produto(10, "Chocolate", 6.5, 3));
        
    }


    public Produto getProduto(String nome){
        return hm.get(nome);
    }

    public Produto getProdutoByID(int id)
    {
        Produto r = null;
        for(String i : hm.keySet()){
            if(hm.get(i).getid() == id)
                r = hm.get(i);
        }
        return r;
    }

}