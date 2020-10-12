package tdd_processador_boleto;

public class Fatura {

	private String nome;
	private String data;
	private double valor;
	
	public Fatura(String nome, String data, double valor){
		super();
		this.nome = nome;
		this.data = data;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
