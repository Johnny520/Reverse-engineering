// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

public final class CLS364 {
    public final float FLD1640;
    public final float FLD1641;
    public final float FLD1642;
    public final float FLD1643;
    public final float FLD1644;
    public final float FLD1645;
    public final float FLD1646;
    public final float FLD1647;
    public final float FLD1648;

    public CLS364(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.FLD1646 = f;
        this.FLD1648 = f3;
        this.FLD1640 = f6;
        this.FLD1643 = f1;
        this.FLD1642 = f4;
        this.FLD1644 = f7;
        this.FLD1647 = f2;
        this.FLD1645 = f5;
        this.FLD1641 = f8;
    }

    public static CLS364 MTH4988(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        return CLS364.MTH4990(f, f1, f2, f3, f4, f5, f6, f7).MTH4992();
    }

    public CLS364 MTH4989(CLS364 ᵢʼ0) {
        return new CLS364(this.FLD1646 * ᵢʼ0.FLD1646 + this.FLD1643 * ᵢʼ0.FLD1648 + this.FLD1647 * ᵢʼ0.FLD1640, this.FLD1646 * ᵢʼ0.FLD1643 + this.FLD1643 * ᵢʼ0.FLD1642 + this.FLD1647 * ᵢʼ0.FLD1644, this.FLD1646 * ᵢʼ0.FLD1647 + this.FLD1643 * ᵢʼ0.FLD1645 + this.FLD1647 * ᵢʼ0.FLD1641, this.FLD1648 * ᵢʼ0.FLD1646 + this.FLD1642 * ᵢʼ0.FLD1648 + this.FLD1645 * ᵢʼ0.FLD1640, this.FLD1648 * ᵢʼ0.FLD1643 + this.FLD1642 * ᵢʼ0.FLD1642 + this.FLD1645 * ᵢʼ0.FLD1644, this.FLD1645 * ᵢʼ0.FLD1641 + (this.FLD1648 * ᵢʼ0.FLD1647 + this.FLD1642 * ᵢʼ0.FLD1645), ᵢʼ0.FLD1640 * this.FLD1641 + (ᵢʼ0.FLD1646 * this.FLD1640 + ᵢʼ0.FLD1648 * this.FLD1644), ᵢʼ0.FLD1643 * this.FLD1640 + ᵢʼ0.FLD1642 * this.FLD1644 + ᵢʼ0.FLD1644 * this.FLD1641, this.FLD1640 * ᵢʼ0.FLD1647 + this.FLD1644 * ᵢʼ0.FLD1645 + this.FLD1641 * ᵢʼ0.FLD1641);
    }

    public static CLS364 MTH4990(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f - f2 + f4 - f6;
        float f9 = f1 - f3 + f5 - f7;
        if(f8 == 0.0f && f9 == 0.0f) {
            return new CLS364(f2 - f, f4 - f2, f, f3 - f1, f5 - f3, f1, 0.0f, 0.0f, 1.0f);
        }
        float f10 = f2 - f4;
        float f11 = f6 - f4;
        float f12 = f3 - f5;
        float f13 = f7 - f5;
        float f14 = f10 * f13 - f11 * f12;
        float f15 = (f13 * f8 - f11 * f9) / f14;
        float f16 = (f10 * f9 - f8 * f12) / f14;
        return new CLS364(f15 * f2 + (f2 - f), f16 * f6 + (f6 - f), f, f3 - f1 + f15 * f3, f7 - f1 + f16 * f7, f1, f15, f16, 1.0f);
    }

    public void MTH4991(float[] arr_f) {
        float f = this.FLD1646;
        float f1 = this.FLD1648;
        float f2 = this.FLD1640;
        float f3 = this.FLD1643;
        float f4 = this.FLD1642;
        float f5 = this.FLD1644;
        float f6 = this.FLD1647;
        float f7 = this.FLD1645;
        float f8 = this.FLD1641;
        for(int v = 0; v < arr_f.length; v += 2) {
            float f9 = arr_f[v];
            float f10 = arr_f[v + 1];
            float f11 = f2 * f9 + f5 * f10 + f8;
            arr_f[v] = (f * f9 + f3 * f10 + f6) / f11;
            arr_f[v + 1] = (f9 * f1 + f10 * f4 + f7) / f11;
        }
    }

    public CLS364 MTH4992() {
        return new CLS364(this.FLD1642 * this.FLD1641 - this.FLD1644 * this.FLD1645, this.FLD1644 * this.FLD1647 - this.FLD1643 * this.FLD1641, this.FLD1643 * this.FLD1645 - this.FLD1642 * this.FLD1647, this.FLD1640 * this.FLD1645 - this.FLD1648 * this.FLD1641, this.FLD1641 * this.FLD1646 - this.FLD1640 * this.FLD1647, this.FLD1647 * this.FLD1648 - this.FLD1645 * this.FLD1646, this.FLD1648 * this.FLD1644 - this.FLD1640 * this.FLD1642, this.FLD1640 * this.FLD1643 - this.FLD1644 * this.FLD1646, this.FLD1646 * this.FLD1642 - this.FLD1648 * this.FLD1643);
    }

    public static CLS364 MTH4993(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        CLS364 ᵢʼ0 = CLS364.MTH4988(f, f1, f2, f3, f4, f5, f6, f7);
        return CLS364.MTH4990(f8, f9, f10, f11, f12, f13, f14, f15).MTH4989(ᵢʼ0);
    }
}

