// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;

public final class CLS231 implements CLS141 {
    public final ArrayList FLD276;
    public final CLS73 FLD277;
    public final ArrayList FLD278;

    public CLS231(ArrayList arrayList0, ArrayList arrayList1, CLS73 ﾞᐧ0) {
        this.FLD276 = arrayList0;
        this.FLD278 = arrayList1;
        this.FLD277 = ﾞᐧ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        this.FLD276.clear();
        this.FLD278.clear();
        this.FLD277.notifyDataSetChanged();
    }
}

