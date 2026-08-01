// Decompiled by JEB v5.42.0.202606242140

package c.ﾞﹶ;

import c.ˎʼ.CLS114;

public class CLS380 {
    public final float FLD1662;
    public final float FLD1663;

    public CLS380(float f, float f1) {
        this.FLD1663 = f;
        this.FLD1662 = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof CLS380 && this.FLD1663 == ((CLS380)object0).FLD1663 && this.FLD1662 == ((CLS380)object0).FLD1662;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.FLD1663) * 0x1F + Float.floatToIntBits(this.FLD1662);
    }

    @Override
    public final String toString() {
        return "(" + this.FLD1663 + ',' + this.FLD1662 + ')';
    }

    public static float MTH5127(CLS380 ٴⁱ0, CLS380 ٴⁱ1) {
        return CLS114.MTH2296(ٴⁱ0.FLD1663, ٴⁱ0.FLD1662, ٴⁱ1.FLD1663, ٴⁱ1.FLD1662);
    }

    public static void MTH5128(CLS380[] arr_ٴⁱ) {
        CLS380 ٴⁱ2;
        CLS380 ٴⁱ1;
        CLS380 ٴⁱ0;
        float f = CLS380.MTH5127(arr_ٴⁱ[0], arr_ٴⁱ[1]);
        float f1 = CLS380.MTH5127(arr_ٴⁱ[1], arr_ٴⁱ[2]);
        float f2 = CLS380.MTH5127(arr_ٴⁱ[0], arr_ٴⁱ[2]);
        if(f1 >= f && f1 >= f2) {
            ٴⁱ0 = arr_ٴⁱ[0];
            ٴⁱ1 = arr_ٴⁱ[1];
            ٴⁱ2 = arr_ٴⁱ[2];
        }
        else if(f2 < f1 || f2 < f) {
            ٴⁱ0 = arr_ٴⁱ[2];
            ٴⁱ1 = arr_ٴⁱ[0];
            ٴⁱ2 = arr_ٴⁱ[1];
        }
        else {
            ٴⁱ0 = arr_ٴⁱ[1];
            ٴⁱ1 = arr_ٴⁱ[0];
            ٴⁱ2 = arr_ٴⁱ[2];
        }
        if(CLS380.MTH5129(ٴⁱ1, ٴⁱ0, ٴⁱ2) < 0.0f) {
            CLS380 ٴⁱ3 = ٴⁱ2;
            ٴⁱ2 = ٴⁱ1;
            ٴⁱ1 = ٴⁱ3;
        }
        arr_ٴⁱ[0] = ٴⁱ1;
        arr_ٴⁱ[1] = ٴⁱ0;
        arr_ٴⁱ[2] = ٴⁱ2;
    }

    public static float MTH5129(CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2) {
        return (ٴⁱ2.FLD1663 - ٴⁱ1.FLD1663) * (ٴⁱ0.FLD1662 - ٴⁱ1.FLD1662) - (ٴⁱ2.FLD1662 - ٴⁱ1.FLD1662) * (ٴⁱ0.FLD1663 - ٴⁱ1.FLD1663);
    }

    public final float MTH5130() {
        return this.FLD1663;
    }

    public final float MTH5131() {
        return this.FLD1662;
    }
}

