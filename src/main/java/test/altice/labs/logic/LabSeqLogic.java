package test.altice.labs.logic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import test.altice.labs.model.OutPut;

public class LabSeqLogic {

    private static List<BigInteger> sequence = new ArrayList<>(){{
        add(new BigInteger("0"));
        add(new BigInteger("1"));
        add(new BigInteger("0"));
        add(new BigInteger("1"));
    }};

    public static OutPut getValueByIndex(Integer index){

        if (index < 0)
            index = Math.abs(index);
        
        if(index > sequence.size() - 1)
            for(int i = sequence.size(); i <= index; i++)
                sequence.add(sequence.get(i - 4).add(sequence.get(i - 3)));
                
        return new OutPut(sequence.get(index).toString());

    }

}
