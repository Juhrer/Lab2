package lab2;

/**
 * Representação de uma conta de laboratório.
 * Toda conta de laboratório possui um nome e uma cota máxima de memória.
 * 
 * @author Lucas Alves Vigolvino
 */
public class ContaLaboratorio {
	/**
	 * Nome do laboratório a que a conta se refere.
	 */
	private String nomeLaboratorio;
	/**
	 * Cota de memória para cada laboratório em mb.
	 */
	private int cota;
	/**
	 * Espaço de memória consumido pela conta.
	 */
	private int espacoConsumido = 0;
	/**
	 * Constrói uma conta de laboratório a partir do nome do laboratório.
	 * Todo laboraório possui por padrão a cota de 2000mb.
	 * 
	 * @param nomeLaboratorio o nome do laboratório
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}
	/**
	 * Constrói uma conta de laboratório a parir do nome do laboratório e da sua cota de memória.
	 * 
	 * @param nomeLaboratorio o nome do laboratório
	 * @param cota a cota de memória do laboratório
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	/**
	 * Adiciona ao total da memória consumida o valor mbytes.
	 * 
	 * @param mbytes o espaço da memória consumido, em mb
	 */
	public void consomeEspaco(int mbytes) {
		espacoConsumido += mbytes;
	}
	/**
	 * Subtrai do total da memória consumida o valor mbytes.
	 * 
	 * @param mbytes o espaço da memória liberado, em mb
	 */
	public void liberaEspaco(int mbytes) {
		espacoConsumido -= mbytes;
	}
	/**
	 * Retorna o resultado do teste que o espaço da memória consumida atingiu a cota, negativo ou positivo.
	 * 
	 * @return a boolean dizendo se o espaço consumido atingiu a cota.
	 */
	public boolean atingiuCota() {
		if(espacoConsumido >= cota) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Retorna a String que representa a conta de laboratório.
	 * A representação segue o formato "Nome do Laboratóio" + "Espaço consumido/Cota do Laboratório".
	 * 
	 * @return a representação em String de uma conta de laboratório.
	 */
	@Override
	public String toString() {
		return nomeLaboratorio + " " + espacoConsumido + "/" + cota;
	}
}
