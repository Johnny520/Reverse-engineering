// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS396;

public abstract class CLS140 {
    public final CLS371 FLD1444;
    public final CLS29 FLD1445;
    public final CLS396 FLD1446;
    public final CLS139 FLD1447;

    public CLS140(CLS139 ﹶʼ0) {
        this.FLD1447 = ﹶʼ0;
        this.FLD1444 = CLS371.FLD3470;
        this.FLD1446 = CLS396.FLD3775;
        this.FLD1445 = CLS27.MTH895();
        try {
            this.MTH3040(CLS21.FLD76);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public void MTH3039() {
    }

    public abstract void MTH3040(CLS21 arg1);

    public static String MTH3041() {
        return CLS27.MTH904();
    }

    public final Activity MTH3042() {
        return this.FLD1447.MTH3026();
    }

    public void MTH3043() {
    }
}

