// Decompiled by JEB v5.42.0.202606242140

package c.יᵎ;

import c.ᐧᵎ.CLS268;

public final class CLS571 extends CLS268 {
    public final float FLD981;
    public final int FLD982;

    public CLS571(float f, float f1, float f2) {
        this(f, f1, f2, 1);
    }

    public CLS571(float f, float f1, float f2, int v) {
        super(f, f1);
        this.FLD981 = f2;
        this.FLD982 = v;
    }

    public float MTH3288() {
        return this.FLD981;
    }

    public boolean MTH3289(float f, float f1, float f2) {
        if(Math.abs(f1 - ((CLS268)this).MTH3470()) <= f && Math.abs(f2 - ((CLS268)this).MTH3468()) <= f) {
            float f3 = Math.abs(f - this.FLD981);
            return f3 <= 1.0f || f3 <= this.FLD981;
        }
        return false;
    }

    public int MTH3290() {
        return this.FLD982;
    }

    public CLS571 MTH3291(float f, float f1, float f2) {
        float f3 = (float)(this.FLD982 + 1);
        return new CLS571((((float)this.FLD982) * ((CLS268)this).MTH3468() + f1) / f3, (((float)this.FLD982) * ((CLS268)this).MTH3470() + f) / f3, (((float)this.FLD982) * this.FLD981 + f2) / f3, this.FLD982 + 1);
    }
}

