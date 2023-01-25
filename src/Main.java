import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        task1();
    }
    public static void test1() {
        System.out.println("Тестовые задачи");
        //
        String address = "Адресс при доставке";
        String street = "Манежная";
        street = street + " площаль";
        System.out.println("Адресс магазина - " + street);
    }
    public static void test2() {
        String phone = "+960-415-76-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Средни нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157637";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Иванович";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
//        Задача 2
        System.out.println("Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
//        Задача 3
        System.out.println("Задача 3");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
//        Задача 4
        System.out.println("Задача 4");
        String fullName1 = firstName + " " + middleName + " " + lastName;
        String[] name = fullName1.split(" ");
//        System.out.println(Arrays.toString(name));
//        if (name[1].contains("ё")) {
//            System.out.println("Тут есть данная буква");
//            name[1] = name[1].replace("ё", "е");
//            System.out.println(name[1]);
//        } else {
//            System.out.println("Нету данной буквы");
//        }
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < name.length; i++) {
            if (name[i].contains("ё")) {
                name[i] = name[i].replace("ё", "е");
            }
            System.out.print(name[i] + " ");
        }
        System.out.println();
    }
}