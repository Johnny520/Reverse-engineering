// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS426;

public final class CLS840 implements CLS11 {
    public final String FLD1311;
    public final CLS3 FLD1312;
    public final String FLD1313;
    public final CLS794 FLD1314;

    public CLS840(CLS794 ᴵʽ0, String s, String s1, CLS844 ⁱˉ0) {
        this.FLD1314 = ᴵʽ0;
        this.FLD1311 = s;
        this.FLD1313 = s1;
        this.FLD1312 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = this.FLD1311;
        boolean z = CLS426.MTH6126(s);
        CLS794 ᴵʽ0 = this.FLD1314;
        if(z) {
            ᴵʽ0.getClass();
            CLS66.MTH1436(s, CLS27.MTH904());
        }
        else {
            CLS66.MTH1507(s);
        }
        ᴵʽ0.FLD1147.MTH1620(this.FLD1313, s);
        this.FLD1312.MTH774();
    }
}

