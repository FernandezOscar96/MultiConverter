package com.conversor.datos;

import javax.swing.JOptionPane;

import com.conversor.conversor.Conversor;

public class Datos {

	public String seleccion, seleccion2;
	Conversor trade = new Conversor();
	Monedas moneda = new Monedas();

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
		switch (seleccion) {
		case "peso - dolar":
			trade.PesoAConvertir("dolar", moneda.getMonedas());
			break;
		case "peso - euro":
			trade.PesoAConvertir("euro", moneda.getMonedas());
			break;
		case "peso - libra":
			trade.PesoAConvertir("libra", moneda.getMonedas());
			break;
		case "peso - yen":
			trade.PesoAConvertir("yen", moneda.getMonedas());
			break;
		case "peso - won":
			trade.PesoAConvertir("won", moneda.getMonedas());
			break;
		case "dolar - peso":
			trade.ConvertirAPeso("dolar", moneda.getMonedas());
			break;
		case "euro - peso":
			trade.ConvertirAPeso("euro", moneda.getMonedas());
			break;
		case "libra - peso":
			trade.ConvertirAPeso("libra", moneda.getMonedas());
			break;
		case "yuan - peso":
			trade.ConvertirAPeso("yuan", moneda.getMonedas());
			break;
		case "won - peso":
			trade.ConvertirAPeso("won", moneda.getMonedas());
			break;
		default:
			break;
		}

	}

	public void setSeleccion2(String seleccion2) {
		this.seleccion2 = seleccion2;
		if (seleccion2 == "Fahrenheit a Celsius") {
			double temp = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese la temperatura a convertir: ", ""));
			trade.ConvertirFaC(temp);
		} else {
			double temp = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese la temperatura a convertir: ", ""));
			trade.ConvertirCaF(temp);
		}
	}
}
