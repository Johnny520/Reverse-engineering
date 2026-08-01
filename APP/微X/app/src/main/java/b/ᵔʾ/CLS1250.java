// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS523;

public final class CLS1250 implements CLS3 {
    public final int FLD3140;
    public final int FLD3141;
    public final Activity FLD3142;
    public final CLS335 FLD3143;

    public CLS1250(Activity activity0, int v, CLS335 ˑٴ0, int v1) {
        this.FLD3140 = v1;
        this.FLD3142 = activity0;
        this.FLD3141 = v;
        this.FLD3143 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS335 ˑٴ0 = this.FLD3143;
        int v = this.FLD3141;
        switch(this.FLD3140) {
            case 0: {
                String s1 = CLS27.MTH889("order");
                CLS1261 ﹶﹳ1 = new CLS1261(ˑٴ0, v, 0);
                CLS523.MTH7165(this.FLD3142, s1, "", String.valueOf(v + 1), 2, ((CLS16)ﹶﹳ1));
                return;
            }
            case 1: {
                String s2 = CLS27.MTH889("order");
                CLS1261 ﹶﹳ2 = new CLS1261(ˑٴ0, v, 2);
                CLS523.MTH7165(this.FLD3142, s2, "", String.valueOf(v + 1), 2, ((CLS16)ﹶﹳ2));
                return;
            }
            default: {
                String s = CLS27.MTH889("order");
                CLS1261 ﹶﹳ0 = new CLS1261(ˑٴ0, v, 1);
                CLS523.MTH7165(this.FLD3142, s, "", String.valueOf(v + 1), 2, ((CLS16)ﹶﹳ0));
            }
        }
    }
}

