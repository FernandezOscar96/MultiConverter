package com.conversor.datos;

import javax.swing.JOptionPane;

import com.conversor.conversor.ConversorMoneda;
import com.conversor.conversor.ConversorTemp;

public class Datos {

	public double cantidad;
	public String seleccion, seleccion2;
	ConversorMoneda moneda = new ConversorMoneda();
	ConversorTemp temperatura = new ConversorTemp();

	public void Datod(double cantidad, String seleccion, String seleccion2) {
		this.cantidad = cantidad;
		this.seleccion = seleccion;
		this.seleccion2 = seleccion2;

	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
		switch (seleccion) {
		case "peso - dolar":
			moneda.ConvertirDolar(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "peso - euro":
			moneda.ConvertirEuro(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "peso - libra":
			moneda.Convertirlibra(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "peso - yen":
			moneda.ConvertirYen(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "peso - won":
			moneda.ConvertirWon(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "dolar - peso":
			moneda.ConvertirPesoD(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "euro - peso":
			moneda.ConvertirPesoE(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "libra - peso":
			moneda.ConvertirPesoL(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "yuan - peso":
			moneda.ConvertirPesoY(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "won - peso":
			moneda.ConvertirPesoW(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		default:
			break;
		}

	}

	public void setSeleccion2(String seleccion2) {
		this.seleccion2 = seleccion2;
		if (seleccion2 == "Fahrenheit a Celsius") {
			temperatura.ConvertirFaC(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese la temperatura a convertir: ", "")));
		} else {
			temperatura.ConvertirCaF(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese la temperatura a convertir: ", "")));
		}
	}

}
