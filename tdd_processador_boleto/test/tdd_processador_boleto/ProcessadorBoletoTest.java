package tdd_processador_boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessadorBoletoTest {

	Boleto boleto;
	Boleto boleto2;
	ListaBoleto listaBoleto;
	Fatura fatura;
	ProcessadorBoleto processador;
	
	@BeforeEach
	public void inicializaBoleto() {
		boleto = new Boleto(1, "12/10/2020", 225.00);
		boleto2 = new Boleto(2, "12/10/2020", 500.00);
	}
	
	@BeforeEach
	public void inicializaListaBoleto() {
		listaBoleto = new ListaBoleto();
	}
	
	@BeforeEach
	public void inicializaFatura() {
		fatura = new Fatura("Pedro", "12/10/2020", 600.00);	
	}

	@BeforeEach
	public void inicializaProcessadorBoleto() {
		processador = new ProcessadorBoleto();
			
	@Test
	public void verificaInformaçõesBoleto() {
		Assertions.assertAll("boleto",
				() -> assertEquals(1, boleto.getCodBoleto()),
				() -> assertEquals("12/10/2020", boleto.getData()),
				() -> assertEquals(225.00, boleto.getValor())
				);
	}
	
	@Test
	public void verificaValorTotal() {
		listaBoleto.addItem(boleto);
		listaBoleto.addItem(boleto2);
		double valor = listaBoleto.getValorTotal();
		Assertions.assertEquals(725.00, valor);
	}
	

	@Test
	public void verificaInformaçõesFatura() {
		Assertions.assertAll("fatura",
				() -> assertEquals("Pedro", fatura.getNome()),
				() -> assertEquals("12/10/2020", fatura.getData()),
				() -> assertEquals(600.00, fatura.getValor())
				);
	}
	
	@Test
	public void verificaPagamento() {
		String pagamento = processador.validaPagamento();
		Assertions.assertEquals("PAGO", pagamento);
	}
}