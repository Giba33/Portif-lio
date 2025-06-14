package br.com.gilbertorangel125gmailcom.wordpress;

import br.com.gilbertorangel125gmailcom.wordpress.model.Mercado;

public class Main {
    public static void main(String[] args){
        // categorias
    Categoria alimentos = new Categoria(nome"Alimentos");
    Categoria higienePessoal = new Categoria(nome"Higiene Pessoal");
    Categoria hegineDolar = new Categoria(nome"Higiene do lar");

    //itens de alimentos
        Item cafePilao = new Item(nome "Pilao",preco 30,00);
        Item cafeTresCoraCoes =new Item(nome"TresCoraCoes",preco 52,02)


     //itens de higiene Pessoal
        Item saboneteDove = new Item(nome"Dove",preco 25,90);
        Item saboneteErvaDoce = new Item(nome"ErvaDoce",preco 28,80);


     // itens de higiene do Lar
        Item desinfetantePinhoSol = new Item(nome"PinhoSol",preco 18,71);
        Item sabaodePedraYpeNeutro = new Item(nome"YpeNeutro",preco 15,90);


    alimentos.adicionarItem(Pilao);
        alimentos.adicionarItem(TresCoraes);

        higienePessoal.adicionarItem(Dove);
        higienePessoal.adicionarItem(ErvaDoce);

        higieneDoLar.adicionar(PinhoSol);
        higieneDoLar.adicionar(YpeNeutro);





     {
       Mercado melhorpreco = new Mercado(nome"Melhor Preco");
       melhorpreco.adicionarCategoria(alimentos);
         melhorpreco.adicionarCategoria(higienePessoal);
         melhorpreco.adicionarCategoria(higineDolar);

         Mercado Interlagos = new Mercado(nome"Mercado Intelagos");
         Interlagos.adicionarCategoria(alimentos);
         Interlagos.adicionarCategoria(higinePessoal);
         Interlagos.adicionarCategoria(higineDoLar);

    }
}