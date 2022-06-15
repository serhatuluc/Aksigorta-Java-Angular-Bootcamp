import java.util.Scanner;

public class elemeSorusu1 {
    public static void main(String[] args) {
        int T = 0;
        int N = 0;
        Scanner inp = new Scanner(System.in);
        

       while (true){
            System.out.println("Please enter X");
            int X = inp.nextInt();
            if(X == 0){
            break;
            }
            T += X;
            N += 1;
       }
       
       int Y = T / N;
       System.out.print(Y);
    }
}

