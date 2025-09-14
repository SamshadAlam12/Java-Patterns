import java.util.Scanner;
public class FLOYD_Triangl_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Rows:");
        int R = sc.nextInt();

        int n = 1;

        for(int i = 1;i<=R; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
