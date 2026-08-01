// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.ReaderException;

public final class CLS116 {
    public static final int[] FLD441;
    public final CLS114 FLD442;
    public final CLS115 FLD443;

    static {
        CLS116.FLD441 = new int[]{1, 1, 2};
    }

    public CLS116() {
        this.FLD442 = new CLS114();
        this.FLD443 = new CLS115();
    }

    public CLS271 MTH1704(int v, CLS365 ⁱˋ0, int v1) {
        int[] arr_v = CLS833.MTH1730(ⁱˋ0, v1, false, CLS116.FLD441);
        try {
            return this.FLD443.MTH1693(v, ⁱˋ0, arr_v);
        }
        catch(ReaderException unused_ex) {
            return this.FLD442.MTH1666(v, ⁱˋ0, arr_v);
        }
    }
}

