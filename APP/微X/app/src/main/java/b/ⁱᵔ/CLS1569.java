// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1569 implements CLS11 {
    public final ArrayList FLD4901;
    public final CLS369 FLD4902;
    public final HashSet FLD4903;

    public CLS1569(ArrayList arrayList0, HashSet hashSet0, CLS369 ﾞᵎ0) {
        this.FLD4901 = arrayList0;
        this.FLD4903 = hashSet0;
        this.FLD4902 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD4901.clear();
        this.FLD4903.clear();
        this.FLD4902.notifyDataSetChanged();
    }
}

