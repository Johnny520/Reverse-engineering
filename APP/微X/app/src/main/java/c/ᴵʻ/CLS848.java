// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import c.ﾞʾ.CLS365;
import com.google.zxing.NotFoundException;

public final class CLS848 extends CLS836 {
    public final String FLD1074;
    public final String FLD1075;

    public CLS848(CLS365 ⁱˋ0, String s, String s1) {
        super(ⁱˋ0);
        this.FLD1074 = s1;
        this.FLD1075 = s;
    }

    @Override  // c.ᴵʻ.CLS836
    public int MTH3504(int v) {
        return v % 100000;
    }

    @Override  // c.ᴵʻ.CLS279
    public String MTH3573() {
        if(((CLS279)this).MTH3572().MTH5007() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ((CLS590)this).MTH3569(stringBuilder0, 8);
        ((CLS836)this).MTH3506(stringBuilder0, 0x30, 20);
        this.MTH3514(stringBuilder0, 68);
        return stringBuilder0.toString();
    }

    public final void MTH3514(StringBuilder stringBuilder0, int v) {
        int v1 = ((CLS279)this).MTH3575().MTH3546(v, 16);
        if(v1 == 0x9600) {
            return;
        }
        stringBuilder0.append('(');
        stringBuilder0.append(this.FLD1074);
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

    @Override  // c.ᴵʻ.CLS836
    public void MTH3505(StringBuilder stringBuilder0, int v) {
        stringBuilder0.append('(');
        stringBuilder0.append(this.FLD1075);
        stringBuilder0.append(v / 100000);
        stringBuilder0.append(')');
    }
}

