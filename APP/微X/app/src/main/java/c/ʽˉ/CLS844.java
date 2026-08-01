// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import c.ˎˊ.CLS118;
import com.google.zxing.NotFoundException;

public abstract class CLS844 extends CLS827 {
    public CLS844(CLS118 ˆٴ0) {
        super(ˆٴ0);
    }

    @Override  // c.ʽˉ.CLS41
    public String MTH944() {
        if(((CLS41)this).MTH943().MTH2347() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ((CLS412)this).MTH987(stringBuilder0, 5);
        ((CLS827)this).MTH931(stringBuilder0, 45, 15);
        return stringBuilder0.toString();
    }
}

