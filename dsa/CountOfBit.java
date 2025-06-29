package dsa;

public class CountOfBit {

    public static void main(String[] args) {
        Integer couant=12;
        couant=21;
        System.out.println(couant);
        int n=16;

        int count=0;
        int countZero=0;

        while(n>0){
            if((n&1)==1){
                count++;
            }else{
                countZero++;
            }
            n>>=1;
        }
        System.out.println(count);
        System.out.println(countZero);
    }
}
