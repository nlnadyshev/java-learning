import java.util.Scanner; //хитрый гад без импорта сканер не прописать
public class Main {
    public static void main(String[] args) {
        // создаю переменные
        int myInt = 666;
    byte myByte = 100;
    short myShort = 32000;
    long myLong = 89035316282L;
    float myFloat = 3.14f;
double myDouble = 123.456789;
char c = 'A';
boolean b = true;
// вывожу значения
System.out.println("byte:" +myByte);
System.out.println("int:" +myInt);
System.out.println("short:" +myShort);
System.out.println("float:" +myFloat);
System.out.println("double:" +myDouble);
System.out.println("long:" +myLong);
System.out.println("char:" +c);
System.out.println("boolean:" +b);
// бибусь с именем возрастом
        String y = "My";
        String t = " name";
        String u = " Is Jeka";
        String i = " and i am ";
        String o = " years old";
        int age = 50;
        System.out.println(y+t+u+i+age+o);
        // чтение чисел и вывод
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("Summary: "+ sum);
        scanner.close();
    }
}
