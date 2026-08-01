// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS403;

public final class CLS586 implements CLS3 {
    public final int FLD418;
    public final Activity FLD419;
    public final CLS603 FLD420;

    public CLS586(CLS603 ᐧⁱ0, Activity activity0, int v) {
        this.FLD418 = v;
        this.FLD420 = ᐧⁱ0;
        this.FLD419 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD419;
        CLS603 ᐧⁱ0 = this.FLD420;
        switch(this.FLD418) {
            case 0: {
                String s = ᐧⁱ0.FLD465;
                CLS403.MTH5863(activity0, ((CLS12)new CLS591(ᐧⁱ0, 2)), s);
                return;
            }
            case 1: {
                String s1 = ᐧⁱ0.FLD464;
                CLS387.MTH5588(activity0, ((CLS12)new CLS591(ᐧⁱ0, 1)), s1);
                return;
            }
            case 2: {
                String s2 = ᐧⁱ0.FLD466;
                CLS403.MTH5867(activity0, ((CLS12)new CLS591(ᐧⁱ0, 0)), s2);
                return;
            }
            default: {
                ᐧⁱ0.MTH1883(activity0);
            }
        }
    }
}

