// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS1402 implements CLS3 {
    public final int FLD3988;
    public final CLS366 FLD3989;

    public CLS1402(CLS366 ﾞᐧ0, int v) {
        this.FLD3988 = v;
        this.FLD3989 = ﾞᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS366 ﾞᐧ0 = this.FLD3989;
        switch(this.FLD3988) {
            case 0: {
                ﾞᐧ0.MTH5276(CLS372.MTH5414(ﾞᐧ0.FLD3455));
                return;
            }
            case 1: {
                ArrayList arrayList1 = new ArrayList(ﾞᐧ0.FLD3455);
                CLS372.MTH5405(arrayList1);
                ﾞᐧ0.MTH5276(arrayList1);
                return;
            }
            case 2: {
                ArrayList arrayList2 = new ArrayList(ﾞᐧ0.FLD3455);
                Collections.reverse(arrayList2);
                ﾞᐧ0.MTH5276(arrayList2);
                return;
            }
            case 3: {
                ﾞᐧ0.MTH5276(CLS372.MTH5414(ﾞᐧ0.FLD3455));
                return;
            }
            case 4: {
                ArrayList arrayList3 = new ArrayList(ﾞᐧ0.FLD3455);
                CLS372.MTH5405(arrayList3);
                ﾞᐧ0.MTH5276(arrayList3);
                return;
            }
            case 5: {
                ArrayList arrayList4 = new ArrayList(ﾞᐧ0.FLD3455);
                Collections.reverse(arrayList4);
                ﾞᐧ0.MTH5276(arrayList4);
                return;
            }
            case 6: {
                ﾞᐧ0.MTH5276(CLS372.MTH5414(ﾞᐧ0.FLD3455));
                return;
            }
            case 7: {
                ArrayList arrayList5 = new ArrayList(ﾞᐧ0.FLD3455);
                CLS372.MTH5405(arrayList5);
                ﾞᐧ0.MTH5276(arrayList5);
                return;
            }
            default: {
                ArrayList arrayList0 = new ArrayList(ﾞᐧ0.FLD3455);
                Collections.reverse(arrayList0);
                ﾞᐧ0.MTH5276(arrayList0);
            }
        }
    }
}

