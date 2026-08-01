// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;

public final class CLS193 implements CLS141 {
    public final ArrayList FLD126;
    public final ArrayList FLD127;
    public final int FLD128;
    public final CLS73 FLD129;

    public CLS193(ArrayList arrayList0, int v, ArrayList arrayList1, CLS73 ﾞᐧ0) {
        this.FLD126 = arrayList0;
        this.FLD128 = v;
        this.FLD127 = arrayList1;
        this.FLD129 = ﾞᐧ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        this.FLD126.remove(this.FLD128);
        this.FLD127.remove(this.FLD128);
        this.FLD129.notifyDataSetChanged();
    }
}

