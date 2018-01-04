public class JavaIfElif{
    public static void main (String[] args){
        int bil1 = 100; // input bil1 100
        int bil2 = -100; // input bil2 -100

        if (bil1 == bil2){ //Jika bil1 sama bil2 maka 
            System.out.println("100 sama -100"); // output tidak dicetak (false)
        } else if (bil1 != bil2){ //Jika bil1 tidak sama bil2 maka
            System.out.println("100 tidak sama -100");// output dicetak (true)
        } else {
            System.out.println("Lain-lain");
        }
    }
}