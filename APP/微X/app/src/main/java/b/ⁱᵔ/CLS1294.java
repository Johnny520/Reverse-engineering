// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS82;
import b.ⁱʾ.CLS326;
import java.util.ArrayList;

public final class CLS1294 implements CLS11 {
    public final CLS54 FLD3579;
    public final CLS326 FLD3580;
    public final ArrayList FLD3581;

    public CLS1294(CLS326 ˉᐧ0, CLS54 ᐧˉ0, ArrayList arrayList0) {
        this.FLD3579 = ᐧˉ0;
        this.FLD3581 = arrayList0;
        this.FLD3580 = ˉᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            CLS54 ᐧˉ0 = this.FLD3579;
            for(Object object0: ᐧˉ0.FLD171.values()) {
                ᐧˉ0.MTH1246(((CLS82)object0));
            }
            this.FLD3581.clear();
            this.FLD3580.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

