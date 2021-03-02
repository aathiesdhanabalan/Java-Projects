import java.util.*;
public class First_nameLast_name {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String[] s=sc.nextLine().toUpperCase().split(";");//Fred:Carwill;Wilfred:Carwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphel:Carwill;Alfred:Carwill
            Map<String,TreeSet<String>> hm=new TreeMap<String, TreeSet<String>>();
            for(String i:s){
                //System.out.println(i);
                String[] a=i.split(":");
                if(!hm.containsKey(a[1])){
                    TreeSet<String> set=new TreeSet<String>();
                    set.add(a[0]);
                    hm.put(a[1],set);
                }
                else{
                    TreeSet<String> set=hm.get(a[1]);
                    set.add(a[0]);
                    hm.put(a[1],set);
                }
            }
            for(String i:hm.keySet()) {
                for(String j:hm.get(i)) {
                    System.out.print("("+i);
                    System.out.print(","+j + ")");
                }
            }

        }
}
