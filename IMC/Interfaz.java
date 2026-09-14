import javax.swing.*;

public class Interfaz {
    public static void main (String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
      
        String StringPeso = JOptionPane.showInputDialog("Digite su peso");
        float peso = Float.parseFloat(StringPeso);
        
        String StringAltura = JOptionPane.showInputDialog("Digites su altura");
        float altura = Float.parseFloat(StringAltura);
        
        Matematico m1 = new Matematico();
        
        JOptionPane.showMessageDialog(null, m1.calculo_imc(peso, altura));
    }
}