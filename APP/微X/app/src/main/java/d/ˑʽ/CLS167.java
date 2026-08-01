// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import d.ٴˑ.CLS178;
import d.ٴˑ.CLS190;
import d.ⁱٴ.CLS121;
import d.ⁱٴ.CLS126;

public final class CLS167 implements CLS126 {
    public final CLS190 FLD251;
    public final CLS121 FLD252;
    public final CLS190 FLD253;
    public final CLS190 FLD254;
    public final CLS190 FLD255;

    public CLS167(CLS190 ᵎᐧ0, CLS190 ᵎᐧ1, CLS190 ᵎᐧ2, CLS190 ᵎᐧ3, CLS178 ʼᵔ0) {
        this.FLD253 = ᵎᐧ0;
        this.FLD251 = ᵎᐧ1;
        this.FLD255 = ᵎᐧ2;
        this.FLD254 = ᵎᐧ3;
        this.FLD252 = ʼᵔ0;
        super();
    }

    @Override  // d.ⁱٴ.CLS126
    public final void MTH1183() {
        int v = 0;
        int v1 = TextUtils.isEmpty(this.FLD253.MTH1023()) ? 0 : Integer.parseInt(this.FLD253.MTH1023());
        int v2 = TextUtils.isEmpty(this.FLD251.MTH1023()) ? 0 : Integer.parseInt(this.FLD251.MTH1023());
        int v3 = TextUtils.isEmpty(this.FLD255.MTH1023()) ? 0 : Integer.parseInt(this.FLD255.MTH1023());
        CLS190 ᵎᐧ0 = this.FLD254;
        if(!TextUtils.isEmpty(ᵎᐧ0.MTH1023())) {
            v = Integer.parseInt(ᵎᐧ0.MTH1023());
        }
        this.FLD252.MTH1171(((long)(v + 3600000 * v1 + 60000 * v2 + 1000 * v3)));
    }

    @Override  // d.ⁱٴ.CLS126
    public final void MTH1184() {
    }
}

