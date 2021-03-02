import java.util.*;

public class Prime {

    static boolean prime(int val){
        for(int i=2;i<val/2;i++){
            if(val%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> al=new ArrayList<Integer>();
        for(int i=n;i<=m;i++)
            al.add(i);
        int c=0;
        List<Integer> li=new ArrayList<Integer>();
        if(al.contains(2)) {
            c++;
            li.add(2);
        }
        for(int i=1;i<=m;i++){
            for(int j=0;true;j++){
                int value=(int)(Math.pow(2,i)*Math.pow(3,j))+1;
                if(value>m)
                    break;
                if(prime(value)&&al.contains(value)){
                    c++;
                    li.add(value);
                }
            }
        }
        System.out.print(c+" list:"+li);

    }

}
