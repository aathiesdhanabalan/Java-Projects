import java.util.*;

public class FirstRepeatelements {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            if(al.contains(t)){
                System.out.print(t);
                return;
            }
            al.add(t);
        }

    }

}
