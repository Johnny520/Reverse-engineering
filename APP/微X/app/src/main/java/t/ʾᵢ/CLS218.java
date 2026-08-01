// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import java.io.File;
import t.ᵔʾ.CLS125;
import t.ⁱʾ.CLS142;

public final class CLS218 implements CLS142 {
    public final CLS216 FLD247;

    public CLS218(CLS216 ˎﾞ0) {
        this.FLD247 = ˎﾞ0;
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
        this.FLD247.FLD236.MTH1808("left_bubble.9.png", s);
    }
}

