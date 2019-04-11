package lesson5;

public class Program {
    public static void main(String[] args){
       System.out.println(powerRec(5, 3));


    }
    //7. Ханойская башня


    //6. Возведение в степень
    public static long powerRec (int number, int pow){
        if (pow == 0) {
            return 1;
        }
        if(pow%2 == 1){
            return powerRec(number, pow - 1)*number;
        }
        else {
            long tmp = powerRec(number, pow/2);
            return tmp*tmp;
        }
    }

    public static long power (int number, int pow){
        int current = 0;
        int res = 1;

        while (current< pow){
            res *= number;
            current++;
        }
        return res;
    }

    //5.  Даны 2 целых неотрицательных числа a и b.
    //Без использования операции умножения найти произведение чисел a и b
    //a * b = [a + a + ... + a] + a = a * (b - 1) + a
    //f(a, b) = f(a, b - 1) + a

    public static int productRec(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        else if (b == 1) {
            return a;
        }
        else if (a == 1) {
            return b;
        }
        else {
            return productRec(a, b - 1) + a;
        }
    }

    public static int product(int a, int b) {
        int sum = 0;
        if (a < b) {int tmp = a; a = b; b = tmp;}//улучшаем эффективность алгоритма
        while (b > 0) {
            sum += a;
            b--;
        }
        return sum;
    }

    //4. Дано натуральное число n найти сумму цифр числа n
    //n = 7561, 7 + 5 + 6 + 1 = 19
    //f(n) - сумма цифр числа n
    //f(7561) = f(756) + 1 = f(75) + 6 + 1 = f(7) + 5 + 6 + 1
    //f(n) = f(n/10) + n % 10;
    public static int digitSumRec(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return digitSumRec(n / 10) + n % 10;
        }
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    //3. Дано натуральное число n Найти n-oe треугольное число
    //t(n) = [1 + 2 + .. + (n - 1)] + n
    public static int triangleRec(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + triangleRec(n - 1);
        }
    }

    public static int triangle(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    //2. Дано натуральное число n  найти факториал этого числа
    //n! = [1*2*...*(n - 1)]*n = (n - 1)! * n
    //f(n) = n!
    //f(n) = f(n - 1) * n
    //5! = 1*2*3*4*5 = 120
    public static long factRec(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return factRec(n - 1) * n;
        }
    }


    public static long fact(int n) {
        long product = 1;
        while (n > 0) {
            product *= n;
            n--;
        }
        return product;
    }
    //1. Дано натуральное число n Найти n-ый член последовательности Фиббоначи
    //f(0) = 0 f(1) = 1, f(2) = 1, f(n) = f(n - 1) + f(n - 2)
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
    //f(n)/f(n - 1) = fi = 1.618
    //a(n) = a(n - 1) + d
    public static long phiboRec(int n){
        System.out.print(n + " ");
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return phiboRec(n-1) + phiboRec(n - 2);
        }
    }

    public static long phibo(int n){
        long current = 1;
        int currentNumber = 1;
        long previos = 0;

        while (currentNumber < n){
            long next = current + previos;
            previos = current;
            current = next;
            currentNumber++;
        }
        return current;
    }
}
