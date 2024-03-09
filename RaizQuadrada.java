import java.util.Scanner;
//
public class RaizQuadrada {
    public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Digite um Número");
    double Número = sc.nextDouble(); 
    System.out.println(Math.sqrt(Número));
    sc.close();
    }
}


