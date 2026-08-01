// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ⁱʾ.CLS341;
import java.util.ArrayList;

public final class CLS1513 implements CLS11 {
    public final CLS341[] FLD4602;
    public final ArrayList FLD4603;
    public final int FLD4604;
    public final ArrayList FLD4605;

    public CLS1513(CLS341[] arr_ـﹳ, int v, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD4602 = arr_ـﹳ;
        this.FLD4604 = v;
        this.FLD4603 = arrayList0;
        this.FLD4605 = arrayList1;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = (String)this.FLD4602[0].getItem(this.FLD4604);
        ArrayList arrayList0 = new ArrayList(this.FLD4603);
        arrayList0.remove(s);
        this.FLD4603.clear();
        this.FLD4603.addAll(arrayList0);
        this.FLD4602[0].MTH5151(arrayList0);
        this.FLD4605.add(s);
    }
}

