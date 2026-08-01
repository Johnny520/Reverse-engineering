// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS126;

public final class CLS150 implements CLS123 {
    public final CLS10 FLD164;
    public final int FLD165;
    public final CLS126 FLD166;

    public CLS150(CLS10 ʻﹶ0, CLS126 ⁱﾞ0, int v) {
        this.FLD165 = v;
        this.FLD164 = ʻﹶ0;
        this.FLD166 = ⁱﾞ0;
        super();
    }

    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        CLS126 ⁱﾞ0 = this.FLD166;
        CLS10 ʻﹶ0 = this.FLD164;
        if(this.FLD165 == 0) {
            CLS46.FLD233.FLD234.remove(ʻﹶ0);
            if(ⁱﾞ0 != null) {
                ⁱﾞ0.MTH1183();
            }
            return;
        }
        CLS46.FLD233.FLD234.remove(ʻﹶ0);
        if(ⁱﾞ0 != null) {
            ⁱﾞ0.MTH1183();
        }
    }
}

