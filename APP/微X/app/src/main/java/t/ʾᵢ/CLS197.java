// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˆٴ.CLS70;
import t.ⁱʾ.CLS141;

public final class CLS197 implements CLS141 {
    public final ArrayList FLD162;
    public final CLS70 FLD163;
    public final int FLD164;

    public CLS197(ArrayList arrayList0, int v, CLS70 ﾞٴ0) {
        this.FLD162 = arrayList0;
        this.FLD164 = v;
        this.FLD163 = ﾞٴ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        this.FLD162.remove(this.FLD164);
        this.FLD163.notifyDataSetChanged();
    }
}

