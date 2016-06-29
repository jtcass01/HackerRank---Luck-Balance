import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0,k=0,luckBalance=0,luck=0,importance=0,importantLosses=0,lowest=0;
        ArrayList importantValues = new ArrayList();
        ArrayList lossValues = new ArrayList();
        
        n = scan.nextInt(); // 1<=n<=100
        k = scan.nextInt(); // 0<=k<=n
        
        for(int i=0; i<n; i++){
            luck = scan.nextInt(); // 1 <= L <= 10^4
            importance = scan.nextInt(); // 0 <= T <= 1
            if(importance==1){
                importantValues.add(luck);
            } else {
                luckBalance+=luck;
            }
        }
        
        importantLosses = importantValues.size() - k;
        lowest = importantValues.get(0);
        for(int importantLosses_i=0;importantLosses_i<importantLosses;importantLosses_i++){
            for(int importantValues_i=0;importantValues_i<importantValues.size();importantValues_i++){
                if(importantValues.get(importantValues_i) < lowest){
                    lowest = importantValues.get(importantValues_i);
                }
            }
            lossValues.add(lowest);
            importantValues.remove(lowest);
        }
        
        for(int importantValues_i=0;importantValues_i<importantValues.size();importantValues_i++){
            luckBalance+=importantValues.get(importantValues_i);
        }
        for(int lossValues_i=0;lossValues_i<lossValues.size();lossValues_i++){
            luckBalance-=lossValues.get(lossvalue_i);
        }
    }
}
