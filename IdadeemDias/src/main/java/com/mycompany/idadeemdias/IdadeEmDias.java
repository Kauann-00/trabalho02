//Estrutura sequencial
package com.mycompany.idadeemdias;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();
        
        int totalDias = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("A pessoa viveu aproximadamente " + totalDias + " dias.");
        
        scanner.close();
    }
}
