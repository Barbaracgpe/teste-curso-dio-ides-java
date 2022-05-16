package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProjeto {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        livro Livro = new livro(nome: "O problema dos 3 corpos", numPaginas:300);
        System.out.println(Livro);

       /*int a = 5;
       int b = 3;

        System.out.println("Hello World! " + (a+b));*/
    }
}
class livro{
    private String nome;
    private String numPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }

    public livro(String nome, String numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;


    }
}