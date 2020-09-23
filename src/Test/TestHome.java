package Test;

import Logic.MoveStuff.Move;
import Logic.Pokemon;
import Logic.TypeStuff.Type;

public class TestHome {
    public static void main(String [] args){
        //TypeMatchupTableTest.print();
        Pokemon p = new Pokemon("Pikachu");
        System.out.println(p.getMoves().size());
        System.out.println(p.getMoves().capacity() + "\n");
        for(int i = 0; i < 10; i++){
            p.addMove(new Move());

            System.out.println(p.getMoves().size());
            System.out.println(p.getMoves().capacity() + "\n");
        }






    }
}
