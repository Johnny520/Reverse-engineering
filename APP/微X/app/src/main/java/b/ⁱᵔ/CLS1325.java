// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS1272;
import b.ⁱʾ.CLS359;

public final class CLS1325 implements CLS3 {
    public final int FLD3665;
    public final CLS359 FLD3666;
    public final Activity FLD3667;

    public CLS1325(int v, Activity activity0, CLS359 ⁱˉ0) {
        this.FLD3665 = v;
        this.FLD3667 = activity0;
        this.FLD3666 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS359 ⁱˉ0 = this.FLD3666;
        if(this.FLD3665 == 0) {
            String s = CLS27.MTH889("save");
            CLS1272 ⁱʽ0 = new CLS1272(ⁱˉ0, 4);
            CLS523.MTH7165(this.FLD3667, s, "", "", 1, ((CLS16)ⁱʽ0));
            return;
        }
        String s1 = CLS27.MTH889("save");
        CLS1272 ⁱʽ1 = new CLS1272(ⁱˉ0, 5);
        CLS523.MTH7165(this.FLD3667, s1, "", "", 1, ((CLS16)ⁱʽ1));
    }
}

