// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

public final class CLS120 {
    public final float FLD573;
    public final float FLD574;
    public final float FLD575;
    public final float FLD576;
    public final float FLD577;
    public final float FLD578;
    public final float FLD579;
    public final float FLD580;
    public final float FLD581;

    public CLS120(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.FLD575 = f;
        this.FLD573 = f3;
        this.FLD577 = f6;
        this.FLD581 = f1;
        this.FLD574 = f4;
        this.FLD580 = f7;
        this.FLD578 = f2;
        this.FLD579 = f5;
        this.FLD576 = f8;
    }

    public static CLS120 MTH2371(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        CLS120 י0 = CLS120.MTH2374(f, f1, f2, f3, f4, f5, f6, f7);
        return CLS120.MTH2376(f8, f9, f10, f11, f12, f13, f14, f15).MTH2372(י0);
    }

    public CLS120 MTH2372(CLS120 י0) {
        return new CLS120(this.FLD575 * י0.FLD575 + this.FLD581 * י0.FLD573 + this.FLD578 * י0.FLD577, this.FLD575 * י0.FLD581 + this.FLD581 * י0.FLD574 + this.FLD578 * י0.FLD580, this.FLD575 * י0.FLD578 + this.FLD581 * י0.FLD579 + this.FLD578 * י0.FLD576, this.FLD573 * י0.FLD575 + this.FLD574 * י0.FLD573 + this.FLD579 * י0.FLD577, this.FLD573 * י0.FLD581 + this.FLD574 * י0.FLD574 + this.FLD579 * י0.FLD580, this.FLD579 * י0.FLD576 + (this.FLD573 * י0.FLD578 + this.FLD574 * י0.FLD579), י0.FLD577 * this.FLD576 + (י0.FLD575 * this.FLD577 + י0.FLD573 * this.FLD580), י0.FLD581 * this.FLD577 + י0.FLD574 * this.FLD580 + י0.FLD580 * this.FLD576, this.FLD577 * י0.FLD578 + this.FLD580 * י0.FLD579 + this.FLD576 * י0.FLD576);
    }

    public CLS120 MTH2373() {
        return new CLS120(this.FLD574 * this.FLD576 - this.FLD580 * this.FLD579, this.FLD580 * this.FLD578 - this.FLD581 * this.FLD576, this.FLD581 * this.FLD579 - this.FLD574 * this.FLD578, this.FLD577 * this.FLD579 - this.FLD573 * this.FLD576, this.FLD576 * this.FLD575 - this.FLD577 * this.FLD578, this.FLD578 * this.FLD573 - this.FLD579 * this.FLD575, this.FLD573 * this.FLD580 - this.FLD577 * this.FLD574, this.FLD577 * this.FLD581 - this.FLD580 * this.FLD575, this.FLD575 * this.FLD574 - this.FLD573 * this.FLD581);
    }

    public static CLS120 MTH2374(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        return CLS120.MTH2376(f, f1, f2, f3, f4, f5, f6, f7).MTH2373();
    }

    public void MTH2375(float[] arr_f) {
        float f = this.FLD575;
        float f1 = this.FLD573;
        float f2 = this.FLD577;
        float f3 = this.FLD581;
        float f4 = this.FLD574;
        float f5 = this.FLD580;
        float f6 = this.FLD578;
        float f7 = this.FLD579;
        float f8 = this.FLD576;
        for(int v = 0; v < arr_f.length; v += 2) {
            float f9 = arr_f[v];
            float f10 = arr_f[v + 1];
            float f11 = f2 * f9 + f5 * f10 + f8;
            arr_f[v] = (f * f9 + f3 * f10 + f6) / f11;
            arr_f[v + 1] = (f9 * f1 + f10 * f4 + f7) / f11;
        }
    }

    public static CLS120 MTH2376(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f - f2 + f4 - f6;
        float f9 = f1 - f3 + f5 - f7;
        if(f8 == 0.0f && f9 == 0.0f) {
            return new CLS120(f2 - f, f4 - f2, f, f3 - f1, f5 - f3, f1, 0.0f, 0.0f, 1.0f);
        }
        float f10 = f2 - f4;
        float f11 = f6 - f4;
        float f12 = f3 - f5;
        float f13 = f7 - f5;
        float f14 = f10 * f13 - f11 * f12;
        float f15 = (f13 * f8 - f11 * f9) / f14;
        float f16 = (f10 * f9 - f8 * f12) / f14;
        return new CLS120(f15 * f2 + (f2 - f), f16 * f6 + (f6 - f), f, f3 - f1 + f15 * f3, f7 - f1 + f16 * f7, f1, f15, f16, 1.0f);
    }
}

