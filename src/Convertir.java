import javax.swing.JOptionPane;

public class Convertir {
//de peso a:
	public void ConvertirMonedaDolares(double valor) {
		double monedaDolar = valor / 389;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " dolares.");
	}
	public void ConvertirMonedaEuro(double valor) {
		double monedaEuro = valor / 392;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " euros.");
	}
	public void ConvertirMonedalibra(double valor) {
		double monedaEuro = valor / 262;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " libras esterlinas.");
	}
	
	public void ConvertirMonedayen(double valor) {
		double monedaEuro = valor / 1.58;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " yenes.");
	}
	public void ConvertirMonedawon(double valor) {
		double monedaEuro = valor / 0.15;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " won.");
	}
// de x moneda a peso
	public void ConvertirMonedaPesoD(double valor) {
		double monedaPeso = valor * 389;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPeso + " en Pesos Argentinos.");
	}
	public void ConvertirMonedaPesoE(double valor) {
		double monedaPeso = valor * 392;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPeso + " en Pesos Argentinos.");
	}
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
