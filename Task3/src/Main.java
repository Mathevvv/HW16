import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo ФИО
        final String VALID= "([А-я-]+\\s){2}([А-я]+)";
        String fio = new Scanner(System.in).nextLine();
        if (fio.matches(VALID)) {
            String[] fioArr = fio.split("\\s");
            System.out.println("Фамилия: " + fioArr[0]);
            System.out.println("Имя: " + fioArr[1]);
            System.out.println("Отчество: " + fioArr[2]);
        }
        else
            System.out.println("Введенная строка не является ФИО");


    }
}