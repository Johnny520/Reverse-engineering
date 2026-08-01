// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵔ;

import c.ﾞﹶ.CLS380;

public final class CLS326 {
    public final boolean FLD1498;

    public CLS326(boolean z) {
        this.FLD1498 = z;
    }

    public void MTH4729(CLS380[] arr_ٴⁱ) {
        if(this.FLD1498 && arr_ٴⁱ != null && arr_ٴⁱ.length >= 3) {
            CLS380 ٴⁱ0 = arr_ٴⁱ[0];
            arr_ٴⁱ[0] = arr_ٴⁱ[2];
            arr_ٴⁱ[2] = ٴⁱ0;
        }
    }
}

