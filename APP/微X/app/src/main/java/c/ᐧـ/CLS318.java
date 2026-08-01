// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS379;
import com.google.zxing.ReaderException;

public final class CLS318 {
    public final CLS319 FLD1435;
    public final CLS320 FLD1436;
    public static final int[] FLD1437;

    static {
        CLS318.FLD1437 = new int[]{1, 1, 2};
    }

    public CLS318() {
        this.FLD1436 = new CLS320();
        this.FLD1435 = new CLS319();
    }

    public CLS379 MTH4600(int v, CLS118 ˆٴ0, int v1) {
        int[] arr_v = CLS836.MTH4637(ˆٴ0, v1, false, CLS318.FLD1437);
        try {
            return this.FLD1435.MTH4619(v, ˆٴ0, arr_v);
        }
        catch(ReaderException unused_ex) {
            return this.FLD1436.MTH4651(v, ˆٴ0, arr_v);
        }
    }
}

