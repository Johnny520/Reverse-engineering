// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

import java.util.Formatter;

public class CLS357 {
    public final CLS348 FLD1618;
    public final CLS353[] FLD1619;

    public CLS357(CLS348 ʾʻ0) {
        this.FLD1618 = new CLS348(ʾʻ0);
        this.FLD1619 = new CLS353[ʾʻ0.MTH4840() - ʾʻ0.MTH4841() + 1];
    }

    @Override
    public String toString() {
        Formatter formatter0 = new Formatter();
        CLS353[] arr_ˉˎ = this.FLD1619;
        int v1 = 0;
        for(int v = 0; v < arr_ˉˎ.length; ++v) {
            CLS353 ˉˎ0 = arr_ˉˎ[v];
            if(ˉˎ0 == null) {
                formatter0.format("%3d:    |   %n", v1);
            }
            else {
                formatter0.format("%3d: %3d|%3d%n", v1, ˉˎ0.MTH4867(), ˉˎ0.MTH4869());
            }
            ++v1;
        }
        formatter0.close();
        return formatter0.toString();
    }

    public final CLS353 MTH4937(int v) {
        CLS353 ˉˎ0 = this.MTH4942(v);
        if(ˉˎ0 != null) {
            return ˉˎ0;
        }
        for(int v1 = 1; v1 < 5; ++v1) {
            int v2 = this.MTH4938(v) - v1;
            if(v2 >= 0) {
                CLS353 ˉˎ1 = this.FLD1619[v2];
                if(ˉˎ1 != null) {
                    return ˉˎ1;
                }
            }
            int v3 = this.MTH4938(v) + v1;
            CLS353[] arr_ˉˎ = this.FLD1619;
            if(v3 < arr_ˉˎ.length) {
                CLS353 ˉˎ2 = arr_ˉˎ[v3];
                if(ˉˎ2 != null) {
                    return ˉˎ2;
                }
            }
        }
        return null;
    }

    public final int MTH4938(int v) {
        return v - this.FLD1618.MTH4841();
    }

    public final CLS353[] MTH4939() {
        return this.FLD1619;
    }

    public final void MTH4940(int v, CLS353 ˉˎ0) {
        this.FLD1619[this.MTH4938(v)] = ˉˎ0;
    }

    public final CLS348 MTH4941() {
        return this.FLD1618;
    }

    public final CLS353 MTH4942(int v) {
        return this.FLD1619[this.MTH4938(v)];
    }
}

