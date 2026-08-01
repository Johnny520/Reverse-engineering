// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;

public final class CLS247 implements CLS141 {
    public final ArrayList FLD335;
    public final CLS73 FLD336;
    public final ArrayList FLD337;

    public CLS247(ArrayList arrayList0, ArrayList arrayList1, CLS73 ﾞᐧ0) {
        this.FLD335 = arrayList0;
        this.FLD337 = arrayList1;
        this.FLD336 = ﾞᐧ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        this.FLD335.clear();
        this.FLD337.clear();
        this.FLD336.notifyDataSetChanged();
    }
}

