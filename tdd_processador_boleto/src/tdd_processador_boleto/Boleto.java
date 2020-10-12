package tdd_processador_boleto;

public class Boleto {


	private int codBoleto;
	private String data;
	private double valor;
	
	public Boleto(int codigo, String data, double valor){
		super();
		this.codBoleto = codigo;
		this.data = data;
		this.valor = valor;
	}

	public int getCodBoleto() {
		return codBoleto;
	}

	public void setCodBoleto(int codBoleto) {
		this.codBoleto = codBoleto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
