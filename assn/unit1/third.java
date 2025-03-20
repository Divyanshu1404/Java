package kiet.edu;
public class third{
    private double num;

    
    public third(double num) {
        this.num = num;
    }

    public boolean isZero() {
        return num == 0;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isOdd() {
        return ((int) num % 2 != 0);
    }

    public boolean isEven() {
        return ((int) num % 2 == 0);
    }

    public boolean isPrime() {
        if (num < 2) return false;
        int n = (int) num;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        int n = (int) num, sum = 0, temp = n, digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
      third number = new third (153);

        System.out.println("Zero: " + number.isZero());
        System.out.println("Positive: " + number.isPositive());
        System.out.println("Negative: " + number.isNegative());
        System.out.println("Odd: " + number.isOdd());
        System.out.println("Even: " + number.isEven());
        System.out.println("Prime: " + number.isPrime());
        System.out.println("Armstrong: " + number.isArmstrong());
    }
}
