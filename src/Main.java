public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }
        public static void task1(){
            System.out.println("Домашнее задание. Строки.");
            System.out.println("Задание 1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " "+ firstName + " " + middleName;
            System.out.println("ФИО сотрудника- "+ fullName);

            System.out.println("Задание 2");
            String result = fullName.toUpperCase();
            System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета- "+ result);
        }
    public static void task2() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е");
        fullName = fixedFullName;
        System.out.println("Данные Ф.И.О. сотрудника- " + fullName);
    }

    }

