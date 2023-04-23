package com.conversor.conversor;

import javax.swing.JOptionPane;


public class ConversorMoneda {
//de peso a:
	public void ConvertirDolar(double valor) {
		double monedaDolar = valor / 389;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " dolares.");
	}

	public void ConvertirEuro(double valor) {
		double monedaEuro = valor / 392;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " euros.");
	}

	public void Convertirlibra(double valor) {
		double monedaEuro = valor / 262;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " libras esterlinas.");
	}

	public void ConvertirYen(double valor) {
		double monedaEuro = valor / 1.58;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " yenes.");
	}

	public void ConvertirWon(double valor) {
		double monedaEuro = valor / 0.15;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " won.");
	}

// de x moneda a peso
	public void ConvertirPesoD(double valor) {
		double monedaPeso = valor * 389;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPeso + " en Pesos Argentinos.");
	}

	public void ConvertirPesoE(double valor) {
		double monedaPeso = valor * 392;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPeso + " en Pesos Argentinos.");
	}

	public void ConvertirPesoL(double valor) {
		double monedaPeso = valor * 262;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPeso + " en Pesos Argentinos.");
	}

	public void ConvertirPesoY(double valor) {
		double monedaPeso = valor * 1.58;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPeso + " en Pesos Argentinos.");
	}

	public void ConvertirPesoW(double valor) {
		double monedaPeso = valor * 0.15;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPeso + " en Pesos Argentinos.");
	}

//cambios de temperatura

}
