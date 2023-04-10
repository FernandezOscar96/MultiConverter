import javax.swing.JOptionPane;

public class Datos extends Convertir {

	public double cantidad;
	public String seleccion, seleccion2;

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
		switch (seleccion) {
		case "peso - dolar":
			ConvertirMonedaDolares(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "peso - euro":
			ConvertirMonedaEuro(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "dolar - peso":
			ConvertirMonedaPesoD(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		case "euro - peso":
			ConvertirMonedaPesoE(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ", "")));
			break;
		default:
			break;
		}

	}

	public void setSeleccion2(String seleccion2) {
		this.seleccion2 = seleccion2;
		if (seleccion2 == "Fahrenheit a Celsius") {
			ConvertirFaC(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese la temperatura a convertir: ", "")));
		} else {
			ConvertirCaF(cantidad = Double
					.parseDouble(JOptionPane.showInputDialog(null, "ingrese la temperatura a convertir: ", "")));
		}
	}

}
