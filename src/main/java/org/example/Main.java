package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Bir sayı girin: ");
        int num = scanner.nextInt();

        double sum = 0;
        int counter =0;

        for (int i = 0; i <= num; i++) {
            if((i%3 == 0) && (i%4 == 0)){
                sum+=i;
                counter++;
            }
        }

        if(counter>0){
            double avg=sum/counter;
            System.out.println(num + " sayısına kadar 3 ve 4'e tam bölünebilen "  + counter + " sayı vardır. Bu sayıların ortalaması: "+ avg);
        }else {
            System.out.println("3 ve 4'e tam bölünebilen sayı bulunamadı...");
        }
    }
}