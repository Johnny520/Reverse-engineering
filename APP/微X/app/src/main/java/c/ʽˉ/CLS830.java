// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import c.ˎˊ.CLS118;
import com.google.zxing.NotFoundException;

public final class CLS830 extends CLS412 {
    public CLS830(CLS118 ˆٴ0) {
        super(ˆٴ0);
    }

    @Override  // c.ʽˉ.CLS41
    public String MTH944() {
        if(((CLS41)this).MTH943().MTH2347() < 0x30) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ((CLS412)this).MTH987(stringBuilder0, 8);
        int v = ((CLS41)this).MTH941().MTH974(0x30, 2);
        stringBuilder0.append("(393");
        stringBuilder0.append(v);
        stringBuilder0.append(')');
        int v1 = ((CLS41)this).MTH941().MTH974(50, 10);
        if(v1 / 100 == 0) {
            stringBuilder0.append('0');
        }
        if(v1 / 10 == 0) {
            stringBuilder0.append('0');
        }
        stringBuilder0.append(v1);
        stringBuilder0.append(((CLS41)this).MTH941().MTH971(60, null).MTH918());
        return stringBuilder0.toString();
    }
}

