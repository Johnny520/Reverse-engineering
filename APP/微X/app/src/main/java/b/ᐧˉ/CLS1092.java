// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ᵔʾ.CLS1229;

public final class CLS1092 implements CLS11 {
    public final CLS81 FLD2373;
    public final CLS1062 FLD2374;

    public CLS1092(CLS1062 יٴ0, CLS81 יᐧ0) {
        this.FLD2374 = יٴ0;
        this.FLD2373 = יᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
        CLS47.FLD167.MTH1195(this.FLD2373);
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS81 יᐧ0 = this.FLD2373;
        if(יᐧ0.MTH1666() == 0) {
            return;
        }
        יᐧ0.FLD312 = 1;
        CLS47.FLD167.MTH1194(יᐧ0);
        CLS1229 ˆٴ0 = new CLS1229(25, this);
        CLS40.FLD157.MTH1116(((CLS39)ˆٴ0));
    }
}

