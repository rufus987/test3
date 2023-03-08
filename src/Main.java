import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int nextInt = sc.nextInt();
            System.out.println(nextInt);
        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            System.out.println("OK");
        }
    }
}
