// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import c.ﾞʾ.CLS365;
import com.google.zxing.NotFoundException;

public abstract class CLS849 extends CLS836 {
    public CLS849(CLS365 ⁱˋ0) {
        super(ⁱˋ0);
    }

    @Override  // c.ᴵʻ.CLS279
    public String MTH3573() {
        if(((CLS279)this).MTH3572().MTH5007() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ((CLS590)this).MTH3569(stringBuilder0, 5);
        ((CLS836)this).MTH3506(stringBuilder0, 45, 15);
        return stringBuilder0.toString();
    }
}

