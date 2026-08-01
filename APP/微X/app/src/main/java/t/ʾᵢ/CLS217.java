// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;

public final class CLS217 implements CLS141 {
    public final ArrayList FLD243;
    public final ArrayList FLD244;
    public final int FLD245;
    public final CLS73 FLD246;

    public CLS217(ArrayList arrayList0, int v, ArrayList arrayList1, CLS73 ﾞᐧ0) {
        this.FLD243 = arrayList0;
        this.FLD245 = v;
        this.FLD244 = arrayList1;
        this.FLD246 = ﾞᐧ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        this.FLD243.remove(this.FLD245);
        this.FLD244.remove(this.FLD245);
        this.FLD246.notifyDataSetChanged();
    }
}

