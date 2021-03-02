import java.util.*;

public class Permutation {

    static void swap(char[] a,int i,int j){
        char t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    static void permute(char[] a,int s,int l){
        if(s==l-1){
            System.out.println(String.valueOf(a));
        }
        else{
            for(int i=s;i<l;i++){
                swap(a,i,s);
                permute(a,s+1,l);
                swap(a,i,s);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] a=sc.nextLine().toCharArray();
        int l=a.length;
        permute(a,0,l);

    }
}
