import java.util.*;

public class Repeatvowels {

    public static boolean is(char t){
        char a=Character.toLowerCase(t);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] a=sc.nextLine().toCharArray();
        String ans="";
        for(char i:a){
            if(!is(i))
                ans=ans+""+i;
        }
        if(ans.length()==0)
            System.out.print("-1");
        else
            System.out.print(ans);

    }
}
