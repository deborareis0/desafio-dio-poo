import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.util.ArrayList;

class Curso {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso ();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>(); /*polimorfismo*/
        /*td que tem em list, tem em array list mas nao o contrario*/


        Mentoria mentoria = new mentoria ();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.setConteudos().add(curso1);
        bootcamp.setConteudos().add(curso2);
        bootcamp.setConteudos().add(mentoria);

        Dev devDebora = new Dev();
        devDebora.setNome("Debora");

        Dev devCamila = new Dev();
        devCamila.setNome();
    }
}