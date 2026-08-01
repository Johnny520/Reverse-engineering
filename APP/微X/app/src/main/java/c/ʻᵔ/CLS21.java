// Decompiled by JEB v5.42.0.202606242140

package c.ʻᵔ;

public class CLS21 {
    public final int FLD97;
    public final int FLD98;

    public CLS21(int v, int v1) {
        this.FLD98 = v;
        this.FLD97 = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof CLS21 ? this.FLD98 == ((CLS21)object0).FLD98 && this.FLD97 == ((CLS21)object0).FLD97 : false;
    }

    @Override
    public final int hashCode() {
        return this.FLD98 ^ this.FLD97;
    }

    @Override
    public final String toString() {
        return this.FLD98 + "(" + this.FLD97 + ')';
    }

    public final int MTH760() {
        return this.FLD98;
    }

    public final int MTH761() {
        return this.FLD97;
    }
}

