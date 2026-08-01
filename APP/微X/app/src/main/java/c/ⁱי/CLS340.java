// Decompiled by JEB v5.42.0.202606242140

package c.ⁱי;

public class CLS340 {
    public final int FLD1578;
    public final int FLD1579;

    public CLS340(int v, int v1) {
        this.FLD1578 = v;
        this.FLD1579 = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof CLS340 ? this.FLD1578 == ((CLS340)object0).FLD1578 && this.FLD1579 == ((CLS340)object0).FLD1579 : false;
    }

    @Override
    public final int hashCode() {
        return this.FLD1578 ^ this.FLD1579;
    }

    @Override
    public final String toString() {
        return this.FLD1578 + "(" + this.FLD1579 + ')';
    }

    public final int MTH4820() {
        return this.FLD1579;
    }

    public final int MTH4821() {
        return this.FLD1578;
    }
}

