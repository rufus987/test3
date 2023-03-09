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

        System.out.println("Мы обработали ошибку");
        System.out.println("Программа продолжается");
        int fa = 45;
        int doo = 32;
        String uyt = "uyt";
    }
    public void google(){
        System.out.println("google");
    }
    public void yandex(){
        System.out.println("Яндекс");
    }
    public void bing(){
        System.out.println("Bing");
    }
}
