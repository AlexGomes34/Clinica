/*
 * Desenvolvido por Alex
 * EMPRESA: SENAI
 * Data 19-02-2025
 */
package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {

		// Criação dos objetos tipo paciente
		Paciente p1 = new Paciente();
		p1.nome = "Jaime";
		p1.altura = 1.94;
		p1.peso = 68.200;
		p1.telefone = "(11)8002-8922";
		p1.dataNascimento = LocalDate.of(2003, 07, 15);
		p1.estaInternado = true;
		
		Paciente p2 = new Paciente();
		p2.nome = "Alex";
		p2.altura = 1.77;
		p2.peso = 82.200;
		p2.telefone = "(11)94516-3316";
		p2.dataNascimento = LocalDate.of(2008, 12, 23);
		p2.estaInternado = false;
		
		// Mostrar dados do paciente 1
		p1.mostrarFichaPaciente();
		p2.mostrarFichaPaciente();
		
	}

}
