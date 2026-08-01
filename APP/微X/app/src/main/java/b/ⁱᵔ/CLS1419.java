// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1419 implements CLS11 {
    public final CLS369 FLD4140;
    public final ArrayList FLD4141;
    public final int FLD4142;
    public final HashSet FLD4143;

    public CLS1419(CLS369 ﾞᵎ0, int v, ArrayList arrayList0, HashSet hashSet0) {
        this.FLD4140 = ﾞᵎ0;
        this.FLD4142 = v;
        this.FLD4141 = arrayList0;
        this.FLD4143 = hashSet0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = (String)this.FLD4140.getItem(this.FLD4142);
        this.FLD4141.remove(s);
        this.FLD4140.notifyDataSetChanged();
        this.FLD4143.remove(s);
    }
}

