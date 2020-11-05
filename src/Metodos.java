public class Metodos {

    //sem parametros
    protected void calcularASomaDeDoisNumeros() {
        int num1= 4, num2 = 6;
        int soma = num1+num2;
        System.out.println("soma= " + soma);
    }

    String retornarString() {
        return "Retornou uma String";
    }

    int retornaInt() {
        return 10;
    }

    //parametros
    void somarNumeros(int num1, int num2) {
        int soma = num1 + num2;
        System.out.println("Soma de dois numeros " + soma);
    }

    int somarNumerosInt(int num1, int num2) {
        return num1 + num2;
    }

    String retornarLetras(String letra) {
        return letra;
    }

    int tamanhoString(String palavra) {
        return palavra.length();
    }


}
