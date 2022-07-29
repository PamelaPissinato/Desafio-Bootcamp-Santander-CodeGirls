package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main (String[]args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso de programação em Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Curso de programação em JS");
		curso2.setCargaHoraria(5);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria de programação em Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devPamela = new Dev();
		devPamela.setNome("Pamela");
		devPamela.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devPamela.getConteudosInscritos());
		devPamela.progredir();
		System.out.println("---");
		System.out.println("Conteúdos inscritos" + devPamela.getConteudosInscritos());
		System.out.println("Conteúdos concluídos" + devPamela.getConteudosConcluidos());
		System.out.println("XP: " + devPamela.calcularTotalXP());
		
		System.out.println("-----------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("---");
		System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXP());

		}
}
