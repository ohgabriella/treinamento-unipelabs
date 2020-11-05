public class Main {

    public static void main(String[] args) {

        Metodos metodos = new Metodos();

//        metodos.calcularASomaDeDoisNumeros();
//        String valorMetodo = metodos.retornarString();
//        int inteiro = metodos.retornaInt();

        //com parametros
        metodos.somarNumeros(10, 10);
        int somarNum = metodos.somarNumerosInt(10, 20);
        String letra =  metodos.retornarLetras("L");

        int tamanhoPalavra = metodos.tamanhoString("gabriella");


        System.out.println("valor metodo " + somarNum);
        System.out.println("retornar letra " + letra);
        System.out.println("tamanho palavra " + tamanhoPalavra);

//        System.out.println("valor metodo " + valorMetodo);
//        System.out.println("valor metodo " + inteiro);



    }

}