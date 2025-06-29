package dsa;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(7 + "\n" + 5);
        System.out.println("I"+"\n"+"love"+"\n"+"codechef");
        int digits[] = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<digits.length;i++){
            sb.append(digits[i]);
        }
        BigInteger b=new BigInteger(sb.toString());
        BigInteger c=b.add(new BigInteger("1"));

        String ans=c.toString();

        int result[]=new int[ans.length()];
        for(int i=0;i<ans.length();i++){
            result[i]=Integer.valueOf(ans.charAt(i)+"");
        }
        return result;
    }
}
