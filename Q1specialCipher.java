import java.util.Scanner;

public class Q1specialCipher{
    public static String rotationNumber(String str){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            char cipher = (char) ((ch - 'A' + 3) % 26 + 'A');
            ans.append(cipher);
        }
        return ans.toString();
    }
    public static String RLE(String str){
        StringBuilder ans = new StringBuilder();
        for(int i =0;i<str.length();i++){
            int count = 1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            ans.append(str.charAt(i));
            if(count>1){
                ans.append(count);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String str = sc.next();
        String rotationString = rotationNumber(str);
        System.out.println(rotationString);
        String finalans = RLE(rotationString);
        System.out.println(finalans);
    }
}