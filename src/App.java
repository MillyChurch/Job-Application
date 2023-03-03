//Autor: Ian dos Santos Silva
//Data: 03/03/2033
/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
*/


import java.util.Scanner;

public class App {

    public static String receberString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja");
        return input.nextLine();
    }

    public static String trocarLetras(String palavra){

        int i,j, tamanho = palavra.length();
        String palavraInversa = "";
        char[] palavraEmVetor = new char[tamanho], palavraInversaEmVetor = new char[tamanho];

        //Primeiramente estou transformando a String em um vetor de chars
        for(i=0; i<tamanho; i++){
            palavraEmVetor[i] = palavra.charAt(i);
        }
        //Depois vou copiar esse vetor de chars para outro vetor, com o mesmo tamanho de caracteres (tamano-1 pois representa o índice 0), porém a ordem inversa de elementos
        for(i=0, j=tamanho-1; i<tamanho; i++, j--){
            palavraInversaEmVetor[i] = palavraEmVetor[j];
        }
        //Agora, por fim, eu irei concatenar todos os membros do vetor inverso de chars em uma string
        for(i=0; i<tamanho; i++){
            palavraInversa += palavraInversaEmVetor[i]; 
        }
        return palavraInversa;
    }

    public static void exibirInverso(String palavra) {
        System.out.println("Sua palavra inicial era: " + palavra);
        System.out.println("Sua palavra inicial era: " + trocarLetras(palavra));
    }

    public static void main(String[] args) throws Exception {
        String palavra;

        //Coletar a palavra
        palavra = receberString();
        //Exibir as letras alteradas
        exibirInverso(palavra);
    }
}
