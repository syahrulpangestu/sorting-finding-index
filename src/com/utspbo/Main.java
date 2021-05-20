package com.utspbo;
import java.util.Scanner;
import java.util.Arrays;

class Manual{
    public void sort(int[] data) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if(data[i]>data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            System.out.print(data[i]+" ");
        }
    }
    public void index(int[] data, int input) {
        for (int i = 0; i < data.length; i++) {
            if(data[i] == input){
                System.out.print("index ke-"+i+" ");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[]{-80, -50, 0, 40, 0, -30, 90, 70, 89, 50, -55};

        //tugas 1
        System.out.println("unusing api sort : ");
        Manual manual = new Manual();
        manual.sort(data);
        System.out.print("\nsearch index number : ");
        int input_numb = input.nextInt();
        manual.index(data,input_numb);

        //tugas 2
        System.out.println("\nusing api sort : ");
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.print("search index number : ");
        int input_number = input.nextInt();
        int hasil = Arrays.binarySearch(data, input_number);
        System.out.println("index ke-"+hasil);

        //tugas 3
        System.out.println("ratio : ");
        double positip = 0, negatip = 0, nol = 0;
        for (int datum : data) {
            if (datum > 0) {
                positip++;
            } else if (datum < 0) {
                negatip++;
            } else {
                nol++;
            }
        }
        System.out.printf("positive ratio\t:\t%1.4f", positip/data.length);
        System.out.printf("\nnegative ratio\t:\t%1.4f", negatip/data.length);
        System.out.printf("\nzero ratio\t\t:\t%1.4f", nol/data.length);
    }
}
