package Logic.TypeStuff;

import Logic.TypeStuff.Type;

public class TypesMatchup {
    //more for just looking up
    public enum Results{
        SUPEREFFECTIVE, NORMAL,NOTEFFECTIVE,NOEFFECT
    }

    public static double damageFactorCalculator(Type moveType, Type primaryType
            , Type secondaryType){
        //type of the move -> types of pokemon
        double factor = 1.0;
        if(moveType.isSuperEffective(primaryType)){
            factor *= 2;
        }
        else if(moveType.isNotEffective(primaryType)){
            factor /= 2;
        }
        else if(moveType.isNoEffect(primaryType)){
            factor = 0;
        }


        //secondary type logic
        if(secondaryType != null){
            if(moveType.isSuperEffective(secondaryType)){
                factor *= 2;
            }
            else if(moveType.isNotEffective(secondaryType)){
                factor /= 2;
            }
            else if(moveType.isNoEffect(secondaryType)){
                factor = 0;
            }
        }
        return factor;
    }
}
