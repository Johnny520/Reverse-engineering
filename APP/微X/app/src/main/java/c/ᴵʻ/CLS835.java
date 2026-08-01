// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import c.ﾞʾ.CLS365;
import com.google.zxing.NotFoundException;

public final class CLS835 extends CLS590 {
    public CLS835(CLS365 ⁱˋ0) {
        super(ⁱˋ0);
    }

    @Override  // c.ᴵʻ.CLS279
    public String MTH3573() {
        if(((CLS279)this).MTH3572().MTH5007() < 0x30) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ((CLS590)this).MTH3569(stringBuilder0, 8);
        int v = ((CLS279)this).MTH3575().MTH3546(0x30, 2);
        stringBuilder0.append("(392");
        stringBuilder0.append(v);
        stringBuilder0.append(')');
        stringBuilder0.append(((CLS279)this).MTH3575().MTH3539(50, null).MTH3566());
        return stringBuilder0.toString();
    }
}

