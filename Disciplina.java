package lab2;

import java.util.Arrays;

/**
 * Representação de uma disciplina.
 * Toda disciplina precisa de um nome.
 * 
 * @author Lucas Alves Vigolvino
 */
public class Disciplina {
	/**
	 * Nome da disciplina.
	 */
	private String nomeDisciplina;
	/**
	 * Total das horas de estudo acumuladas para disciplina.
	 */
	private int totalHoras = 0;
	/**
	 * Lista das notas tiradas na disciplina.
	 */
	private double[] notas = new double[4];
	/**
	 * Constrói uma disciplina a partir do nome da disciplina.
	 * 
	 * @param nomeDisciplina o nome da disciplina
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	/**
	 * Adiciona ao total de horas estudadas para a disciplina as novas horas de estudo cadastradas.
	 * 
	 * @param horas as horas de estudo cadastradas para a disciplina
	 */
	public void cadastraHoras(int horas) {
		totalHoras += horas;
	}
	/**
	 * Adiciona a nota tirada na avaliação ao array de notas, na posição requerida.
	 * 
	 * @param nota o número da avaliação que está sendo cadastrada
	 * @param valorNota a nota tirada na avaliação que está sendo cadastrada
	 */
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
	}
	/**
	 * Retorna o resultado do teste que o aluno está com a média das notas maior ou igual a 7, negativo ou positivo.
	 * 
	 * @return a boolean dizendo se o aluno foi aprovado.
	 */
	public boolean aprovado() {
		if(calculaMedia() >= 7.0) {
			return true;
		} else {
			return false;
		}
	}
	private double calculaMedia() {
		double soma = 0;
		for(i = 0; i < 4; i++) {
			soma += notas[i];
		}
		return soma / 4;
	}
	
	/**
	 * Retorna a String que representa a disciplina.
	 * A representação segue o formato "Nome da Disciplina " + "total de horas estudadas " + "Média do Aluno " + "Lista das Notas Tiradas".
	 * 
	 * @return a representação em String de uma disciplina.
	 */
	public String toString() {
		return nomeDisciplina + " " + totalHoras + " " + calculaMedia() + " " + Arrays.toString(notas); 
	}
}
