
package aula1;

public class TesteAluno {

    // instância de métodos  e atributos//
    public static void main(String[] args) {
        Aluno alu1 = new Aluno();
        Aluno alu2 = new Aluno();
        Aluno alu3 = new Aluno();

        // input de dados nos atributos //
        alu1.nome = "Joao do Feijao";
        alu1.n1 = 7.0;
        alu1.n2 = 8.0;
        alu1.calcMedia(); // calculo media

        alu2.nome = "Maria";
        alu2.n1 = 5.0;
        alu2.n2 = 6.0;
        alu2.calcMedia(); // calculo media

        alu3.nome = "Joana";
        alu3.n1 = 9.0;
        alu3.n2 = 3.0;
        alu3.calcMedia(); // calculo media

        // impressão dos resultados //
        System.out.println("O nome: " + alu1.nome);
        System.out.println("A média: " + alu1.media);
        System.out.println("O status: " + alu1.status);

        System.out.println("O nome: " + alu2.nome);
        System.out.println("A média: " + alu2.media);
        System.out.println("O status: " + alu2.status);

        System.out.println("O nome: " + alu3.nome);
        System.out.println("A média: " + alu3.media);
        System.out.println("O status: " + alu3.status);
    }
}

class Aluno {
    String nome;
    double n1, n2, media;
    String status;

    //metodo para calcular a media e classificar o status//
    void calcMedia() {
        media = (n1 + n2) / 2;
        if (media >= 7) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
    }
}
