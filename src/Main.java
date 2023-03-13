import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("curso Java");
        curso.setDescricao(" descrição do curso");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}