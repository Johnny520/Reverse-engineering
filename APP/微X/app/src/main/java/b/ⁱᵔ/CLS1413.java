// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ⁱʾ.CLS347;
import java.util.ArrayList;

public final class CLS1413 implements CLS11 {
    public final ArrayList FLD4054;
    public final CLS347 FLD4055;
    public final int FLD4056;

    public CLS1413(ArrayList arrayList0, int v, CLS347 ᐧי0) {
        this.FLD4054 = arrayList0;
        this.FLD4056 = v;
        this.FLD4055 = ᐧי0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD4054.remove(this.FLD4056);
        this.FLD4055.notifyDataSetChanged();
    }
}

