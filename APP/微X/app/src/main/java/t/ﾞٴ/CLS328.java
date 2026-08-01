// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS142;

public final class CLS328 implements CLS141 {
    public final String FLD1073;
    public final CLS331 FLD1074;
    public final CLS142 FLD1075;

    public CLS328(CLS331 ﾞᐧ0, String s, CLS142 ˆʿ0) {
        this.FLD1074 = ﾞᐧ0;
        this.FLD1073 = s;
        this.FLD1075 = ˆʿ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
        CLS142 ˆʿ0 = this.FLD1075;
        if(ˆʿ0 != null) {
            ˆʿ0.MTH2167();
        }
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        CLS331 ﾞᐧ0 = this.FLD1074;
        if(ﾞᐧ0.FLD1088.equals(this.FLD1073)) {
            return;
        }
        CLS142 ˆʿ0 = this.FLD1075;
        if(ˆʿ0 != null) {
            ˆʿ0.MTH2168(ﾞᐧ0.FLD1088);
        }
    }
}

