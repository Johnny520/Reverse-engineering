// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ˆʿ.CLS47;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1492 implements CLS3 {
    public final int FLD4474;
    public final CLS359 FLD4475;
    public final CLS47 FLD4476;
    public final Activity FLD4477;
    public final ArrayList FLD4478;

    public CLS1492(Activity activity0, CLS47 ˈˊ0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD4474 = v;
        this.FLD4477 = activity0;
        this.FLD4476 = ˈˊ0;
        this.FLD4478 = arrayList0;
        this.FLD4475 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4477;
        CLS359 ⁱˉ0 = this.FLD4475;
        ArrayList arrayList0 = this.FLD4478;
        CLS47 ˈˊ0 = this.FLD4476;
        if(this.FLD4474 == 0) {
            CLS476.MTH6645(activity0, ((CLS7)new CLS1432(ˈˊ0, arrayList0, ⁱˉ0, 0)), null);
            return;
        }
        CLS476.MTH6645(activity0, ((CLS7)new CLS1432(ˈˊ0, arrayList0, ⁱˉ0, 1)), null);
    }
}

