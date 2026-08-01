// Decompiled by JEB v5.42.0.202606242140

package c.ˑٴ;

import c.ﾞﹶ.CLS380;

public final class CLS641 extends CLS380 {
    public final float FLD654;
    public final int FLD655;

    public CLS641(float f, float f1, float f2) {
        this(f, f1, f2, 1);
    }

    public CLS641(float f, float f1, float f2, int v) {
        super(f, f1);
        this.FLD654 = f2;
        this.FLD655 = v;
    }

    public float MTH2552() {
        return this.FLD654;
    }

    public CLS641 MTH2553(float f, float f1, float f2) {
        float f3 = (float)(this.FLD655 + 1);
        return new CLS641((((float)this.FLD655) * ((CLS380)this).MTH5130() + f1) / f3, (((float)this.FLD655) * ((CLS380)this).MTH5131() + f) / f3, (((float)this.FLD655) * this.FLD654 + f2) / f3, this.FLD655 + 1);
    }

    public int MTH2554() {
        return this.FLD655;
    }

    public boolean MTH2555(float f, float f1, float f2) {
        if(Math.abs(f1 - ((CLS380)this).MTH5131()) <= f && Math.abs(f2 - ((CLS380)this).MTH5130()) <= f) {
            float f3 = Math.abs(f - this.FLD654);
            return f3 <= 1.0f || f3 <= this.FLD654;
        }
        return false;
    }
}

