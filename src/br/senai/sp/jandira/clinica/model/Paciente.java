package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	public String nome;
	public LocalDate dataNascimento;
	private double peso;
	private double altura;
	private double imc;
	public String telefone;
	public boolean estaInternado;
	
	public void setPeso(double peso) {
		
		if(peso >= 40) {
			//true
			this.peso = peso;
		} else {
			//false
			System.out.println("Peso do(a) Paciente" + nome + "está incorreto");
		}
		
		
	} 
	
	public void setAltura(double altura){
		
		if(altura > 0){
			//true
			this.altura = altura;
		} else {
			//false
			System.out.println("Altura do(a) Paciente " + nome + " está incorreto");
		}
		
	}
	
	public void calcularIdade() {
		
	}
	public void calcularImc() {
		imc = peso / Math.pow(altura, 2);
	}
	
	public void classificarImc() {
		
	}

	public void mostrarFichaPaciente() {
		calcularImc();
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + imc);
		System.out.println("Telefone: " + telefone);
		System.out.println("Data nascimento: " + dataNascimento);
		System.out.println("Dia nascimento" + obterDiaSemanaNascimento());
		System.out.println("Internado:" + estaInternado);
		
		System.out.println("--------------------------------");
	}
	
	private String obterDiaSemanaNascimento() {
		String diaSemana = dataNascimento.getDayOfWeek().toString();	
		return diaSemana;
	}
	
}
