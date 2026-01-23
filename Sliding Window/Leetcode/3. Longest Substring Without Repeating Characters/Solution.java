class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0,r=0,maxlen=0;
        while(r<ch.length)
        {
            hm.put(ch[r],hm.getOrDefault(ch[r],0)+1);
            if(hm.size()<r-l+1)
            {
                hm.put(ch[l],hm.get(ch[l])-1);
                if(hm.get(ch[l])==0)
                    hm.remove(ch[l]);
                l++;
            }
            if(r-l+1==hm.size())
                maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}
