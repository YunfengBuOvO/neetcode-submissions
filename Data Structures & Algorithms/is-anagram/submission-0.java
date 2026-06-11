class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        StringBuilder ha = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < ha.length(); j++) {

                if (current == ha.charAt(j)) {
                    ha.deleteCharAt(j);
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
