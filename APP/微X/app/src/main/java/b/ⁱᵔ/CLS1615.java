// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ˆʿ.CLS43;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;

public final class CLS1615 implements CLS2 {
    public final CLS43 FLD5133;
    public final ArrayList FLD5134;
    public final String FLD5135;
    public final CLS366 FLD5136;

    public CLS1615(CLS43 ˆʿ0, String s, ArrayList arrayList0, CLS366 ﾞᐧ0) {
        this.FLD5133 = ˆʿ0;
        this.FLD5135 = s;
        this.FLD5134 = arrayList0;
        this.FLD5136 = ﾞᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        this.FLD5133.MTH1158(this.FLD5135, s);
        this.FLD5134.addAll(arrayList0);
        this.FLD5136.notifyDataSetChanged();
    }
}

