// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS796;
import b.ﾞˎ.CLS1622;

public final class CLS1583 implements CLS3 {
    public final int FLD4960;
    public final String FLD4961;
    public final Activity FLD4962;
    public final CLS1622 FLD4963;

    public CLS1583(Activity activity0, String s, CLS1622 ˑٴ0, int v) {
        this.FLD4960 = v;
        this.FLD4962 = activity0;
        this.FLD4961 = s;
        this.FLD4963 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4962;
        CLS1622 ˑٴ0 = this.FLD4963;
        String s = this.FLD4961;
        if(this.FLD4960 == 0) {
            CLS1572 ᵢᵢ0 = new CLS1572(s, ˑٴ0, 1);
            CLS523.MTH7145(activity0, CLS27.MTH889("moment_signature"), ((CLS17)new CLS796(activity0, 5)), ((CLS11)new CLS1598(ᵢᵢ0)));
            return;
        }
        CLS1572 ᵢᵢ1 = new CLS1572(s, ˑٴ0, 2);
        CLS523.MTH7145(activity0, CLS27.MTH889("moment_signature"), ((CLS17)new CLS796(activity0, 5)), ((CLS11)new CLS1598(ᵢᵢ1)));
    }
}

