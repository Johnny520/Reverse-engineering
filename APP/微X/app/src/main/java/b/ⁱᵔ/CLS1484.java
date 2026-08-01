// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import java.util.HashMap;

public final class CLS1484 implements CLS11 {
    public final String[] FLD4445;
    public final CLS12 FLD4446;
    public final HashMap FLD4447;

    public CLS1484(String[] arr_s, HashMap hashMap0, CLS12 ᵔʾ0) {
        this.FLD4445 = arr_s;
        this.FLD4447 = hashMap0;
        this.FLD4446 = ᵔʾ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            HashMap hashMap0 = this.FLD4447;
            String s = this.FLD4445[0];
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(!hashMap0.containsKey(s)) {
                return;
            }
            String s1 = (String)hashMap0.get(s);
            CLS12 ᵔʾ0 = this.FLD4446;
            if(ᵔʾ0 != null) {
                ᵔʾ0.MTH791(s1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

