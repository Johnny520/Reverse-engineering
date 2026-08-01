// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import java.io.File;
import t.ᵔʾ.CLS125;
import t.ⁱʾ.CLS142;

public final class CLS192 implements CLS142 {
    public final CLS216 FLD125;

    public CLS192(CLS216 ˎﾞ0) {
        this.FLD125 = ˎﾞ0;
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
        if(!CLS125.MTH2023(new File(s))) {
            return;
        }
        this.FLD125.FLD236.MTH1808("right_bubble.9.png", s);
    }
}

