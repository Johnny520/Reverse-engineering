// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import c.ˎˊ.CLS118;

public abstract class CLS827 extends CLS412 {
    public CLS827(CLS118 ˆٴ0) {
        super(ˆٴ0);
    }

    public abstract int MTH930(int arg1);

    public final void MTH931(StringBuilder stringBuilder0, int v, int v1) {
        int v2 = ((CLS41)this).MTH941().MTH974(v, v1);
        this.MTH932(stringBuilder0, v2);
        int v3 = this.MTH930(v2);
        int v4 = 100000;
        for(int v5 = 0; v5 < 5; ++v5) {
            if(v3 / v4 == 0) {
                stringBuilder0.append('0');
            }
            v4 /= 10;
        }
        stringBuilder0.append(v3);
    }

    public abstract void MTH932(StringBuilder arg1, int arg2);
}

