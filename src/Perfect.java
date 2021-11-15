import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 0, b, c;
        System.out.print("Lütfen bir sayı girin: ");
        int data = scn.nextInt();
        for (int i = 1; i < data; i++) {
            if (data % i == 0) {
                a += i;
            }

        }if(a==data){
        System.out.println(a+ " Mükemmel bir sayıdır.");}
        else{
            System.out.println(a+ "Mükemmel bir sayı değildir.");
        }
    }
}

