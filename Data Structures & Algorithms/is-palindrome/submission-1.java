class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(c)) {
                str += c;
            }
        }

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}