package hw_3.base.classes.checkInputData;

import hw_3.base.abstractClasses.ACheckQuantity;
import hw_3.base.exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}
