// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.widget.LinearLayout;
import d.ˑʽ.CLS10.CLS8;

public final class CLS201 implements CLS8 {
    public final boolean FLD604;
    public final int FLD605;
    public final CLS101 FLD606;
    public final boolean FLD607;

    public CLS201(CLS101 ˆᐧ0, boolean z, boolean z1, int v) {
        this.FLD605 = v;
        this.FLD606 = ˆᐧ0;
        this.FLD604 = z;
        this.FLD607 = z1;
        super();
    }

    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        boolean z = this.FLD607;
        boolean z1 = this.FLD604;
        CLS101 ˆᐧ0 = this.FLD606;
        switch(this.FLD605) {
            case 0: {
                ((CLS194)ˆᐧ0).MTH1056(linearLayout0, z1, false, z);
                return;
            }
            case 1: {
                ((CLS200)ˆᐧ0).MTH1056(linearLayout0, z1, false, z);
                return;
            }
            case 2: {
                ((CLS196)ˆᐧ0).MTH1056(linearLayout0, z1, false, z);
                return;
            }
            default: {
                ((CLS204)ˆᐧ0).MTH1056(linearLayout0, z1, false, z);
            }
        }
    }
}

