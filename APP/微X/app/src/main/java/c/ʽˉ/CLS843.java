// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import c.ˎˊ.CLS118;
import com.google.zxing.NotFoundException;

public final class CLS843 extends CLS827 {
    public final String FLD148;
    public final String FLD149;

    public CLS843(CLS118 ˆٴ0, String s, String s1) {
        super(ˆٴ0);
        this.FLD148 = s1;
        this.FLD149 = s;
    }

    public final void MTH912(StringBuilder stringBuilder0, int v) {
        int v1 = ((CLS41)this).MTH941().MTH974(v, 16);
        if(v1 == 0x9600) {
            return;
        }
        stringBuilder0.append('(');
        stringBuilder0.append(this.FLD148);
        stringBuilder0.append(')');
        int v2 = v1 / 0x20 % 12 + 1;
        int v3 = v1 / 0x20 / 12;
        if(v3 / 10 == 0) {
            stringBuilder0.append('0');
        }
        stringBuilder0.append(v3);
        if(v2 / 10 == 0) {
            stringBuilder0.append('0');
        }
        stringBuilder0.append(v2);
        if(v1 % 0x20 / 10 == 0) {
            stringBuilder0.append('0');
        }
        stringBuilder0.append(v1 % 0x20);
    }

    @Override  // c.ʽˉ.CLS827
    public int MTH930(int v) {
        return v % 100000;
    }

    @Override  // c.ʽˉ.CLS827
    public void MTH932(StringBuilder stringBuilder0, int v) {
        stringBuilder0.append('(');
        stringBuilder0.append(this.FLD149);
        stringBuilder0.append(v / 100000);
        stringBuilder0.append(')');
    }

    @Override  // c.ʽˉ.CLS41
    public String MTH944() {
        if(((CLS41)this).MTH943().MTH2347() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ((CLS412)this).MTH987(stringBuilder0, 8);
        ((CLS827)this).MTH931(stringBuilder0, 0x30, 20);
        this.MTH912(stringBuilder0, 68);
        return stringBuilder0.toString();
    }
}

