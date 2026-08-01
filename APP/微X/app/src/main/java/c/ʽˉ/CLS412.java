// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import c.ˎˊ.CLS118;

public abstract class CLS412 extends CLS41 {
    public CLS412(CLS118 ˆٴ0) {
        super(ˆٴ0);
    }

    public static void MTH985(StringBuilder stringBuilder0, int v) {
        int v1 = 0;
        int v2 = 0;
        for(int v3 = 0; v3 < 13; ++v3) {
            int v4 = stringBuilder0.charAt(v3 + v) - 0x30;
            if((v3 & 1) == 0) {
                v4 *= 3;
            }
            v2 += v4;
        }
        int v5 = 10 - v2 % 10;
        if(v5 != 10) {
            v1 = v5;
        }
        stringBuilder0.append(v1);
    }

    public final void MTH986(StringBuilder stringBuilder0, int v, int v1) {
        for(int v2 = 0; v2 < 4; ++v2) {
            int v3 = ((CLS41)this).MTH941().MTH974(v2 * 10 + v, 10);
            if(v3 / 100 == 0) {
                stringBuilder0.append('0');
            }
            if(v3 / 10 == 0) {
                stringBuilder0.append('0');
            }
            stringBuilder0.append(v3);
        }
        CLS412.MTH985(stringBuilder0, v1);
    }

    public final void MTH987(StringBuilder stringBuilder0, int v) {
        stringBuilder0.append("(01)");
        stringBuilder0.append('9');
        this.MTH986(stringBuilder0, v, stringBuilder0.length());
    }
}

