public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(isPalindrome(args[i]));
        }
    }
     public static String reverse(String str) {
        String rever = "";
        for (int i = 0; i < str.length(); i++) {
            rever +=  str.charAt(str.length()-i-1);   
        }
        return rever;
    }
    public static boolean isPalindrome(String s) {
        String ss = reverse(s);
        if (ss.equals(s)){
            return true;
        }
        else {
            return false;
        }
    }
}