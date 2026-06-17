class Solution {
    public boolean isAnagram(String s, String t) {
        char srr[]=s.toCharArray();
        Arrays.sort(srr);
        char trr[]=t.toCharArray();
        Arrays.sort(trr);
        if (Arrays.equals(srr,trr))
        return true;
        else
        return false;
        }
}
