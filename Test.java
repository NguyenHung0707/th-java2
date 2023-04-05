package Students;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add student records\n"
                +"2. Display student records\n"
                + "3. Save\n"
                +"4. Exit");
        ControllerStudent contro = new ControllerStudent();
        while (true){
            System.out.printf("Nhập lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    contro.add();
                    break;
                case 2:
                    contro.display();
                    break;
                case 3:
                    contro.save();
                    break;
                case 4:
                    return;
            }
        }
    }
}