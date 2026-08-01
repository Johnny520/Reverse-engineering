// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS779 implements CLS3 {
    public final int FLD1095;
    public final String FLD1096;
    public final CLS794 FLD1097;

    public CLS779(CLS794 ᴵʽ0, String s, int v) {
        this.FLD1095 = v;
        this.FLD1097 = ᴵʽ0;
        this.FLD1096 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD1096;
        CLS794 ᴵʽ0 = this.FLD1097;
        switch(this.FLD1095) {
            case 0: {
                ᴵʽ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                CLS403.MTH5870(((CLS140)ᴵʽ0).MTH3042(), arrayList0, null, null, false);
                return;
            }
            case 1: {
                CLS403.MTH5866(((CLS140)ᴵʽ0).MTH3042(), s);
                return;
            }
            case 2: {
                CLS403.MTH5871(((CLS140)ᴵʽ0).MTH3042(), s);
                return;
            }
            default: {
                CLS523.MTH7142(((CLS140)ᴵʽ0).MTH3042(), ((CLS11)new CLS698(ᴵʽ0, s)));
            }
        }
    }
}

