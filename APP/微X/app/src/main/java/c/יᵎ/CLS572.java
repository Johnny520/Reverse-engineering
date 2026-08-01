// Decompiled by JEB v5.42.0.202606242140

package c.יᵎ;

import c.ᐧᵎ.CLS268;

public final class CLS572 extends CLS268 {
    public final float FLD986;

    public CLS572(float f, float f1, float f2) {
        super(f, f1);
        this.FLD986 = f2;
    }

    public boolean MTH3297(float f, float f1, float f2) {
        if(Math.abs(f1 - ((CLS268)this).MTH3470()) <= f && Math.abs(f2 - ((CLS268)this).MTH3468()) <= f) {
            float f3 = Math.abs(f - this.FLD986);
            return f3 <= 1.0f || f3 <= this.FLD986;
        }
        return false;
    }

    public CLS572 MTH3298(float f, float f1, float f2) {
        return new CLS572((((CLS268)this).MTH3468() + f1) / 2.0f, (((CLS268)this).MTH3470() + f) / 2.0f, (this.FLD986 + f2) / 2.0f);
    }
}

