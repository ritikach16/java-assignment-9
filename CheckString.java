import java.util.Scanner;
import java.util.regex.*;

public class CheckString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean ans = checkTheString(str);
        System.out.println(ans);
    }

    public static boolean checkTheString(String str){
        Pattern regexp = Pattern.compile("[A-Z]+.*\\.");
        Matcher m = regexp.matcher(str);
        return m.matches();
    }
}