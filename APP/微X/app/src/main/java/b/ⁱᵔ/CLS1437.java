// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ˈˈ.CLS71;
import b.ⁱʾ.CLS366;

public final class CLS1437 implements CLS3 {
    public final int FLD4247;
    public final CLS366 FLD4248;
    public final Activity FLD4249;

    public CLS1437(Activity activity0, CLS366 ﾞᐧ0, int v) {
        this.FLD4247 = v;
        this.FLD4249 = activity0;
        this.FLD4248 = ﾞᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS366 ﾞᐧ0 = this.FLD4248;
        Activity activity0 = this.FLD4249;
        switch(this.FLD4247) {
            case 0: {
                CLS71 ˆٴ1 = new CLS71(activity0, null);
                ˆٴ1.MTH1572("sort_recent", ((CLS3)new CLS1402(ﾞᐧ0, 3)));
                ˆٴ1.MTH1572("sort_alphabet", ((CLS3)new CLS1402(ﾞᐧ0, 4)));
                ˆٴ1.MTH1572("sort_reverse", ((CLS3)new CLS1402(ﾞᐧ0, 5)));
                ˆٴ1.MTH1573();
                return;
            }
            case 1: {
                CLS71 ˆٴ2 = new CLS71(activity0, null);
                ˆٴ2.MTH1572("sort_recent", ((CLS3)new CLS1402(ﾞᐧ0, 0)));
                ˆٴ2.MTH1572("sort_alphabet", ((CLS3)new CLS1402(ﾞᐧ0, 1)));
                ˆٴ2.MTH1572("sort_reverse", ((CLS3)new CLS1402(ﾞᐧ0, 2)));
                ˆٴ2.MTH1573();
                return;
            }
            default: {
                CLS71 ˆٴ0 = new CLS71(activity0, null);
                ˆٴ0.MTH1572("sort_recent", ((CLS3)new CLS1402(ﾞᐧ0, 6)));
                ˆٴ0.MTH1572("sort_alphabet", ((CLS3)new CLS1402(ﾞᐧ0, 7)));
                ˆٴ0.MTH1572("sort_reverse", ((CLS3)new CLS1402(ﾞᐧ0, 8)));
                ˆٴ0.MTH1573();
            }
        }
    }
}

