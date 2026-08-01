// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS12;
import java.util.ArrayList;

public final class CLS648 implements CLS12 {
    public final int FLD633;
    public final String FLD634;
    public final CLS794 FLD635;
    public final ArrayList FLD636;

    public CLS648(CLS794 ᴵʽ0, String s, ArrayList arrayList0, int v) {
        this.FLD633 = v;
        this.FLD635 = ᴵʽ0;
        this.FLD634 = s;
        this.FLD636 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ArrayList arrayList0 = this.FLD636;
        String s = this.FLD634;
        CLS794 ᴵʽ0 = this.FLD635;
        if(this.FLD633 == 0) {
            ᴵʽ0.FLD1153.MTH1156(s.substring(3), arrayList0);
            ᴵʽ0.FLD1147.MTH1653(s);
            return;
        }
        ᴵʽ0.FLD1147.MTH1646(s, arrayList0);
    }
}

