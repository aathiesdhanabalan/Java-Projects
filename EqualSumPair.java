import java.util.*;

public class EqualSumPair {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        Map<Integer,Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==sum&&!hm.containsKey(a[i])&&!hm.containsKey(a[j])){
                    hm.put(a[i],a[j]);
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }

    }

}
