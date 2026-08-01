// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import java.util.Formatter;

public class CLS371 {
    public final CLS373[] FLD1631;
    public final CLS370 FLD1632;

    public CLS371(CLS370 ـᵎ0) {
        this.FLD1632 = new CLS370(ـᵎ0);
        this.FLD1631 = new CLS373[ـᵎ0.MTH5025() - ـᵎ0.MTH5024() + 1];
    }

    @Override
    public String toString() {
        Formatter formatter0 = new Formatter();
        CLS373[] arr_ᵔﹶ = this.FLD1631;
        int v1 = 0;
        for(int v = 0; v < arr_ᵔﹶ.length; ++v) {
            CLS373 ᵔﹶ0 = arr_ᵔﹶ[v];
            if(ᵔﹶ0 == null) {
                formatter0.format("%3d:    |   %n", v1);
            }
            else {
                formatter0.format("%3d: %3d|%3d%n", v1, ᵔﹶ0.MTH5070(), ᵔﹶ0.MTH5066());
            }
            ++v1;
        }
        formatter0.close();
        return formatter0.toString();
    }

    public final CLS373 MTH5029(int v) {
        return this.FLD1631[this.MTH5030(v)];
    }

    public final int MTH5030(int v) {
        return v - this.FLD1632.MTH5024();
    }

    public final CLS370 MTH5031() {
        return this.FLD1632;
    }

    public final CLS373 MTH5032(int v) {
        CLS373 ᵔﹶ0 = this.MTH5029(v);
        if(ᵔﹶ0 != null) {
            return ᵔﹶ0;
        }
        for(int v1 = 1; v1 < 5; ++v1) {
            int v2 = this.MTH5030(v) - v1;
            if(v2 >= 0) {
                CLS373 ᵔﹶ1 = this.FLD1631[v2];
                if(ᵔﹶ1 != null) {
                    return ᵔﹶ1;
                }
            }
            int v3 = this.MTH5030(v) + v1;
            CLS373[] arr_ᵔﹶ = this.FLD1631;
            if(v3 < arr_ᵔﹶ.length) {
                CLS373 ᵔﹶ2 = arr_ᵔﹶ[v3];
                if(ᵔﹶ2 != null) {
                    return ᵔﹶ2;
                }
            }
        }
        return null;
    }

    public final void MTH5033(int v, CLS373 ᵔﹶ0) {
        this.FLD1631[this.MTH5030(v)] = ᵔﹶ0;
    }

    public final CLS373[] MTH5034() {
        return this.FLD1631;
    }
}

