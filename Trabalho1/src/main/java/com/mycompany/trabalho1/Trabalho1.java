// Estrutura sequencial

package com.mycompany.trabalho1;

import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
        
        scanner.close();
    }
}