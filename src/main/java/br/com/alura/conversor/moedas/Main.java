package br.com.alura.conversor.moedas;

import java.util.Scanner;

import br.com.alura.conversor.moedas.servicos.ConversorMoedas;
import br.com.alura.conversor.moedas.telas.Menu;

public class Main {
	private static final String API_KEY = "4aa3484198313135ac5de3d0";

	public static void main(String[] args) {
		ConversorMoedas conversor = new ConversorMoedas(API_KEY);
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu(conversor);
		try {
			while (true) {
				menu.exibirMenu();
				int opcode = Integer.parseInt(scanner.nextLine());
				if (opcode == 0) {
					System.out.println("Saindo...");
					return;
				}
				menu.processarOpcao(opcode);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
