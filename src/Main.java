import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Считать число и проверить: положительное оно или отрицательное.
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Число положительное");
        } else if (num < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

        // 2. Считать число и проверить: чётное оно или нечётное.
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }

        // 3. Считать два числа и вывести большее.
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Большее число: " + a);
        } else if (b > a) {
            System.out.println("Большее число: " + b);
        } else {
            System.out.println("Числа равны");
        }

        // 4. Считать три числа и вывести наибольшее.
        System.out.print("Введите три числа через пробел: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        System.out.println("Наибольшее число: " + max);

        // 5. Считать число и проверить: делится ли оно на 3.
        System.out.print("Введите число для проверки делимости на 3: ");
        int d = scanner.nextInt();
        if (d % 3 == 0) {
            System.out.println("Число делится на 3");
        } else {
            System.out.println("Число не делится на 3");
        }

        // 6. Считать возраст и проверить: можно ли голосовать (>=18).
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Можно голосовать");
        } else {
            System.out.println("Голосовать нельзя");
        }

        // 7. Считать месяц (1–12) и вывести название сезона.
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Некорректный месяц");
        }

        // 8. Считать день недели (1–7) и вывести название дня.
        System.out.print("Введите день недели (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("Пятница"); break;
            case 6: System.out.println("Суббота"); break;
            case 7: System.out.println("Воскресенье"); break;
            default: System.out.println("Некорректный день");
        }

        // 9. Считать оценку (0–100) и вывести букву: A (90–100), B (80–89), C (70–79), D (60–69), F (0–59).
        System.out.print("Введите оценку (0-100): ");
        int grade = scanner.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.println("Оценка: A");
        } else if (grade >= 80) {
            System.out.println("Оценка: B");
        } else if (grade >= 70) {
            System.out.println("Оценка: C");
        } else if (grade >= 60) {
            System.out.println("Оценка: D");
        } else if (grade >= 0) {
            System.out.println("Оценка: F");
        } else {
            System.out.println("Некорректная оценка");
        }

        // 10. Считать число и проверить через switch: 1 → «один», 2 → «два», 3 → «три», иначе «другое».
        System.out.print("Введите число (1-3): ");
        int sw = scanner.nextInt();
        switch (sw) {
            case 1: System.out.println("один"); break;
            case 2: System.out.println("два"); break;
            case 3: System.out.println("три"); break;
            default: System.out.println("другое");
        }

        scanner.close();
    }
}