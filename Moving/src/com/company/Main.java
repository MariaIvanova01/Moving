package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();
        int l = scan.nextInt();
        int h = scan.nextInt();
        int space = w * l * h;
        scan.nextLine();
        String input;
        int count = 0;
        int fullSpace = 0;
        while (true){
            input = scan.nextLine();
            if (input.equals("Done")){
                break;
            }
            count = Integer.parseInt(input);
            fullSpace += count;
            if (fullSpace > space){
                break;
            }

        }
        if (input.equals("Done")){
            space -= fullSpace;
            System.out.printf("%d Cubic meters left.", space);
        }else{
            fullSpace -= space;
            System.out.printf("No more free space! You need %d Cubic meters more.", fullSpace);
        }
    }
}
