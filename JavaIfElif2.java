public class JavaIfElif2{
    public static void main (String[] args){
        int bil = 10; // bil input 10
        if (bil == 10){ //jika bil sama dengan 10 maka
            System.out.println("Yang ini dieksekusi (==)"); //output dicetak (true)
        } else if(bil % 2 == 0){ //jika bila module 2 sama denagan 0
            System.out.println("Yang ini dieksekusi (%)"); //output dicetak (false)
        } else {
            System.out.println("Lain-lain");
        }
    }
}