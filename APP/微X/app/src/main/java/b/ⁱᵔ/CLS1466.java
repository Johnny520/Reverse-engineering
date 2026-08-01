// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ˆʿ.CLS43;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;

public final class CLS1466 implements CLS11 {
    public final CLS366 FLD4353;
    public final ArrayList FLD4354;
    public final CLS43 FLD4355;
    public final int FLD4356;
    public final String FLD4357;

    public CLS1466(CLS366 ﾞᐧ0, int v, CLS43 ˆʿ0, String s, ArrayList arrayList0) {
        this.FLD4353 = ﾞᐧ0;
        this.FLD4356 = v;
        this.FLD4355 = ˆʿ0;
        this.FLD4357 = s;
        this.FLD4354 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = (String)this.FLD4353.getItem(this.FLD4356);
        this.FLD4355.getClass();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s);
        this.FLD4355.MTH1156(this.FLD4357, arrayList0);
        this.FLD4354.remove(this.FLD4356);
        this.FLD4353.notifyDataSetChanged();
    }
}

