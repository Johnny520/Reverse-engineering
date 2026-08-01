// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;

public final class CLS228 implements CLS141 {
    public final ArrayList FLD269;
    public final ArrayList FLD270;
    public final int FLD271;
    public final CLS73 FLD272;

    public CLS228(ArrayList arrayList0, int v, ArrayList arrayList1, CLS73 ﾞᐧ0) {
        this.FLD269 = arrayList0;
        this.FLD271 = v;
        this.FLD270 = arrayList1;
        this.FLD272 = ﾞᐧ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        this.FLD269.remove(this.FLD271);
        this.FLD270.remove(this.FLD271);
        this.FLD272.notifyDataSetChanged();
    }
}

