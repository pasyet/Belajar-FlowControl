public class JavaForCount{
    public static void main (String[] args){
        for (int i=0; i<4;i++){//output akan dicetak sampai //kondisi awal i =0; i akan incrent i=0+1; i akan dicek apa masih kurang dari 4
            if (i==2) break;//jika i mencetak output tapi i akan mengskip 2
            System.out.println("Saya berada Index ke " +i);
        }
    }

}