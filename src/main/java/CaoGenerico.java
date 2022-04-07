import java.util.Scanner;

public class CaoGenerico extends Caninos{


    public CaoGenerico(){
        Scanner user = new Scanner(System.in);
        System.out.println("Digite quantas patas o cão Generico vai ter :");
        patas = user.nextInt();
        System.out.println("Digite quantos rabos o cão Generico vai ter :");
        rabo = user.nextInt();


    }
}
