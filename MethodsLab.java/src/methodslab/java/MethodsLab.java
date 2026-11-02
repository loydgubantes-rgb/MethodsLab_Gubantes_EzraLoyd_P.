/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab.java;

/**
 *
 * @author Ezra Loyd P. Gubantes
 */
import java.util.Scanner;

public class MethodsLab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        greetUser();

        System.out.print("Enter 2 nums: ");
        int x = in.nextInt(), y = in.nextInt();
        System.out.println("Add: " + add(x, y) + "\nSub: " + subtract(x, y) + "\nMul: " + multiply(x, y) + "\nDiv: " + divide(x, y));

        System.out.print("Fact num: ");
        int f = in.nextInt();
        System.out.println("Iter: " + factorial(f) + "\nRec: " + recursiveFactorial(f));

        int[] arr = {10, 15, 20, 25, 5};
        System.out.println("Sum: " + sumArray(arr) + "\nMax: " + maxInArray(arr));

        System.out.print("Prime check: ");
        int p = in.nextInt();
        System.out.println(p + (isPrime(p) ? " is prime" : " not prime"));

        System.out.print("GCD/LCM pair: ");
        int g1 = in.nextInt(), g2 = in.nextInt();
        System.out.println("GCD: " + gcd(g1, g2) + "\nLCM: " + lcm(g1, g2));

        System.out.print("Fib num: ");
        System.out.println("Fib: " + fib(in.nextInt()));

        in.nextLine();
        System.out.print("Pal check: ");
        String s = in.nextLine();
        System.out.println(s + (isPalindrome(s) ? " is pal" : " not pal"));
        in.close();
    }

    public static void greetUser() { System.out.println("Hi."); }
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(double a, double b) { return b == 0 ? 0 : a / b; }

    public static long factorial(int n) {
        long r = 1;
        for (int i = 1; i <= n; i++) r *= i;
        return r;
    }

    public static int sumArray(int[] a) {
        int s = 0;
        for (int n : a) s += n;
        return s;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    public static int maxInArray(int[] a) {
        int m = a[0];
        for (int n : a) if (n > m) m = n;
        return m;
    }

    public static int gcd(int a, int b) {
        while (b != 0) { int t = b; b = a % b; a = t; }
        return a;
    }

    public static int lcm(int a, int b) { return (a == 0 || b == 0) ? 0 : (a / gcd(a, b)) * b; }
    public static long recursiveFactorial(int n) { return n <= 1 ? 1 : n * recursiveFactorial(n - 1); }
    public static int fib(int n) { return n <= 0 ? 0 : n == 1 ? 1 : fib(n - 1) + fib(n - 2); }

    public static boolean isPalindrome(String s) {
        String c = s.replaceAll("\\s+", "").toLowerCase();
        int l = 0, r = c.length() - 1;
        while (l < r) if (c.charAt(l++) != c.charAt(r--)) return false;
        return true;
    }
}
