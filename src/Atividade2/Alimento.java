package Atividade2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

class Alimento extends Produto {
    private LocalDate dataValidade;

    public Alimento(int codigo, String nome, String descricao, int quantidade, double preco, LocalDate dataValidade) {
        super(codigo, nome, descricao, quantidade, preco);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Data de Validade: " + dataValidade.toString();
    }

    @Override
    public void gravaEstoque(int codigo, String nome, String descricao, int quantidade, double preco) {
        try {
            FileWriter writer = new FileWriter("estoque.txt", true);
            writer.write(codigo + ", " + nome + ", " + descricao + ", " + quantidade + ", " + preco + ", " + dataValidade + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
