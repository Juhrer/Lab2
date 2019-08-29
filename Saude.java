package lab2;

/**
 * Representaa��o da sa�de geral de um estudante.
 * 
 * @author Lucas Alves Vigolvino
 */
public class Saude {
	/**
	 * Sa�de mental do aluno.
	 * Por padr�o, boa.
	 */
	private String saudeMental = "boa";
	/**
	 * Sa�de f�sica do aluno.
	 * Por padr�o, boa.
	 */
	private String saudeFisica = "boa";
	/**
	 * Status cadastrado da sa�de mental do aluno.
	 * 
	 * @param valor o status da sa�de mental do aluno
	 */
	public void defineSaudeMental(String valor) {
		SaudeMental = valor;
	}
	/**
	 * Status cadastrado da sa�de f�sica do aluno.
	 * 
	 * @param valor o status da sa�de f�sica do aluno
	 */
	public void defineSaudeFisica(String valor) {
		SaudeFisica = valor;
	}
	/**
	 * Retorna o status geral da sa�de do aluno, baseado na sua sa�de f�sica e mental.
	 * 
	 * @return o status da sa�de geral do aluno.
	 */
	public String getStatusGeral() {
		if(SaudeMental == "boa" && SaudeFisica == "boa") {
			return "boa";
		} else if(SaudeMental == "boa" || SaudeFisica == "boa") {
			return "ok";
		} else {
			return "fraca";
		}
	}
}