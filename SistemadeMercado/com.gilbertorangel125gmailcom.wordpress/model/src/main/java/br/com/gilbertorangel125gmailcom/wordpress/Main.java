package br.com.gilbertorangel125gmailcom.wordpress;

import br.com.gilbertorangel125gmailcom.wordpress.model.Mercado;

public class Main {
    public static void main(String[] args){
        // categorias
    Categoria alimentos = new Categoria(nome"Alimentos");
    Categoria higienePessoal = new Categoria(nome"Higiene Pessoal");
    Categoria hegineDolar = new Categoria(nome"Higiene do lar");

    //itens de alimentos
        Item cafePilao = new Item(nome:"Pilao",preco 30,00);
        Item cafeTresCoraCoes =new Item(nome: "TresCoraCoes",preco 52,02)


     //itens de higiene Pessoal
        Item saboneteDove 1 = new Item(nome:"Sabonete Dove 1",preco:25,90);
        Item saboneteErvaDoce 2 = new Item(nome:"Sabanete ErvaDoce 2",preco:28,80);


     // itens de higiene do Lar
        Item desinfetantePinhoSol = new Item(nome"Desinfetante PinhoSol x",preco 18,71);
        Item sabaodePedraYpeNeutro = new Item(nome" Sabao de Pedra YpeNeutro y",preco 15,90);


    alimentos.adicionarItem(Pilao);
        alimentos.adicionarItem(TresCoraes);

        higienePessoal.adicionarItem(saboneteDove1);
        higienePessoal.adicionarItem(saboneteErvaDoce2);

        higieneDoLar.adicionar(DesinfetantePinhoSol);
        higieneDoLar.adicionar(SabaoemPedraYpeNeutro);


     {

         Mercado melhorpreco = new Mercado(nome:"Mercado Melhor Preco");
       melhorpreco.adicionarCategoria(alimentos);
         melhorpreco.adicionarCategoria(higienePessoal);
         melhorpreco.adicionarCategoria(higineDolar);

         System.out.println("Apresente todas categorais cadastradas!");
       melhorpreco.aqpresentarCategorias();


       System.out.println("Mostrar todos os itens");
       melhorpreco.apresentarItens();

        /*
            Mercado Interlagos = new Mercado(nome"Mercado Intelagos");
         Interlagos.adicionarCategoria(alimentos);
         Interlagos.adicionarCategoria(higinePessoal);
         Interlagos.adicionarCategoria(higineDoLar);
        */

    }
}