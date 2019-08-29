package lab2;

/**
 * Representa��o de uma conta de laborat�rio.
 * Toda conta de laborat�rio possui um nome e uma cota m�xima de mem�ria.
 * 
 * @author Lucas Alves Vigolvino
 */
public class ContaLaboratorio {
	/**
	 * Nome do laborat�rio a que a conta se refere.
	 */
	private String nomeLaboratorio;
	/**
	 * Cota de mem�ria para cada laborat�rio em mb.
	 * Por padr�o, 2000mb.
	 */
	private int cota;
	/**
	 * Espa�o de mem�ria consumido pela conta.
	 */
	private int espacoConsumido = 0;
	/**
	 * Constr�i uma conta de laborat�rio a partir do nome do laborat�rio.
	 * Todo laborat�rio possui por padr�o a cota de 2000mb.
	 * 
	 * @param nomeLaboratorio o nome do laborat�rio
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}
	/**
	 * Constr�i uma conta de laborat�rio a parir do nome do laborat�rio e da sua cota de mem�ria.
	 * 
	 * @param nomeLaboratorio o nome do laborat�rio
	 * @param cota a cota de mem�ria do laborat�rio
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	/**
	 * Adiciona ao total da mem�ria consumida o valor mbytes.
	 * 
	 * @param mbytes o espa�o da mem�ria consumido, em mb
	 */
	public void consomeEspaco(int mbytes) {
		espacoConsumido += mbytes;
	}
	/**
	 * Subtrai do total da mem�ria consumida o valor mbytes.
	 * 
	 * @param mbytes o espa�o da mem�ria liberado, em mb
	 */
	public void liberaEspaco(int mbytes) {
		espacoConsumido -= mbytes;
	}
	/**
	 * Retorna o resultado do teste que o espa�o da mem�ria consumida atingiu a cota, negativo ou positivo.
	 * 
	 * @return a boolean dizendo se o espa�o consumido atingiu a cota.
	 */
	public boolean atingiuCota() {
		if(espacoConsumido >= cota) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Retorna a String que representa a conta de laborat�rio.
	 * A representa��o segue o formato "Nome do Laborat�io" + "Espa�o consumido/Cota do Laborat�rio".
	 * 
	 * @return a representa��o em String de uma conta de laborat�rio.
	 */
	@Override
	public String toString() {
		return nomeLaboratorio + " " + espacoConsumido + "/" + cota;
	}
}