package tdd_processador_boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessadorBoletoTest {

	Boleto boleto;
	
	@BeforeEach
	public void inicializaBoleto() {
		boleto = new Boleto(1, "12/10/2020", 50.00);
	}
	
	@Test
	public void verificaInformaçõesBoleto() {
		Assertions.assertAll("boleto",
				() -> assertEquals(1, boleto.getCodBoleto()),
				() -> assertEquals("12/10/2020", boleto.getData()),
				() -> assertEquals(50.00, boleto.getValor())
				);
	}
}
