package Exe1;

import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Stack pilha = new Stack(); // Classe Pilha
		String vetor[] = new String[10]; 
		
		Scanner scanner;
		scanner = new Scanner(new File("C:\\Users/eugen/OneDrive/Documentos/Tools/fraseED.txt")) ;

		while(scanner.hasNextLine()) {
			pilha.push(scanner.nextLine());
		}
		
		for(int i = 0; i < vetor.length; i++) {
			vetor [i] = (String) pilha.pop();
			System.out.println(vetor[i]);
			}
		while(!pilha.empty()) {
			System.out.println(pilha.pop());
		}
			

	}
}