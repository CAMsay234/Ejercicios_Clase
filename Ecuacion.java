import java.util.Scanner;
public class Ecuacion {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese valor de X");
        int x = sc.nextInt();

        System.out.print("Ingrese Ingrese valor Y");
        int y = sc.nextInt();

        System.out.print("Ingrese Ingrese valor Z");
        int z = sc.nextInt();

        System.out.print("Ingrese Ingrese valor W");
        int w = sc.nextInt();
 
          System.out.println((2*x*z*y*w)+(2*y*z*w)+(2*z*w)+(2*w-3));




      
            
    }
}