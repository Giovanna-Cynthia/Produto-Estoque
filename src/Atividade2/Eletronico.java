package Atividade2;

import java.io.FileWriter;
import java.io.IOException;

class Eletronico extends Produto {
    private String marca;
    private String modelo;

    public Eletronico(int codigo, String nome, String descricao, int quantidade, double preco, String marca, String modelo) {
        super(codigo, nome, descricao, quantidade, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Marca: " + marca + ", Modelo: " + modelo;
    }

    @Override
    public void gravaEstoque(int codigo, String nome, String descricao, int quantidade, double preco) {
        try {
            FileWriter writer = new FileWriter("estoque.txt", true);
            writer.write(codigo + ", " + nome + ", " + descricao + ", " + quantidade + ", " + preco + ", " + marca + ", " + modelo + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


