import java.util.ArrayList;
import java.util.*;

class Phone{
    String name,number;
    public Phone(String name,String number){
        this.name=name;
        this.number=number;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
public class Mobilephone {
    static List<Phone> al=new ArrayList<Phone>();
    static void addcontact(String n,String p) {
        Phone ob=new Phone(n,p);
        al.add(ob);
    }
    static void update(String n,String p) {
        for(int i=0;i<al.size();i++) {
            Phone name = al.get(i);
            Phone ob = new Phone(n, p);
            String tem = name.getName();
            if (tem.equals(n)) {
                System.out.println("Match found");
                al.remove(i);
                al.add(ob);
                break;
            }
        }
    }
    static void delete(String n,int flag) {
        int f=0;
        for(int i=0;i<al.size();i++){
            Phone name = al.get(i);
            String t=name.getName();
            if(t.equals(n)&&flag==0){
                al.remove(i);
                System.out.println("Contact deleted");
                f=1;
                break;
            }
            else if(t.equals((n))&&flag==1){
                System.out.println("Match found");
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.print("NotFound");
        }
    }
   /* static void search(String n){
        for(int i=0;i<al.size();i++){
            Phone name = al.get(i);
            String t=name.getName();
            if(t.equals(n)){
                System.out.println("Match found");
                break;
            }
        }
    }*/
    static void display(){
        for(Phone i:al){
            System.out.println("Name "+i.getName()+" Number"+i.getNumber());
        }
    }
    public static void main(String[] args){
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
                 delete(name,0);
             }
             if(op==5){
                 System.out.println("Enter the name to search");
                 String name=sc.next();
                 delete(name,1);
             }
             if(op==6){
                 /*for(String i:hm.keySet()){
                     System.out.println("name "+i+" number "+ hm.get(i));
                 }*/
                 display();
             }
             System.out.println("Quit=1, Add_contact=2,update_contact=3, Remove_contact=4, Search=5, Display=6");
         }
         System.out.println("Quit");

     }

}

