// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;

public final class CLS261 implements CLS141 {
    public final ArrayList FLD374;
    public final CLS73 FLD375;
    public final ArrayList FLD376;

    public CLS261(ArrayList arrayList0, ArrayList arrayList1, CLS73 ﾞᐧ0) {
        this.FLD374 = arrayList0;
        this.FLD376 = arrayList1;
        this.FLD375 = ﾞᐧ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        this.FLD374.clear();
        this.FLD376.clear();
        this.FLD375.notifyDataSetChanged();
    }
}

