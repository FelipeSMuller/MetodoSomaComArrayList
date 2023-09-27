package ExerciciosComMetodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MetodoSoma {

	public static void Soma(ArrayList<Integer> minhaLista) {

		int soma = 0;

		for (int i = 0; i < minhaLista.size(); i++) {

			soma += minhaLista.get(i);

		}

		JOptionPane.showMessageDialog(null,
				
				"Soma entre todos os valores inseridos = " + soma + "\nMédia = " + soma / minhaLista.size());

	}

}
