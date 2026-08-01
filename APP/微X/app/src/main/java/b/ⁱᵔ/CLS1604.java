// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;

public final class CLS1604 implements CLS11 {
    public final CLS1622 FLD5078;
    public final CLS1621 FLD5079;

    public CLS1604(CLS1622 ˑٴ0, CLS1621 ˎᵢ0) {
        this.FLD5078 = ˑٴ0;
        this.FLD5079 = ˎᵢ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            String s = this.FLD5078.MTH7285();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            CLS21.FLD76.MTH818("dialogRemark", new Object[]{((int)this.FLD5079.FLD5241), s});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

