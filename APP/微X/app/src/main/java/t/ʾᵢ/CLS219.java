// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import t.ⁱʾ.CLS142;

public final class CLS219 implements CLS142 {
    public final CLS216 FLD248;

    public CLS219(CLS216 ˎﾞ0) {
        this.FLD248 = ˎﾞ0;
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
        this.FLD248.FLD236.MTH1808("chatfooter_edit_bg.png", s);
    }
}

