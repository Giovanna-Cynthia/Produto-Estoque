package ManipulandoArquivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;


public class ManipulandoArquivo {

	public static void main(String[] args) {
		  writeToFile("FileData.txt", "Olá mundo!");
			
			String content = readFromFile("fileData.txt");
			System.out.println("Conteúdo lido do arquivo:" + content);
	}


	public static void writeToFile(String fileName, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(content);
			
		}catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo:" + e.getMessage());
		}
		
	}
	
	private static String readFromFile(String fileName) {
		StringBuilder content = new StringBuilder();
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			String line;
			
			/*Executar o loop de repetição enquanto a variavel lida
			 no arquivo for diferente do nulo*/ 
			while ((line = reader.readLine()) != null) {
				
				//escreve o conteúdo na variável
				content.append(line).append("/n");
			}
		}catch(IOException e) {
			System.err.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		return content.toString();
	}
}