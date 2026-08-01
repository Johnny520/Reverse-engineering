// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS523;

public final class CLS1071 implements CLS3 {
    public final int FLD2296;
    public final int FLD2297;
    public final Activity FLD2298;
    public final CLS359 FLD2299;

    public CLS1071(Activity activity0, int v, CLS359 ⁱˉ0, int v1) {
        this.FLD2296 = v1;
        this.FLD2298 = activity0;
        this.FLD2297 = v;
        this.FLD2299 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS359 ⁱˉ0 = this.FLD2299;
        int v = this.FLD2297;
        switch(this.FLD2296) {
            case 0: {
                String s1 = CLS27.MTH889("order");
                CLS1047 ˑـ1 = new CLS1047(ⁱˉ0, v, 0);
                CLS523.MTH7165(this.FLD2298, s1, "", String.valueOf(v + 1), 2, ((CLS16)ˑـ1));
                return;
            }
            case 1: {
                String s2 = CLS27.MTH889("order");
                CLS1047 ˑـ2 = new CLS1047(ⁱˉ0, v, 1);
                CLS523.MTH7165(this.FLD2298, s2, "", String.valueOf(v + 1), 2, ((CLS16)ˑـ2));
                return;
            }
            case 2: {
                String s3 = CLS27.MTH889("order");
                CLS1047 ˑـ3 = new CLS1047(ⁱˉ0, v, 2);
                CLS523.MTH7165(this.FLD2298, s3, "", String.valueOf(v + 1), 2, ((CLS16)ˑـ3));
                return;
            }
            default: {
                String s = CLS27.MTH889("order");
                CLS1047 ˑـ0 = new CLS1047(ⁱˉ0, v, 3);
                CLS523.MTH7165(this.FLD2298, s, "", String.valueOf(v + 1), 2, ((CLS16)ˑـ0));
            }
        }
    }
}

