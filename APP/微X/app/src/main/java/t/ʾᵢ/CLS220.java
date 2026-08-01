// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import t.ⁱʾ.CLS142;

public final class CLS220 implements CLS142 {
    public final CLS216 FLD249;

    public CLS220(CLS216 ˎﾞ0) {
        this.FLD249 = ˎﾞ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS142
    public final void MTH2167() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS142
    public final void MTH2168(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.FLD249.FLD236.MTH1797("chatfooter_mic.png", s);
    }
}

