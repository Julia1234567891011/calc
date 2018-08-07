package ifc.calculadora;

import javax.swing.JOptionPane;

public class calculadora1 {
 
	public static void main(String[] args) {
		String numA = JOptionPane.showInputDialog(null, "digite o primeiro valor");
		String numB = JOptionPane.showInputDialog(null,"digite o segundo valor");
		
		double a =Double.parseDouble(numA);
		double b =Double.parseDouble(numB);
		
		//calcular
		
		int soma = (int) (a + b);
		int sub = (int) (a - b);
		int mult = (int) (a * b);
		int div = (int) (a / b);
		
		//mostrar op 
		
		JOptionPane.showMessageDialog(null, "soma "+ soma + "\n"+
		"Subtração"+ sub + "\n" + "Multiplicação" + mult + "\n" + "Divisão" + div);
		
	}
	
}
