package training;
import java.util.*;
public class Togglingbits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";
        while(n!=0){
            binary = (n&1)+binary;
            n = n>>1;

        }
        binary = binary.replaceAll("1","2");
        binary = binary.replaceAll("0","1");
        binary = binary.replaceAll("2","0");
        int result = Integer.parseInt(binary,2);
        System.out.println(result);

    }
}
