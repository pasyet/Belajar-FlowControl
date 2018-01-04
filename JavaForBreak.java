public class JavaForBreak{
    public static void main (String[] args){
        for (int i=0; i<10;i++){//output akan dicetak sampai //kondisi awal i =0; i akan incrent i=0+1; i akan dicek apa masih kurang dari 10
            if (i==5) break;//jika i sama dengan 5 makan akan berhenti dicetak
            System.out.println("Saya berada Index ke " +i);
        }
    }

}