package tdd_processador_boleto;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaBoleto {

	private ArrayList boletos;
	
	public ListaBoleto() {
		boletos = new ArrayList();
	}
	
	public double getValorTotal() {
		double valorTotal = 0.0;
		
		for (Iterator i = boletos.iterator(); i.hasNext();) {
			Boleto boleto = (Boleto) i.next();
			valorTotal += boleto.getValor();
		}
		
		return valorTotal;
	}
	
	public void addItem(Boleto boleto) {
		boletos.add(boleto);
	}

}
