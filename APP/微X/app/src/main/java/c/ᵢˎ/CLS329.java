// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import c.ᐧᵎ.CLS268;

public final class CLS329 {
    public final boolean FLD1548;

    public CLS329(boolean z) {
        this.FLD1548 = z;
    }

    public void MTH4759(CLS268[] arr_ᵔʼ) {
        if(this.FLD1548 && arr_ᵔʼ != null && arr_ᵔʼ.length >= 3) {
            CLS268 ᵔʼ0 = arr_ᵔʼ[0];
            arr_ᵔʼ[0] = arr_ᵔʼ[2];
            arr_ᵔʼ[2] = ᵔʼ0;
        }
    }
}

