import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0,k=0,luckBalance=0,luck=0,importance=0,importantWins=0,importantValues_i=0;
        int[] importantValues;
        int[] winValues;
        
        n = scan.nextInt(); // 1<=n<=100
        k = scan.nextInt(); // 0<=k<=n
        
        importantValues = new int[n];
        
        for(int i=0; i<n; i++){
            luck = scan.nextInt(); // 1 <= L <= 10^4
            importance = scan.nextInt(); // 0 <= T <= 1
            if(importance==1){
                importantValues[importantValues_i] = luck;
                importantValues_i++;
            } else {
                luckBalance+=luck;
            }
        }
        
        importantValues = reduceArray(importantValues,(importantValues_i+1));
        
        importantWins = importantValues.length - k;
        winValues = new int[importantWins];
        
        importantValues = sortArray(importantValues);
        
        for(int winValues_i=0; winValues_i<winValues.length;winValues_i++){
            winValues[winValues_i] = importantValues[(importantValues.length-1)-winValues_i];
        }
        
        importantValues = reduceArray(importantValues, (importantValues.length-winValues.length));
        
        //sum up luck
        for(int importantLosses_i=0;importantLosses_i<importantValues.length;importantLosses_i++){
            luckBalance+=importantValues[importantLosses_i];
        }
        for(int winValues_i=0;winValues_i<winValues.length;winValues_i++){
            luckBalance-=winValues[winValues_i];
        }
        
        System.out.println(luckBalance);
    }
    
    public static int[] reduceArray(int[] array, int newSize){
        int[] resultantArray = new int[newSize];
        
        for(int i=0;i<newSize;i++){
            resultantArray[i] = array[i];
        }
        
        return resultantArray;
    }
    
    public static int[] sortArray(int[] array){
        int temp=0;
        boolean change = true;
        
        while(change){
            change = false;
            for(int i=0; i<(array.length-1);i++){
                if(array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    change = true;
                }
            }
        }
        return array;
    }
}
