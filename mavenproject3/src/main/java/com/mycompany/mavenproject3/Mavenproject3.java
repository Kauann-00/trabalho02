// Questão 7: Estrutura de sequencia

package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
        
        scanner.close();
    }
}