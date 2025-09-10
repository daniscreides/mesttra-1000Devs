//Exercício 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado.

import java.util.Scanner;

public class MetroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float largura;
        float comprimento;
        float area;

        System.out.print("Digite a largura do terreno em metros: ");
        largura = scanner.nextFloat();

        System.out.print("Digite o comprimento do terreno em metros: ");
        comprimento = scanner.nextFloat();

        area = largura * comprimento;

        System.out.print("A área do terreno é: " + area + " metros quadrados");


        scanner.close();
    }
}