package tdd_processador_boleto;

public class ProcessadorBoleto {

	public String processaPagamento(ListaBoleto boletos, Fatura fatura){
		String pagamento = null;
		if (boletos.getValorTotal()>=fatura.getValor()) {
			pagamento = "PAGO";			
		} else {
			pagamento = "NÃO PAGO";
		}
		return pagamento;
	}	
}
