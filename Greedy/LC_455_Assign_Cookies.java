//greedy practice (Easy)
//455 : Assign Cookies 
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,l=0,r=0;
        while(l<g.length && r<s.length)
        {
            if(s[r]>=g[l])
                l++;
            r++;
        }
        return l;
        
    }
}
