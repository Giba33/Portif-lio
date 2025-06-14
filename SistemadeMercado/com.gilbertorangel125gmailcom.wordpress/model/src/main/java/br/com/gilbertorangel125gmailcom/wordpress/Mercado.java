package br.com.gilbertorangel125gmailcom.wordpress;

import java.util.ArrayList;

public class Mercado {
    private final ArrayList<Object> categorias;
    private int codigo;
    private String nome;
    private ArrayList<Categoria> categoria;
    private ArrayList<item> item;


    public Mercado(String nome) {
      this.categorias = new ArrayList<>();
      this.itens = new Arraylist<>();

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public void adicionarCategoria(Categoria categoria){
        categorias.add(categoria);

    }
    public void removerCategoria(int codigo){
        System.out.println(categorias.get(codigo).getNome()." foi removido com sucesso!");
        categorias.remove(codigo);
    }

    public void adicionarItem(Item item){
        itens.add(item);

    }

    public void removerItem(int codigo){
        System.out.println(itens.get(codigo).getNome()." foi removido com sucesso!");
        itens.remove(codigo);

    }

    public void apresentarCategorias(){
        for (int i=0; i<categorias.size(); i++){
            System.out.println(("Codigo: "+i+", Nome da Categoria: "+categorias.get(i).getNome());

        }

        public void apresentarItens(){
            for (int i=0; i<itens.size(); i++){
                System.out.println(("Codigo: "+i+", Nome da Item: "+itens.get(i).getNome()+", preco: "+itens.get(i).getPreco);

            }

            public void apresentarCategoriaPorCodigo(int codigo)Object j;
            {
                for (int i=0; i<categorias.size(); i++) {
                    if (codigo == 0) {
                        for (int j = 0; j < categorias.get(0).getItens().size(); j++) ;
                        System.out.println(categorias.get(0).getItens().get(j).getNome();

                    }
                    i = categorias.size();
                } else if (codigo ==1){

                    for (int j = 0; j < categorias.get(1).getItens().size(); j++) ;
                    System.out.println(categorias.get(1).getItens().get(j).getNome())

                }
                    i = categorias.size();
                } else if (codigo ==2){
               for (int j = 0; j < categorias.get(2).getItens().size(); j++) ;
               System.out.println(categorias.get(2).getItens().get(j).getNome())

        }
        i = categorias.size();
                }

                }
}

