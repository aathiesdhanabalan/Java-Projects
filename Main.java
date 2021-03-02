//import com.sun.org.apache.xpath.internal.operations.String;

import java.awt.*;
import java.util.*;
//import java.lang.String;


public class Main {

    static  Map<String,String> hm=new TreeMap<String,String>();
    public static void addcontact(String name,String num){
          if(hm.containsKey(name)){
              System.out.println("Already number is entered");
          }
          else{
              hm.put(name,num);
          }
          System.out.println("Number added successfully");
    }
    public static void update(String name,String num){
        if(hm.containsKey(name)){
            System.out.println("Number is present");
            hm.put(name,num);
        }
        else{
            hm.put(name,num);
        }
        System.out.println("Number update successfully");
    }
    static void delete(String name){
        if(hm.containsKey(name)){
            hm.remove(name);
            System.out.println("number deleted successfully");
        }
        else{
            System.out.println("Number not in the phone");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quit=1, Add_contact=2,update_contact=3, Remove_contact=4, Search=5, Display=6");
        while(true){
            System.out.println("Enter option");
            int op=sc.nextInt();sc.nextLine();
            if(op==1)
                break;
            if(op==2){
                System.out.println("Enter name and contact details");
                String name=sc.next();
                String number=sc.next();
                addcontact(name,number);
            }
            if(op==3){
                System.out.println("Enter the name to update and number");
                String name=sc.next();
                String number=sc.next();
                update(name,number);
            }
            if(op==4){
                System.out.println("Enter the name to delete the details");
                String name=sc.next();
                delete(name);
            }
            if(op==5){
                System.out.println("Enter the name to search");
                String name=sc.next();
                if(hm.containsKey(name)){
                    System.out.println("Number is found "+name+"number:"+ hm.get(name));
                }
                else{
                    System.out.println("Not found");
                }
            }
            if(op==6){
                for(String i:hm.keySet()){
                    System.out.println("name "+i+" number "+ hm.get(i));
                }
            }
            System.out.println("Quit=1, Add_contact=2,update_contact=3, Remove_contact=4, Search=5, Display=6");
        }
        System.out.println("Quit");

    }
}
