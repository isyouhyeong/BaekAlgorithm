import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        //(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        //세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d\n%d\n%d\n%d", (a + b) % c, ((a % c) + (b % c)) % c, (a * b) % c, ((a % c) * (b % c)) % c);

    }
}
