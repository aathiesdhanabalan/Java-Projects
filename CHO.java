import java.util.*;

public class CHO {

    public static void main(String[] args) {

        int Carbon, Hydrogen, Oxygen;
        Scanner sc=new Scanner(System.in);
        Carbon=sc.nextInt();
        Hydrogen=sc.nextInt();
        Oxygen=sc.nextInt();//45 11 100
        //45 10 11
        //45 100 11
        int rem=0,temp=0;
        if (Hydrogen<Oxygen) {
            rem=Hydrogen/2;
            Oxygen-=rem;
            Hydrogen-=rem*2;
        }
        else {
            temp=Hydrogen;
            rem=Oxygen;
            if(Hydrogen>=Oxygen*2){
                Hydrogen-=rem*2;
                Oxygen=0;
            }
            else{
                Oxygen-=Hydrogen/2;
                Hydrogen=0;
            }
        }
        System.out.println("H2O: "+temp/2);
        System.out.println(Carbon+" "+Hydrogen+" "+Oxygen);
        if (Oxygen<Carbon) {
            rem=Oxygen/2;
            Carbon-=rem;
            Oxygen-=rem * 2;
        } else {
            rem=Carbon;
            if(Oxygen>=Carbon*2) {
                Oxygen-=Carbon*2;
                Carbon=0;
            }
            else{
                Oxygen/=2;
                Carbon-=Oxygen;
            }
        }
        System.out.println("H2O: "+temp/2);
        System.out.println(Carbon+" "+Hydrogen+" "+Oxygen);
        if (Hydrogen<Carbon) {
            rem=Hydrogen/4;
            Carbon-=rem;
            Hydrogen-=rem*4;
        }
        else{
            rem=Carbon;
            if(Hydrogen>=Carbon*4) {
                Hydrogen-=Carbon*4;
                Carbon=0;
            }
            else{
                Hydrogen/=4;
                Carbon-=Hydrogen;
            }
        }
        System.out.println("CH4: "+rem);
        System.out.println(Carbon+" "+Hydrogen+" "+Oxygen);

    }
}
