class Solution {
    public char findTheDifference(String s, String t) {
        int sumT = 0, sumS = 0; 
        
        for(int i =0; i<t.length();i++){
            sumT = sumT + t.charAt(i);
        }

        for(int i = 0; i<s.length(); i++){
            sumS= sumS + s.charAt(i);
        }

        return (char)(sumT - sumS);
    }
}