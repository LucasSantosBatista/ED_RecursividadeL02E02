package view;
import javax.swing.JOptionPane;
import controller.DivisaoController; 

public class Main {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
		
//		System.out.println("Resultado esperado: " + n1%n2);
		
		DivisaoController dCont = new DivisaoController();
		int resultado = dCont.calculaDivisao(n1,n2);
		System.out.println(n1 + " * " + n2 + " = Resto " + resultado);
	}

}
