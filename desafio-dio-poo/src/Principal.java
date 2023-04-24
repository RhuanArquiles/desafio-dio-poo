import br.com.dio.desafio.dominio.Curso;

public class Principal {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("Descrição curso Js");
        curso1.setCargaHoraria(4);
        System.out.println(curso2);

    }
}
