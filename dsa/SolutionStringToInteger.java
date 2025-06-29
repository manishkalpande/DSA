package dsa;

public class SolutionStringToInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(String.valueOf(s.charAt(0)).equals("-") || String.valueOf(s.charAt(i)).equals(" ")|| Character.isDigit(s.charAt(i))){
                sb.append(String.valueOf(s.charAt(i)));
            }else{
                break;
            }
        }
        if(sb.length()==0){
            sb.append("0");
        }
        return Math.toIntExact(Long.parseLong(sb.toString()));
    }
}
