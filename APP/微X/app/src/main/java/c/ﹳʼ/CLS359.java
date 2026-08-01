// Decompiled by JEB v5.42.0.202606242140

package c.ﹳʼ;

import c.ʻᵔ.CLS21;
import c.ʻᵔ.CLS22;

public final class CLS359 {
    public final CLS21 FLD1580;
    public final boolean FLD1581;
    public final CLS21 FLD1582;
    public final CLS22 FLD1583;

    public CLS359(CLS21 ʻᵢ0, CLS21 ʻᵢ1, CLS22 ـᵎ0, boolean z) {
        this.FLD1580 = ʻᵢ0;
        this.FLD1582 = ʻᵢ1;
        this.FLD1583 = ـᵎ0;
        this.FLD1581 = z;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS359 ? CLS359.MTH4927(this.FLD1580, ((CLS359)object0).FLD1580) && CLS359.MTH4927(this.FLD1582, ((CLS359)object0).FLD1582) && CLS359.MTH4927(this.FLD1583, ((CLS359)object0).FLD1583) : false;
    }

    @Override
    public int hashCode() {
        return CLS359.MTH4926(this.FLD1580) ^ CLS359.MTH4926(this.FLD1582) ^ CLS359.MTH4926(this.FLD1583);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[ ");
        stringBuilder0.append(this.FLD1580);
        stringBuilder0.append(" , ");
        stringBuilder0.append(this.FLD1582);
        stringBuilder0.append(" : ");
        CLS22 ـᵎ0 = this.FLD1583;
        String s = ـᵎ0 == null ? "null" : ـᵎ0.MTH789();
        stringBuilder0.append(s);
        stringBuilder0.append(" ]");
        return stringBuilder0.toString();
    }

    public CLS22 MTH4925() {
        return this.FLD1583;
    }

    public static int MTH4926(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static boolean MTH4927(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    public CLS21 MTH4928() {
        return this.FLD1580;
    }

    public boolean MTH4929() {
        return this.FLD1582 == null;
    }

    public CLS21 MTH4930() {
        return this.FLD1582;
    }
}

