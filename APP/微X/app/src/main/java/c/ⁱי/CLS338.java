// Decompiled by JEB v5.42.0.202606242140

package c.ⁱי;

import c.ᐧᵎ.CLS268;

public final class CLS338 {
    public final CLS268[] FLD1558;
    public final int FLD1559;
    public final int[] FLD1560;

    public CLS338(int v, int[] arr_v, int v1, int v2, int v3) {
        this.FLD1559 = v;
        this.FLD1560 = arr_v;
        this.FLD1558 = new CLS268[]{new CLS268(((float)v1), ((float)v3)), new CLS268(((float)v2), ((float)v3))};
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS338 ? this.FLD1559 == ((CLS338)object0).FLD1559 : false;
    }

    @Override
    public int hashCode() {
        return this.FLD1559;
    }

    public int MTH4785() {
        return this.FLD1559;
    }

    public CLS268[] MTH4786() {
        return this.FLD1558;
    }

    public int[] MTH4787() {
        return this.FLD1560;
    }
}

