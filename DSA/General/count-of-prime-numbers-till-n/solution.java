class Solution {
    public int primeUptoN(int n) {
        int[] isprime = new int[n+1];
        for(int i=0; i<=n; i++){
            isprime[i] = 1;
        }

        for(int i=2; i<= Math.sqrt(n); i++){
            if(isprime[i] == 1){
                for(int j=i*i; j<=n; j+=i){
                    isprime[j] = 0;
                }
            }
            
        }
        int count = 0;
        for(int i=2; i<=n; i++){
            if(isprime[i] == 1){
                count++;
            }
        }
        return count;

    }
}