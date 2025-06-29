package dsa;

public class AddBinary {

    public static void main(String[] args) {

        System.out.println(addBinary("11","11"));

    }
    public static String addBinary(String a, String b) {

        StringBuilder result=new StringBuilder();
        int l =a.length()-1;
        int m=b.length()-1;
        int carry=0;

        while(l>=0 || m >=0 || carry>0){
            int sum=carry;

            if(l>=0){
                sum+=a.charAt(l) -'0';
                l--;
            }

            if(m>=0){
                sum+=b.charAt(m) - '0';
                m--;
            }

            carry=sum/2;
            result.append(sum%2);
        }

        return result.reverse().toString();
    }
}
