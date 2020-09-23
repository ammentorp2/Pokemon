package Logic.Battle;

import Logic.MoveStuff.Move;
import Logic.MoveStuff.MoveCategory;
import Logic.Pokemon;
import Logic.TypeStuff.TypesMatchup;

public class DamageCalculator {

    //this is for a normal attack
    public static int damageCalc(Pokemon attacker, Move theMove,
                                 Pokemon defender){
        int damage = 0;

        damage = ((2 * attacker.getLevel() / 5) + 2) * theMove.getPower();

        //*A/D

        if(theMove.getTypeOfMove() == MoveCategory.PHYSICAL){
            damage = damage * attacker.getDefense() / defender.getDefense();
        }
        else if(theMove.getTypeOfMove() == MoveCategory.SPECIAL){
            damage = damage * attacker.getSpecialAttack() / defender.getSpecialDefense();
        }
        else{
            throw new IllegalArgumentException("Moves can only be physical or special!");
        }

        damage = (damage / 50 + 2) * getModifier(attacker,theMove,defender);

        return damage;
    }
    //this is where outside conditions come in to the battle
    private static int getModifier(Pokemon attacker, Move theMove,
                                  Pokemon defender){
        //modifier = target * weather * critical * random * STAB
        //                  * type * burn * other

        double modifier = 1;
        //target

        //weather

        //critical
        if(theMove.isCritical()){
            modifier = modifier * 2;
        }
        //random

        //Stab
        if(theMove.getMoveType().equals(attacker.getPrimaryType())||
                theMove.getMoveType().equals(attacker.getSecondaryType())){
            modifier = modifier * 1.5;
            //todo check for adapability ability-> then its *2
        }
        //Type matchup
        modifier = modifier * TypesMatchup.damageFactorCalculator(theMove.getMoveType(),
                defender.getPrimaryType(),defender.getSecondaryType());

        //Burn

        //other


        return (int)modifier;
    }
}
