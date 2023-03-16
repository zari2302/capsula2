import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        Rectangle rectangle = new Rectangle();
        rectangle.setA(a);
        rectangle.setB(b);
        rectangle.setC(c);
        rectangle.setD(d);
        rectangle.square();
    }
}