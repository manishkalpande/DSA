package dsa;

public class NoOfDigit {
    public static void main(String[] args) {
        int a=232432434;
        int b=8;

        int ans=(int)(Math.log(a)/Math.log(b))+1;
        System.out.println(ans);

    }
}
