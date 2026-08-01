// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS366;
import b.ﾞˎ.CLS525;

public final class CLS1458 implements CLS378 {
    public final int FLD4313;
    public final CLS366 FLD4314;
    public final Activity FLD4315;

    public CLS1458(Activity activity0, CLS366 ﾞᐧ0, int v) {
        this.FLD4313 = v;
        this.FLD4315 = activity0;
        this.FLD4314 = ﾞᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS366 ﾞᐧ0 = this.FLD4314;
        Activity activity0 = this.FLD4315;
        if(this.FLD4313 == 0) {
            if(CLS500.FLD4928.MTH6895("sort_contacts")) {
                ʻˑ0.MTH7187("sort", ((CLS3)new CLS1437(activity0, ﾞᐧ0, 1)));
            }
            return;
        }
        if(CLS500.FLD4928.MTH6895("sort_contacts")) {
            ʻˑ0.MTH7187("sort", ((CLS3)new CLS1437(activity0, ﾞᐧ0, 2)));
        }
    }
}

