import java.awt.*;
import java.util.Date;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] days = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Integer[] months = {1,2,3,4,5,6,7};
        String[] days2 = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.equals(days, days2));
        System.out.println(Arrays.toString(days));
        System.out.println(days);

    }

    public static char charRightShift(char c, int n){
        char nw = c;
        int position = n;

        if (c >= 'a' && c <= 'z'){
            position = c+n;
            if (position >= 123){
                position = 96 + ((position - 122)%26);
            }
            else if (position <= 96){
                position = 123 + (n % 26);
            }
            nw = (char)(position);
        }

        return nw;
    }
    public static boolean checkPassword(String a){
        String the_word = "hello";

        if (a.length() != the_word.length()){
            return false;
        }
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != the_word.charAt(i))
                return false;
        }
        return true;
    }

    public static boolean comparePassword(String s) {
        String password = "password";
        if (s.length() != password.length()) {
            return false;
        }
        for (int i=0; i<s.length(); i++) {
            // if one char is not the same, return false
            if (s.charAt(i) != password.charAt(i))
                return false;
        }
        return true;
    }

    public static int getIntersectionSize(int[] a, int[] b) {
        int size = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; i < b.length; j++) {
                if (a[i] == b[j])
                    size++;
            }
        }
        return size;



    }
}
