class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> hm = new HashMap<>();
    for(String st:strs){
        char[] ch = st.toCharArray();
        Arrays.sort(ch);
        String k = String.valueOf(ch);
        if(!hm.containsKey(k))
            hm.put(k,new ArrayList<String>());
        hm.get(k).add(st);
    }
    
    List<List<String>> res = new ArrayList<>();
    for(String k: hm.keySet()){
        res.add(hm.get(k));
    }
    return res;
    }
}
