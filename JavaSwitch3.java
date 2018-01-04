public class JavaSwitch3{
    public static void main (String[] args){
        int ip = 2; // ip input 2  
        switch(ip){ //akan mengecek nilai ip pada kasus dibawah
            case 4: System.out.println("A");  
            case 3: System.out.println("B"); break;
            case 2: System.out.println("C"); //output dicetak  C dan D karena break berada pada case 1 (sesuai dengan kasus ini)
            case 1: System.out.println("D"); break;
            default: System.out.println("E"); 
        }
    }
}