import java.util.*;

public class Shortestlongest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = new String[n];
        int m=0,s=999999;
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
            int l=a[i].length();
            if(m<l)
                m=l;
            if(s>l)
                s=l;
        }
        int f1=0,f2=0;
        for(int i=0;i<n;i++){
            if(f1==0&&a[i].length()==s){
                f1=1;
                System.out.print("Small "+a[i]);
            }
            if(f2==0&&a[i].length()==m){
                f2=1;
                System.out.println("Max "+a[i]);
            }
        }

    }
}
