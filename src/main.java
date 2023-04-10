import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		Datos datos = new Datos();

		boolean flag = true;

		while (flag) {
			String opciones = (String) (JOptionPane.showInputDialog(null, "seleccione una opcion", "menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "conversor de monedas", "conversor de temperatura" }, "seleccion"));
			switch (opciones) {
			case "conversor de monedas":
				String input = (String) (JOptionPane.showInputDialog(null,
						"seleccione a que tipo de moneda desea convertir: ", "monedas", JOptionPane.QUESTION_MESSAGE,
						null, new Object[] { "peso - dolar", "peso - euro", "dolar - peso", "euro - peso" },
						"seleccion"));
				datos.setSeleccion(input);
				break;
			case "conversor de temperatura":
				String input2 = (String) (JOptionPane.showInputDialog(null, "seleccione a que tipo desea convertir: ",
						"temperatura", JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Fahrenheit a Celsius", "Celsius a Fahrenheit" }, "seleccion"));
				datos.setSeleccion2(input2);
				break;
			default:
				break;

			}
		}

	}

}
