import java.util.Scanner;

public class Leitor {
    static Scanner sc = new Scanner(System.in);

    public static int lerInt() {
        int valor = sc.nextInt();
        sc.nextLine(); 
        return valor;
    }

    public static String lerString() {
        String txt = sc.nextLine();
        return txt;
    }

    public static float lerFloat() {
        float valor = sc.nextFloat();
        sc.nextLine(); 
        return valor;
    }

    public static char lerChar() {
        char valor = sc.next().charAt(0);
        sc.nextLine(); 
        return valor;
    }
}

