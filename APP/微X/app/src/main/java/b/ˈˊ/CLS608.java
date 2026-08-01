// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS403;

public final class CLS608 implements CLS3 {
    public final int FLD483;
    public final Activity FLD484;
    public final CLS606 FLD485;

    public CLS608(CLS606 ⁱʽ0, Activity activity0, int v) {
        this.FLD483 = v;
        this.FLD485 = ⁱʽ0;
        this.FLD484 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD484;
        CLS606 ⁱʽ0 = this.FLD485;
        switch(this.FLD483) {
            case 0: {
                String s = ⁱʽ0.FLD472;
                CLS403.MTH5863(activity0, ((CLS12)new CLS597(ⁱʽ0, 2)), s);
                return;
            }
            case 1: {
                String s1 = ⁱʽ0.FLD471;
                CLS387.MTH5588(activity0, ((CLS12)new CLS597(ⁱʽ0, 0)), s1);
                return;
            }
            case 2: {
                String s2 = ⁱʽ0.FLD473;
                CLS403.MTH5867(activity0, ((CLS12)new CLS597(ⁱʽ0, 1)), s2);
                return;
            }
            default: {
                ⁱʽ0.MTH1901(activity0);
            }
        }
    }
}

