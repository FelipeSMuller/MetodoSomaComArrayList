package ExerciciosComMetodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExercicioSoma {

	public static void main(String[] args) {

		/*
		 * Exercício de Soma de Elementos de um Array: Crie um método que aceite um
		 * array de números inteiros como parâmetro e retorne a soma de todos os
		 * elementos do array.
		 */

		ArrayList<Integer> inteiros = new ArrayList<>();

		int contagem = 1, insereNumero = 0, limite = 10;

		do {

			try {

				insereNumero = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Digite o " + contagem++ + "° número"));

				if (insereNumero <= 0) {

					JOptionPane.showMessageDialog(null,

							"Você não pode inserir números negativos ou iguais a 0 ( zero ) ");

					break;

				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"ERRO, você preencheu dados inválidos ou finalizou a aplicação incorretamente");

				break;
			}

			inteiros.add(insereNumero);

		} while (contagem <= limite);

		MetodoSoma.Soma(inteiros);

	}

}
