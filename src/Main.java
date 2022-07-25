import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("1. In Hinh Chu Nhat");
        System.out.print("\n2. In Tam Giac Vuong");
        System.out.print("\n3. In Tam Giac Can ");
        System.out.print("\n4. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nNhap lua chon: ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                for (int i = 1; i < 5; i++) {
                    for (int j = 1; j < 8; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.printf("\n");
                }
                System.out.printf("\n");
                for (int i = 6; i >= 0; i--) {
                    for (int j = i - 1; j > 0; j--) {
                        System.out.printf(" * ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 3:
                for (int i = 1; i < 4; i++){
                    for (int j = 4; j > i; j--){
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i; k++ ){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            case 4:
                break;
        }
    }
}
