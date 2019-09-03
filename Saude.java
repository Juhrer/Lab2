package lab2;

/**
 * Representaação da saúde geral de um estudante.
 * 
 * @author Lucas Alves Vigolvino
 */
public class Saude {
	/**
	 * Saúde mental do aluno.
	 * Por padrão, boa.
	 */
	private String saudeMental = "boa";
	/**
	 * Saúde física do aluno.
	 * Por padrão, boa.
	 */
	private String saudeFisica = "boa";
	/**
	 * Status cadastrado da saúde mental do aluno.
	 * 
	 * @param valor o status da saúde mental do aluno
	 */
	public void defineSaudeMental(String valor) {
		saudeMental = valor;
	}
	/**
	 * Status cadastrado da saúde física do aluno.
	 * 
	 * @param valor o status da saúde física do aluno
	 */
	public void defineSaudeFisica(String valor) {
		saudeFisica = valor;
	}
	/**
	 * Retorna o status geral da saúde do aluno, baseado na sua saúde física e mental.
	 * 
	 * @return o status da saúde geral do aluno.
	 */
	public String getStatusGeral() {
		if(saudeMental == "boa" && saudeFisica == "boa") {
			return "boa";
		} else if(saudeMental == "boa" || saudeFisica == "boa") {
			return "ok";
		} else {
			return "fraca";
		}
	}
}
