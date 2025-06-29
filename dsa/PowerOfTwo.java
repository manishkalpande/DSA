package dsa;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number=32;
        boolean isPowerOfTwo=(number &(number-1))==0;
        System.out.println(isPowerOfTwo);

    }
}
