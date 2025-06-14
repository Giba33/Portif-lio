package br.com.gilbertorangel125gmailcom.wordpress;

import java.util.ArrayList;

public class Mercado {
    private int codigo;
    private String nome;
    private ArrayList<Categoria> categoria;
    private ArrayList<Item> item;


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
}

