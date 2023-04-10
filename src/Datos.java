import javax.swing.JOptionPane;

public class Datos extends ConvertirMoneda{
	
	public double cantidad;
	public String seleccion;
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
		if(seleccion=="peso - dolar"){
			ConvertirMonedaDolares(cantidad=Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ","")));
		}else {
			ConvertirMonedaEuro(cantidad=Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto a convertir: ","")));
		}
		
	}
	
	
	

}
