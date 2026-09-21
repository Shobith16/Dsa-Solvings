class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i < s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);

        }
        for(int i=0;i<s.length();i++){
            if(!Objects.equals(map.get(s.charAt(i)),map2.get(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
