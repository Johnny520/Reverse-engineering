// Decompiled by JEB v5.42.0.202606242140

package c.ˑٴ;

import c.ﾞﹶ.CLS380;

public final class CLS640 extends CLS380 {
    public final float FLD648;

    public CLS640(float f, float f1, float f2) {
        super(f, f1);
        this.FLD648 = f2;
    }

    public CLS640 MTH2532(float f, float f1, float f2) {
        return new CLS640((((CLS380)this).MTH5130() + f1) / 2.0f, (((CLS380)this).MTH5131() + f) / 2.0f, (this.FLD648 + f2) / 2.0f);
    }

    public boolean MTH2533(float f, float f1, float f2) {
        if(Math.abs(f1 - ((CLS380)this).MTH5131()) <= f && Math.abs(f2 - ((CLS380)this).MTH5130()) <= f) {
            float f3 = Math.abs(f - this.FLD648);
            return f3 <= 1.0f || f3 <= this.FLD648;
        }
        return false;
    }
}

