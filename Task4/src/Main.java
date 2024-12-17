import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo Numbers
        System.out.println("Введите номер телефона");
        String num  = new Scanner(System.in).nextLine();
        num = num.replaceAll("\\D", "");
        boolean check = true;

        if ((num.length()!=10)&&(num.charAt(0)!='7'))
            check=false;

        if (check) System.out.println(num);
        else System.out.println("сообщение о неверном вводе");
    }
}