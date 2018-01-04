public class JavaSwitch2{
    public static void main (String[] args){
        int ip = 4; // ip input 4  
        switch(ip){ //akan mengecek nilai ip pada kasus dibawah
            case 4: System.out.println("A"); break; //output dicetak (sesuai dengan kasus ini) 
            case 3: System.out.println("B"); break;
            case 2: System.out.println("C"); break;
            case 1: System.out.println("D"); break;
            default: System.out.println("E"); 
        }
    }
}