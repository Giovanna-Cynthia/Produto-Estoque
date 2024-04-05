package Atividade;

import java.io.BufferedWriter; // Importa a classe BufferedWriter para escrita em arquivos
import java.io.FileWriter; // Importa a classe FileWriter para escrita em arquivos
import java.io.IOException; // Importa a classe IOException para tratamento de exceções de entrada/saída
import java.util.Scanner; // Importa a classe Scanner para entrada de dados do usuário

public class Informacoes { // Declaração da classe "Informacoes"

    public class TabuadaFile { // Declaração da classe interna "TabuadaFile" (Neste contexto, não é necessário ter uma classe interna)

        public static void main(String[] args) { // Método principal "main"

            Scanner scanner = new Scanner(System.in); // Instancia um objeto Scanner para entrada de dados do usuário

            System.out.print("Digite o número da tabuada que você quer: "); // Solicita ao usuário que digite um número
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            String nomeArquivo = "tabuada_" + numero + ".txt"; // Cria o nome do arquivo com base no número fornecido pelo usuário

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) { // Abre um BufferedWriter para escrever no arquivo
                writer.write("Tabuada do " + numero + ":\n"); // Escreve no arquivo a introdução da tabuada

                for (int i = 1; i <= 10; i++) { // Loop para calcular e escrever a tabuada no arquivo
                    writer.write(numero + " x " + i + " = " + (numero * i) + "\n"); // Escreve no arquivo a linha da tabuada
                }

                System.out.println("Tabuada escrita no arquivo: " + nomeArquivo); // Informa ao usuário que a tabuada foi escrita no arquivo
            } catch (IOException e) { // Trata exceções de entrada/saída
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage()); // Exibe mensagem de erro
            } finally { // Bloco de código que sempre será executado, independentemente de exceções
                scanner.close(); // Fecha o objeto Scanner para liberar recursos
            }
        }

        
        public static void witeToFile(String fileName, String content) {
        	try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
        		writer.newLine();
        		writer.write(content);
        		System.out.println("Conteudo salvo no arquivo com sucesso.");
        	} catch(IOException e) {
        		System.out.println("Erro ao escrever arquivo; " + e.getMessage());
        	}
        }
    }
}
