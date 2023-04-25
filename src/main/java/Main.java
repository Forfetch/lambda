import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите условие задачи");
        System.out.println("первое число ");
        int a = scanner.nextInt();
        System.out.println("операция ");
        char symbol = scanner.next().charAt(0);
        System.out.println("второе число ");
        int b = scanner.nextInt();


        Func func =(int x, int y, char symb) ->{
            switch (symb){
                case '+':
                    System.out.println("Результат выичсления "+ (x+y));
                    break;
                case '-':
                    System.out.println("Результат выичсления "+ (x-y));
                    break;
                case '*':
                    System.out.println("Результат выичсления "+ (x*y));
                    break;
                case '/':
                    if (y!=0){
                        System.out.println("Результат выичсления "+ (x/y));
                    }else {
                        System.out.println("Decimal by zero");
                        break;
                    }
                default:
                    System.out.println("Incorrect char");
                    break;
            }

        };

      func.calculate(a,b,symbol);

    }
}
