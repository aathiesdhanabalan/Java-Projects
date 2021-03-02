import java.util.*;

public class Platforms_found {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        /*6
        1:00 1:40 1:50 2:00 2:15 4:00
        1:10 3:00 2:20 2:30 3:15 6:00*/
        int l=sc.nextInt();sc.nextLine();
        int[] arr=new int[l];
        int[] dep=new int[l];
        for(int i=0;i<l;i++) {
            String[] a = sc.next().split(":");
            int p = a[1].length();
            int pow = (int) Math.pow(10, p);
            int v1 = Integer.parseInt(a[0]) * pow + Integer.parseInt(a[1]);
            arr[i]=v1;
        }
        for(int i=0;i<l;i++) {
            String[] a= sc.next().split(":");
            int p=a[1].length();
            int pow=(int)Math.pow(10,p);
            int v1=Integer.parseInt(a[0])*pow+Integer.parseInt(a[1]);
            dep[i]=v1;
        }
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    t=dep[i];
                    dep[i]=dep[j];
                    dep[j]=t;
                }
            }
        }
        int platform=(l==0)?0:1;
        for(int i=1;i<l;i++){
            if(arr[i]<dep[i-1])
                platform++;
        }
        System.out.println(platform);

    }
}
