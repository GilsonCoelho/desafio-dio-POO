package br.com.gsc.desafio;

import br.com.gsc.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

     //   System.out.println(curso1);
     //   System.out.println(curso2);
      //  System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGilson = new Dev();
        devGilson.setNome("Gilson");
        devGilson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gilson" + devGilson.getConteudosInscritos());
        devGilson.progradir();
        devGilson.progradir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Gilson" + devGilson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gilson" + devGilson.getConteudosConcluidos());
        System.out.println("XP: " + devGilson.calcularTotalXp());

        System.out.println("----------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progradir();
        devCamila.progradir();
        devCamila.progradir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
