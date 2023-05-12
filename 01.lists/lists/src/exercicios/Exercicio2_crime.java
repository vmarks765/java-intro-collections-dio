/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/


package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Exercicio2_crime {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        List<String> perguntas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String pergunta1 = "1 - Telefonou para a vítima (S/N)?  ";
        String pergunta2 = "2 - Esteve no local do crime (S/N)?  ";
        String pergunta3 = "3 - Mora próximo da vítima (S/N)?  ";
        String pergunta4 = "4 - Devia dinheiro para a vítima (S/N)?  ";
        String pergunta5 = "5 - Já trabalhou com a vítima (S/N)?  ";

        perguntas = List.of(pergunta1, pergunta2, pergunta3, pergunta4, pergunta5);

        int cont = 0;

        Iterator<String> iterator = perguntas.iterator();

        while(iterator.hasNext()){
            String pergunta = iterator.next();
            System.out.print(pergunta);
            String resposta = sc.next().toUpperCase();
            while(!(resposta.equals("S") || resposta.equals("N"))){
                System.out.println("Resposta inválida!");
                System.out.println(pergunta);
                resposta = sc.next().toUpperCase();
            }
            respostas.add(resposta);
            if(resposta.equals("S")) cont++;
        }

        System.out.println("\nRespostas:  " + respostas);
        System.out.println();

        switch (cont){
            case 1:
            case 2:
                System.out.println("Você é SUSPEITO.");
                break;
            case 3:
                System.out.println("Você é CÚMPLICE.");
                break;
            case 4:
                System.out.println("Você é CÚMPLICE.");
                break;
            case 5:
                System.out.println("Você é ASSASSINO.");
                break;
            default:
                System.out.println("Você é INOCENTE.");
                break;
        }
    }
}
