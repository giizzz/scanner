import java.util.Scanner;

public class scanner {
public static void main(String [] args){

    int a,b;
    Scanner input =new Scanner(System.in);

    System.out.print("1. sayiyi giriniz->");
    a=input.nextInt();

    System.out.print("2. sayiyi giririniz->");
    b=input.nextInt();

    System.out.println("Girdiginiz 1. sayi->"+ a +"\t"+ "2. sayi->" + b + "\t"+ "Sayilarin toplami->" + (a+b)+ "\n");

}
}
