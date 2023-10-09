package Week5_4.Task1;


public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder();
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        if (str.contentEquals(rev)) {
            ans = true;
        }
        return ans;
    }
}
