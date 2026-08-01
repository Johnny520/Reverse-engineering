// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import javax.annotation.Nullable;
import p.pkg1.CLS1;
import p.pkg9.CLS64;

public final class CLS9 {
    public static final CLS9 FLD42;
    public final boolean FLD43;
    public static final CLS9 FLD44;
    public final boolean FLD45;

    static {
        CLS9.FLD44 = new CLS9(false, false);
        CLS9.FLD42 = new CLS9(true, true);
    }

    public CLS9(boolean z, boolean z1) {
        this.FLD43 = z;
        this.FLD45 = z1;
    }

    @Nullable
    public final void MTH450(@Nullable CLS64 ﾞᵢ0) {
        if(ﾞᵢ0 != null && !this.FLD45) {
            for(int v = 0; v < ﾞᵢ0.FLD416; ++v) {
                ﾞᵢ0.FLD418[v] = CLS1.MTH398(ﾞᵢ0.FLD418[v]);
            }
        }
    }
}

