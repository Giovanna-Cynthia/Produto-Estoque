package Atividade2;

	import java.io.*;
	import java.util.Scanner;

	public class Estoque {

	    private String arquivoEstoque;

	    public Estoque(String arquivoEstoque) {
	        this.arquivoEstoque = arquivoEstoque;
	    }

	    public void criarProduto(int codigo, String nome, String descricao, int quantidade, double preco, String tipo) {
	        try (FileWriter writer = new FileWriter(arquivoEstoque, true)) {
	            if (tipo.equalsIgnoreCase("Alimento")) {
	            	
	                Scanner scanner = new Scanner(System.in);
	                System.out.print("Digite a data de validade (YYYY-MM-DD): ");
	                String dataValidade = scanner.nextLine();
	                writer.write(codigo + "," + nome + "," + descricao + "," + quantidade + "," + preco + "," + dataValidade + "\n");
	            } else if (tipo.equalsIgnoreCase("Eletronico")) {
	                Scanner scanner = new Scanner(System.in);
	                System.out.print("Digite a marca: ");
	                String marca = scanner.nextLine();
	                System.out.print("Digite o modelo: ");
	                String modelo = scanner.nextLine();
	                writer.write(codigo + "," + nome + "," + descricao + "," + quantidade + "," + preco + "," + marca + "," + modelo + "\n");
	            } else {
	                writer.write(codigo + "," + nome + "," + descricao + "," + quantidade + "," + preco + "\n");
	            }
	            System.out.println("Produto adicionado ao estoque com sucesso!");
	        } catch (IOException e) {
	            System.err.println("Erro ao adicionar produto ao estoque: " + e.getMessage());
	        }
	    }


	    public void exibirInformacoes() {
	        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoEstoque))) {
	            String line;
	            int index = 1;
	            System.out.println("Produtos no Estoque:");
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                System.out.println("Índice: " + index);
	                System.out.println("Código: " + parts[0] + ", Nome: " + parts[1] + ", Descrição: " + parts[2] +
	                        ", Quantidade: " + parts[3] + ", Preço: " + parts[4]);
	                index++;
	            }
	        } catch (IOException e) {
	            System.err.println("Erro ao exibir informações do estoque: " + e.getMessage());
	        }
	    }	   
}
