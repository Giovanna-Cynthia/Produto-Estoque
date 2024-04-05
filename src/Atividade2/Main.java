package Atividade2;

import java.util.Scanner;
    	
    	
    	public class Main {

    		public static void main(String[] args) {
    		    Estoque estoque = new Estoque("estoque.txt");
    		    try (Scanner scanner = new Scanner(System.in)) {
    		        System.out.println("Adicionar Produto:");
    		        System.out.print("Digite o código do produto: ");
    		        int codigo = scanner.nextInt();
    		        scanner.nextLine(); // 
    		        System.out.print("Digite o nome do produto: ");
    		        String nome = scanner.nextLine();
    		        System.out.print("Digite a descrição do produto: ");
    		        String descricao = scanner.nextLine();
    		        System.out.print("Digite a quantidade do produto: ");
    		        int quantidade = scanner.nextInt();
    		        System.out.print("Digite o preço do produto: ");
    		        double preco = scanner.nextDouble();
    		        System.out.print("Digite o tipo de produto (Alimento, Eletronico ou outro): ");
    		        String tipo = scanner.next();
    		        estoque.criarProduto(codigo, nome, descricao, quantidade, preco, tipo);

    		        estoque.exibirInformacoes();

    		        
    		    }
    		    
    		}

    		}

