import javax.swing.JOptionPane;

public class ConvertirMoneda {

	public void ConvertirMonedaDolares(double valor) {
		double monedaDolar = valor / 390.00;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " dolares.");
	}

	public void ConvertirMonedaEuro(double valor) {
		double monedaEuro = valor / 390.00;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " dolares.");
	}

}
