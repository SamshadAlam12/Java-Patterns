public class Inverted_Rotated_halfPyramid {
    public static void HalfPyramid(int n){
        // Outer loop for rows
        for(int i=1;i<=n;i++){
            // for Space in each row
            for(int j=1;j<=n-i; j++){
                System.out.print("  ");
            }
            //for Stars in each row
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            // Move to next line after each row
           System.out.println(); 
        }
    }
    
    public static void main(String[] args){
        HalfPyramid(5);
    }
}

