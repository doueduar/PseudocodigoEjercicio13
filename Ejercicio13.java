import java.util.Scanner;

/**
 * Ejercicio13
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operacion,n1,n2;
        String s = " ";
       
        do {
            System.out.println("que operación a realizar");
            System.out.println("1. suma 2. resta 3. multiplicacion 4. division");
            operacion = scanner.nextDouble();
            System.out.println("ingresa el primer numero");
            n1 = scanner.nextDouble();
            System.out.println("ingresa el segundo numero");
            n2 = scanner.nextDouble();
            if (operacion==1)
                n1+=n2;
            if (operacion==2) 
                n1 -=n2;
            if (operacion==3)
                n1 *= n2;
            if (operacion==4) {
                if (n2!=0) {
                    n1 /=n2;
                } else {
                    System.out.println("no hay division entre 0");
                }
            }
            if ((1<=operacion)&&(operacion<=4)) {
                System.out.println("Resultado es: "+n1+"salir(s/n)");
                s = scanner.next();
            } else {
                System.out.println("no existe esta operacion salir(s/n)");
                s = scanner.next();
            }       
        } while (!s.equalsIgnoreCase("s"));
    }
}