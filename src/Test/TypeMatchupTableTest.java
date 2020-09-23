package Test;

import Logic.TypeStuff.Type;
import Logic.TypeStuff.TypesMatchup;

import java.util.Vector;

public class TypeMatchupTableTest {
    public static void print(){
        Vector<Type> types = new Vector<Type>();

        types.add(new Type("normal"));
        types.add(new Type("fire"));
        types.add(new Type("water"));
        types.add(new Type("electric"));
        types.add(new Type("grass"));
        types.add(new Type("ice"));
        types.add(new Type("fighting"));
        types.add(new Type("poison"));
        types.add(new Type("ground"));
        types.add(new Type("flying"));
        types.add(new Type("physic"));
        types.add(new Type("bug"));
        types.add(new Type("rock"));
        types.add(new Type("ghost"));
        types.add(new Type("dragon"));
        types.add(new Type("dark"));
        types.add(new Type("steel"));
        types.add(new Type("fairy"));

        double factor;
        for(int i = 0; i < types.size(); i++){
            for(int j = 0; j < types.size(); j++){
                factor = TypesMatchup.damageFactorCalculator(types.get(i),
                        types.get(j),null);

                System.out.println(types.get(i).getType() + " --> "
                        + types.get(j).getType() + ": " + factor);


            }
            System.out.println();
        }
    }
}
