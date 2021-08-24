package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o máximo de números");
        int max = read.nextInt();
        if (max <= 2)
            max = 2;
	    int i;
        int[] num = new int[max];
	    num[0] = 1;
        num[1] = 1;
	    for (i = 2;i < max;i++)
            num[i] = num[i-2]+num[i-1];
	    for(i = 0;i<max;i++)
            System.out.println(num[i]);

    }
}
