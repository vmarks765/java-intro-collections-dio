package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
class Exercicio1_temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        int cont = 0;
        while(cont < 6){
            System.out.print("Digite a temperatura nº " + (cont + 1) + ":  ");
            double temp1 = sc.nextDouble();
            temperaturas.add(temp1);
            cont++;
        }
        System.out.println("\nTemperaturas médias dos primeiros 6 meses do ano:  ");
        System.out.println(temperaturas);

        Iterator<Double> iterator1 = temperaturas.iterator();
        Double soma = 0d;
        while(iterator1.hasNext()){
            Double next1 = iterator1.next();
            soma += next1;
        }
        Double media = soma/ temperaturas.size();
        System.out.printf("\nA temperatura média nesses 6 meses foi: %.1fºC.", media);
        System.out.println();

        System.out.println("\nAs temperaturas acima da média em:");

        Iterator<Double> iterator2 = temperaturas.iterator();
        while(iterator2.hasNext()){
            Double temp2 = iterator2.next();
            if(temp2 > media) {
                int mes = temperaturas.indexOf(temp2);
                switch (mes){
                    case 0:
                        System.out.println((mes + 1) + " - Janeiro:  " + temp2 + "ºC.");
                        continue;
                    case 1:
                        System.out.println((mes + 1) + " - Fevereiro:  " + temp2 + "ºC.");
                        continue;
                    case 2:
                        System.out.println((mes + 1) + " - Março:  " + temp2 + "ºC.");
                        continue;
                    case 3:
                        System.out.println((mes + 1) + " - Abril:  " + temp2 + "ºC.");
                        continue;
                    case 4:
                        System.out.println((mes + 1) + " - Maio:  " + temp2 + "ºC.");
                        continue;
                    case 5:
                        System.out.println((mes + 1) + " - Junho:  " + temp2 + "ºC.");
                        continue;
                    default:
                        System.out.println("Indefinido");
                }
            }
        }
    }
}
