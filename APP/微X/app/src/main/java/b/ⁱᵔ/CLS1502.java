// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;

public final class CLS1502 implements CLS11 {
    public final CLS1622 FLD4552;
    public final CLS16 FLD4553;
    public final CLS1622 FLD4554;

    public CLS1502(CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS16 ﾞˎ0) {
        this.FLD4552 = ˑٴ0;
        this.FLD4554 = ˑٴ1;
        this.FLD4553 = ﾞˎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            String s = this.FLD4552.MTH7285();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            String s1 = this.FLD4554.MTH7285();
            CLS16 ﾞˎ0 = this.FLD4553;
            if(ﾞˎ0 != null) {
                ﾞˎ0.MTH795(s + "#" + s1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

