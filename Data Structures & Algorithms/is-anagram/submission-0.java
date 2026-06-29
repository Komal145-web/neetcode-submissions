class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        // 1. Sort string s
        char[] first = s.toCharArray();
        Arrays.sort(first);
        String sortedS = new String(first);

        // 2. Sort string t
        char[] second = t.toCharArray();
        Arrays.sort(second);
        String sortedT = new String(second);

        return sortedS.equals(sortedT);

    }
}
