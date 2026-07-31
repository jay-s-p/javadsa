class Solution {
    public int reverseBits(int n) {
        
        StringBuilder sb = new StringBuilder();
        while(n>0)
        {
            sb.append(n % 2);
            n=n/2;
        }
        // while(sb.length()<=32)
        // {
        //     sb.append(0);
        // }
        System.out.println(sb);

        int ans=0;
        for(int i=0; i<sb.length(); i++)
        {
            ans= ans+sb.charAt(i)-'0';
            ans= ans*2;
        }
        for(int i=sb.length(); i<31 ; i++ )
        {
            ans= ans*2;
        }

        return ans;
    }
}