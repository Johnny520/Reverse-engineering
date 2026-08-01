// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ˆʿ.CLS61;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1549 implements CLS11 {
    public final CLS369 FLD4817;
    public final CLS61 FLD4818;
    public final int FLD4819;
    public final ArrayList FLD4820;

    public CLS1549(CLS369 ﾞᵎ0, int v, CLS61 ﾞٴ0, ArrayList arrayList0) {
        this.FLD4817 = ﾞᵎ0;
        this.FLD4819 = v;
        this.FLD4818 = ﾞٴ0;
        this.FLD4820 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = (String)this.FLD4817.getItem(this.FLD4819);
        this.FLD4818.MTH1317(s);
        this.FLD4820.remove(s);
        this.FLD4817.notifyDataSetChanged();
    }
}

