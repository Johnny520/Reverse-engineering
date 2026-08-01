// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.util.SparseArray;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ـˏ.CLS889;
import b.ⁱʾ.CLS1274;

public final class CLS589 implements CLS12 {
    public final int FLD426;
    public final int FLD427;
    public final long FLD428;
    public final String FLD429;
    public final SparseArray FLD430;
    public final CLS3 FLD431;

    public CLS589(String s, long v, SparseArray sparseArray0, int v1, CLS1274 ﾞˎ0, int v2) {
        this.FLD426 = v2;
        this.FLD429 = s;
        this.FLD428 = v;
        this.FLD430 = sparseArray0;
        this.FLD427 = v1;
        this.FLD431 = ﾞˎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS3 ˆٴ0 = this.FLD431;
        int v = this.FLD427;
        SparseArray sparseArray0 = this.FLD430;
        String s = this.FLD429;
        long v1 = this.FLD428;
        if(this.FLD426 == 0) {
            sparseArray0.put(v, new CLS889(v1, s));
            if(ˆٴ0 != null) {
                ˆٴ0.MTH774();
            }
            return;
        }
        sparseArray0.put(v, new CLS889(v1, s));
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
    }
}

