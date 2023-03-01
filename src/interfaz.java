import sistema.interno.SistemaInterno;

import javax.swing.*;

public class interfaz extends SistemaInterno {
    public static void main(String[] args) {

        String num = "";
        String Prueba = "ingrese un numero por favor";


        num = num + JOptionPane.showInputDialog(Prueba, num);

        int result = Integer.parseInt(num);
        result = result * 356;
        JOptionPane.showMessageDialog(null, result);


    }
}
