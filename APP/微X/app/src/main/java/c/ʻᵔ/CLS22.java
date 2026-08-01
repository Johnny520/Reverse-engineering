// Decompiled by JEB v5.42.0.202606242140

package c.ʻᵔ;

import c.ﾞﹶ.CLS380;

public final class CLS22 {
    public final int[] FLD114;
    public final int FLD115;
    public final CLS380[] FLD116;

    public CLS22(int v, int[] arr_v, int v1, int v2, int v3) {
        this.FLD115 = v;
        this.FLD114 = arr_v;
        this.FLD116 = new CLS380[]{new CLS380(((float)v1), ((float)v3)), new CLS380(((float)v2), ((float)v3))};
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS22 ? this.FLD115 == ((CLS22)object0).FLD115 : false;
    }

    @Override
    public int hashCode() {
        return this.FLD115;
    }

    public int[] MTH787() {
        return this.FLD114;
    }

    public CLS380[] MTH788() {
        return this.FLD116;
    }

    public int MTH789() {
        return this.FLD115;
    }
}

