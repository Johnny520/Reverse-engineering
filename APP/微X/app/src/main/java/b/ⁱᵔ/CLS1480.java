// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;

public final class CLS1480 implements CLS3 {
    public final int FLD4422;
    public final CLS8 FLD4423;
    public final Activity FLD4424;

    public CLS1480(Activity activity0, CLS8 ـˏ0, int v) {
        this.FLD4422 = v;
        this.FLD4424 = activity0;
        this.FLD4423 = ـˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS8 ـˏ0 = this.FLD4423;
        Activity activity0 = this.FLD4424;
        if(this.FLD4422 == 0) {
            String s = CLS27.MTH889("select_web_fav_categorie");
            CLS395.MTH5747(activity0, ((CLS12)new CLS1533(activity0, ـˏ0, 0)), s);
            return;
        }
        String s1 = CLS27.MTH889("select_web_fav_categorie");
        CLS395.MTH5747(activity0, ((CLS12)new CLS1533(activity0, ـˏ0, 1)), s1);
    }
}

