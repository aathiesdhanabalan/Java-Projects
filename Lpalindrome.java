import java.util.*;

public class Lpalindrome {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] a=sc.next().toCharArray();
        int l=a.length;
        int e=(l/2),s=(l%2==0)?l/2:((l/2)+1);
        int[] h=new int[128];
        int[] h1=new int[128];
        for(int i=0;i<e;i++){
            h[a[i]]++;
        }
        for(int i=s;i<l;i++)
            h1[a[i]]++;
        for(int i=0;i<128;i++){
            if(h[i]!=h1[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.print("Yes");

    }
}
