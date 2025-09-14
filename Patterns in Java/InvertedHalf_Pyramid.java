import java.util.Scanner;
public class InvertedHalf_Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Rows:");
        int n = sc.nextInt();

            //INVERTED PYRAMID PATTERN
        for (int i = n; i>=1; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


            System.out.println();
            sc.close();
        }
    }
    

