import java.util.*;

public class Map_with_high_key {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,String> hm=new TreeMap<String, String>(Collections.<String>reverseOrder());
        while(true){
            System.out.println("Enter Key and value");
            String k=sc.next(),v=sc.next();
            hm.put(k,v);
            System.out.println("TO stop press -1 else press anything");
            int t=sc.nextInt();sc.nextLine();
            if(t==-1)
                break;
        }
        Set<String> i=hm.keySet();
        int f=0;
        for(String j:i) {
            System.out.println("Key=" + j + " Value=" + hm.get(j));//ABC = 10, DEF = 30, XYZ = 20}
            break;// 1= 40, 2 = 30, 3 = 60
        }

    }
}
