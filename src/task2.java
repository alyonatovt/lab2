public class task2  {
    public static void main(String[] args) {
        int n = 69; // двозначне число
        int a = n / 10; // перша цифра
        int b = n % 10; // друга цифра
        int sum = a + b; // сума цифр
        System.out.println("Сума цифр числа " + n + ": " + sum);
    }
}
