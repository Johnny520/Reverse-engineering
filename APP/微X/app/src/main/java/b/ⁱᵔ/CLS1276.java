// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ﾞˎ.CLS1622;

public final class CLS1276 implements CLS11 {
    public final CLS1622 FLD3475;
    public final CLS12 FLD3476;
    public final CLS1622 FLD3477;
    public final CLS1622 FLD3478;
    public final CLS1622 FLD3479;

    public CLS1276(CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1622 ˑٴ2, CLS1622 ˑٴ3, CLS12 ᵔʾ0) {
        this.FLD3475 = ˑٴ0;
        this.FLD3478 = ˑٴ1;
        this.FLD3477 = ˑٴ2;
        this.FLD3479 = ˑٴ3;
        this.FLD3476 = ᵔʾ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        int v = 0;
        int v1 = TextUtils.isEmpty(this.FLD3475.MTH7285()) ? 0 : Integer.parseInt(this.FLD3475.MTH7285());
        int v2 = TextUtils.isEmpty(this.FLD3478.MTH7285()) ? 0 : Integer.parseInt(this.FLD3478.MTH7285());
        int v3 = TextUtils.isEmpty(this.FLD3477.MTH7285()) ? 0 : Integer.parseInt(this.FLD3477.MTH7285());
        CLS1622 ˑٴ0 = this.FLD3479;
        if(!TextUtils.isEmpty(ˑٴ0.MTH7285())) {
            v = Integer.parseInt(ˑٴ0.MTH7285());
        }
        this.FLD3476.MTH791(((long)(3600000 * v1 + 60000 * v2 + 1000 * v3 + v)));
    }
}

