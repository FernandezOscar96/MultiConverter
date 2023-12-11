package com.conversor.conversor;

import javax.swing.JOptionPane;

public class Conversor {

	public double cantidad;

	private static int buscarValorPorMoneda(Object[][] array, String monedaBuscada) {
		for (Object[] monedaArray : array) {
			if (monedaArray.length == 2 && monedaArray[0] instanceof String && monedaArray[1] instanceof Integer) {
				String nombreMoneda = (String) monedaArray[0];
				if (nombreMoneda.equals(monedaBuscada)) {
					return (int) monedaArray[1];
				}
			}
		}
		return -1;
	}

	public void PesoAConvertir(String moneda, Object[][] trade) {

		int valor = buscarValorPorMoneda(trade, moneda);

		cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", ""));
		double resultado = cantidad / valor;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $" + resultado + " en monedas de " + moneda);
	}

	public void ConvertirAPeso(String moneda, Object[][] trade) {

		int valor = buscarValorPorMoneda(trade, moneda);

		cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", ""));
		double resultado = cantidad * valor;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $" + resultado + " en Pesos Argentinos.");
	}

	public void ConvertirFaC(double temperatura) {

		double celcius = Math.round((temperatura - 32) * 5 / 9);
		JOptionPane.showMessageDialog(null,
				"de " + temperatura + " grados fahrenheit a " + celcius + " grados celcius");
	}

	public void ConvertirCaF(double temperatura) {
		double fahrenheit = Math.round(temperatura * 9 / 5 + 32);
		JOptionPane.showMessageDialog(null,
				"de " + temperatura + " grados celcius a " + fahrenheit + " grados fahrenheit");
	}
}
