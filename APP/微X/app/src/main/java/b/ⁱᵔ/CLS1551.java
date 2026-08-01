// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;

public final class CLS1551 implements CLS8 {
    public final CLS8 FLD4827;

    public CLS1551(CLS8 ـˏ0) {
        this.FLD4827 = ـˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        String s = (String)object0;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS8 ـˏ0 = this.FLD4827;
        if(ـˏ0 != null) {
            try {
                ـˏ0.MTH786(s);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

