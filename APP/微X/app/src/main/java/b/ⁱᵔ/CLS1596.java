// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;

public final class CLS1596 implements CLS11 {
    public final String[] FLD5046;
    public final CLS12 FLD5047;

    public CLS1596(CLS12 ᵔʾ0, String[] arr_s) {
        this.FLD5046 = arr_s;
        this.FLD5047 = ᵔʾ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            String s = this.FLD5046[0];
            if(TextUtils.isEmpty(s)) {
                return;
            }
            CLS12 ᵔʾ0 = this.FLD5047;
            if(ᵔʾ0 != null) {
                ᵔʾ0.MTH791(s);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

