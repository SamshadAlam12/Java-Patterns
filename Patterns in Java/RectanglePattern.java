import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int R = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int C = sc.nextInt();
        for(int i = 1 ; i<=R;i++){
            for(int j = 1; j<= C; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
