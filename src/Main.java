import dio.com.br.classes.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição do curso de JS");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de Python");
        curso3.setDescricao("Descrição do curso de Python");
        curso3.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria sobre carreira Java");
        mentoria1.setDescricao("Descrição da mentoria sobre carreira Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria sobre carreira JS");
        mentoria2.setDescricao("Descrição da mentoria sobre carreira JS");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição sobre o Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria2);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor();
        desenvolvedor1.setNome("Renan Laurindo Bezerra");
        desenvolvedor1.inscreverBootcamp(bootcamp1);
        System.out.println(desenvolvedor1);
        System.out.println(desenvolvedor1.getConteudosInscritos());
        System.out.println(desenvolvedor1.getConteudosConcluidos());
        desenvolvedor1.progredir();
        System.out.println("-------");
        System.out.println(desenvolvedor1.getConteudosInscritos());
        System.out.println(desenvolvedor1.getConteudosConcluidos());
        System.out.println("XP: " + desenvolvedor1.calcularTotalXp());
        System.out.println("-------");
        System.out.println(bootcamp1.getDesenvolvedoresInscritos());
        System.out.println(bootcamp1.removerConteudo(curso1));
        System.out.println(bootcamp1.getConteudos());
        System.out.println("--------");
        System.out.println(bootcamp1.removerConteudo(curso2));
        System.out.println(bootcamp1.getConteudos());
    }
}