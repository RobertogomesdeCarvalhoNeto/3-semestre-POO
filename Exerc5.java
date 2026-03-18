//Implemente métodos para calcular o salário líquido, considerando descontos de impostos e benefícios.

import java.util.Scanner;

public class Exerc5{
    public static void main(String[] args){

        double INSS = 6.79;
        double VT = 58.20;

        //pega e armazena o salário
        Scanner teclado = new Scanner(System.in);
        System.out.println("seu salário bruto: ");
        int salarioBruto = teclado.nextInt();

        //cálculo do INSS
         double salarioLiquido = salarioBruto * (1 - INSS /100.0);

        System.out.printf("Seu salário liquido é: %.2f\n", salarioLiquido - VT);

        teclado.close();
    }
}