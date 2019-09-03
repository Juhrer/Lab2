package lab2;

/**
 * Representação de uma conta de cantina.
 * Toda conta de cantina precisa de um nome.
 * 
 * @author Lucas Alves Vigolvino
 */
public class ContaCantina {
	/**
	 * Nome da cantina a que a conta se refere.
	 */
	private String nomeDaCantina;
	/**
	 * Quantidade de itens comprados.
	 */
	private int qtsItens;
	/** 
	 * Valor total da conta, em centavos.
	 */
	private int total;
	/**
	 * Valor que falta pagar da conta, em centavos.
	 */
	private int débito = 0;
	/**
	 * Costrói uma conta de cantina a partir do seu nome.
	 * 
	 * @param nomeDaCantina o nome da cantina
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	/**
	 * Adiciona o valor da compra no valor total da conta e a quantidade de itens no total de itens na conta.
	 * 
	 * @param qtdItens a quatidade de itens comprados
	 * @param valorCentavos o valor da compra, dado em centavos
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtsItens += qtdItens;
		this.total += valorCentavos;
		this.debito += valorCentavos;
	}
	/**
	 * Adiciona o valor pago na variável pago.
	 * 
	 * @param valorCentavos o valor da conta pago
	 */
	public void pagaConta(int valorCentavos) {
		this.debito -= valorCentavos;
	}
	/**
	 * Retorna o valor total da conta menos o que foi pago.
	 * 
	 * @return o valor que falta pagar da conta.
	 */
	public int getFaltaPagar() {
		return this.debito;
	}
	/**
	 * Retorna a String que representa uma conta de cantina.
	 * A representação segue o formato "Nome da Cantina Quantidade " + "Total de Itens Valor " + "Total"
	 * 
	 * @return a representação em String de uma conta de cantina.
	 */
	@Override
	public String toString() {
		return nomeDaCantina + " " + qtsItens + " " + total;
	}
}
