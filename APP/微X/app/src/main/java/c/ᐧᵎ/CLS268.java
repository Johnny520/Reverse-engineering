// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵎ;

import c.ٴʽ.CLS258;

public class CLS268 {
    public final float FLD1060;
    public final float FLD1061;

    public CLS268(float f, float f1) {
        this.FLD1060 = f;
        this.FLD1061 = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof CLS268 && this.FLD1060 == ((CLS268)object0).FLD1060 && this.FLD1061 == ((CLS268)object0).FLD1061;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.FLD1060) * 0x1F + Float.floatToIntBits(this.FLD1061);
    }

    @Override
    public final String toString() {
        return "(" + this.FLD1060 + ',' + this.FLD1061 + ')';
    }

    public final float MTH3468() {
        return this.FLD1060;
    }

    public static void MTH3469(CLS268[] arr_ᵔʼ) {
        CLS268 ᵔʼ2;
        CLS268 ᵔʼ1;
        CLS268 ᵔʼ0;
        float f = CLS268.MTH3472(arr_ᵔʼ[0], arr_ᵔʼ[1]);
        float f1 = CLS268.MTH3472(arr_ᵔʼ[1], arr_ᵔʼ[2]);
        float f2 = CLS268.MTH3472(arr_ᵔʼ[0], arr_ᵔʼ[2]);
        if(f1 >= f && f1 >= f2) {
            ᵔʼ0 = arr_ᵔʼ[0];
            ᵔʼ1 = arr_ᵔʼ[1];
            ᵔʼ2 = arr_ᵔʼ[2];
        }
        else if(f2 < f1 || f2 < f) {
            ᵔʼ0 = arr_ᵔʼ[2];
            ᵔʼ1 = arr_ᵔʼ[0];
            ᵔʼ2 = arr_ᵔʼ[1];
        }
        else {
            ᵔʼ0 = arr_ᵔʼ[1];
            ᵔʼ1 = arr_ᵔʼ[0];
            ᵔʼ2 = arr_ᵔʼ[2];
        }
        if(CLS268.MTH3471(ᵔʼ1, ᵔʼ0, ᵔʼ2) < 0.0f) {
            CLS268 ᵔʼ3 = ᵔʼ2;
            ᵔʼ2 = ᵔʼ1;
            ᵔʼ1 = ᵔʼ3;
        }
        arr_ᵔʼ[0] = ᵔʼ1;
        arr_ᵔʼ[1] = ᵔʼ0;
        arr_ᵔʼ[2] = ᵔʼ2;
    }

    public final float MTH3470() {
        return this.FLD1061;
    }

    public static float MTH3471(CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2) {
        return (ᵔʼ2.FLD1060 - ᵔʼ1.FLD1060) * (ᵔʼ0.FLD1061 - ᵔʼ1.FLD1061) - (ᵔʼ2.FLD1061 - ᵔʼ1.FLD1061) * (ᵔʼ0.FLD1060 - ᵔʼ1.FLD1060);
    }

    public static float MTH3472(CLS268 ᵔʼ0, CLS268 ᵔʼ1) {
        return CLS258.MTH3385(ᵔʼ0.FLD1060, ᵔʼ0.FLD1061, ᵔʼ1.FLD1060, ᵔʼ1.FLD1061);
    }
}

