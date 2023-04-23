package com.conversor.conversor;

import javax.swing.JOptionPane;

public class ConversorTemp {
	public void ConvertirFaC(double temperatura) {
		double celcius = (temperatura - 32) * 5 / 9;
		JOptionPane.showMessageDialog(null,
				"de " + temperatura + " grados fahrenheit a " + celcius + " grados celcius");
	}

	public void ConvertirCaF(double temperatura) {
		double fahrenheit = temperatura * 9 / 5 + 32;
		JOptionPane.showMessageDialog(null,
				"de " + temperatura + " grados celcius a " + fahrenheit + " grados fahrenheit");
	}

}
