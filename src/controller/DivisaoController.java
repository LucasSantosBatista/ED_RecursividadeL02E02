package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int calculaDivisao(int n1, int n2) {
		//Condi��o de parada: dividendo � menor que o divisor
		if (n1 < n2) {
			return n1;
		} else {
			return calculaDivisao(n1 - n2, n2);
		}
	}
}
