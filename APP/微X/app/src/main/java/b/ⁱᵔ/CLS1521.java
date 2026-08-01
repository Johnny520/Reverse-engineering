// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS1521 implements CLS11 {
    public final ArrayList FLD4667;
    public final CLS335 FLD4668;
    public final int FLD4669;

    public CLS1521(int v, CLS335 ˑٴ0, ArrayList arrayList0) {
        this.FLD4667 = arrayList0;
        this.FLD4669 = v;
        this.FLD4668 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD4667.remove(this.FLD4669);
        this.FLD4668.MTH5111(this.FLD4667);
    }
}

