// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS140;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;

public final class CLS185 implements CLS143 {
    public final int FLD97;
    public final CLS144 FLD98;
    public final Activity FLD99;
    public final int FLD100;

    public CLS185(Activity activity0, CLS144 ˊﾞ0, int v, int v1) {
        this.FLD97 = v1;
        this.FLD99 = activity0;
        this.FLD98 = ˊﾞ0;
        this.FLD100 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        Activity activity0 = this.FLD99;
        int v = this.FLD100;
        CLS144 ˊﾞ0 = this.FLD98;
        if(this.FLD97 == 0) {
            CLS43.MTH1430(activity0, CLS133.MTH2099("order"), "", 2, ((CLS140)new CLS202(ˊﾞ0, v, 0)));
            return;
        }
        CLS43.MTH1430(activity0, CLS133.MTH2099("order"), "", 2, ((CLS140)new CLS202(ˊﾞ0, v, 1)));
    }
}

