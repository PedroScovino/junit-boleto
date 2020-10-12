package tdd_processador_boleto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProcessadorBoletoTest {

	Boleto boleto;
	
	@BeforeEach
	public void inicializaBoleto() {
		boleto = new Boleto(1, "12/10/2020", 50.00);
	}
}
