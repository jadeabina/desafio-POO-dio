import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


       Mentoria mentoria =  new Mentoria();
       mentoria.setTitulo("mentoria java");
       mentoria.setDescricao("descrição mentoria java ");
       mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJade = new Dev();
        devJade.setNome("jade");
        devJade.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos jade"+devJade.getConteudosInscritos());
        devJade.progredir();
        devJade.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos jade"+devJade.getConteudosInscritos());
        System.out.println("Conteudos concluidos jade"+devJade.getConteudosConcluidos());
        System.out.println("XP:"+devJade.calcularTatalXP());


        System.out.println("-------");





    }
}
