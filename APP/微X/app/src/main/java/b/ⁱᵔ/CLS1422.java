// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS4;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1622;

public final class CLS1422 implements CLS11 {
    public final CLS1622 FLD4147;
    public final CLS4 FLD4148;

    public CLS1422(CLS1622 ˑٴ0, CLS1481 יˆ0) {
        this.FLD4147 = ˑٴ0;
        this.FLD4148 = יˆ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = this.FLD4147.MTH7285();
        if(TextUtils.isEmpty(CLS443.FLD4310)) {
            CLS443.FLD4310 = s;
        }
        else {
            String s1 = CLS182.MTH3484(4100894028315022133L, new StringBuilder(), s);
            CLS443.FLD4310 = CLS443.FLD4310 + s1;
        }
        this.FLD4148.MTH776(CLS443.FLD4310);
    }
}

