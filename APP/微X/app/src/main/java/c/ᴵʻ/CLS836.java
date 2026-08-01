// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import c.ﾞʾ.CLS365;

public abstract class CLS836 extends CLS590 {
    public CLS836(CLS365 ⁱˋ0) {
        super(ⁱˋ0);
    }

    public abstract int MTH3504(int arg1);

    public abstract void MTH3505(StringBuilder arg1, int arg2);

    public final void MTH3506(StringBuilder stringBuilder0, int v, int v1) {
        int v2 = ((CLS279)this).MTH3575().MTH3546(v, v1);
        this.MTH3505(stringBuilder0, v2);
        int v3 = this.MTH3504(v2);
        int v4 = 100000;
        for(int v5 = 0; v5 < 5; ++v5) {
            if(v3 / v4 == 0) {
                stringBuilder0.append('0');
            }
            v4 /= 10;
        }
        stringBuilder0.append(v3);
    }
}

