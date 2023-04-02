import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		Datos datos = new Datos();

		boolean flag = true;

		while (flag) {
			String opciones = (JOptionPane
					.showInputDialog(null, "seleccione una opcion", "menu", JOptionPane.QUESTION_MESSAGE, null,
							new Object[] { "Conversor de monedas", "conversor de temperatura" }, "seleccion")
					.toString());
			
			switch (opciones) {
			case "conversor de monedas": 
				String input=JOptionPane.showInputDialog("ingrese la cantida de dinero que deseas convertir: ");
			default:
				throw new IllegalArgumentException("Unexpected value: " + opciones);
			}
		}

	}

}
