// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ⁱᵔ.CLS403;
import java.util.ArrayList;

public final class CLS635 implements CLS3 {
    public final int FLD572;
    public final String FLD573;
    public final CLS794 FLD574;
    public final String FLD575;

    public CLS635(CLS794 ᴵʽ0, String s, String s1, int v) {
        this.FLD572 = v;
        this.FLD574 = ᴵʽ0;
        this.FLD573 = s;
        this.FLD575 = s1;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD575;
        String s1 = this.FLD573;
        CLS794 ᴵʽ0 = this.FLD574;
        if(this.FLD572 == 0) {
            ᴵʽ0.FLD1147.MTH1620(s1, s);
            return;
        }
        ᴵʽ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        CLS403.MTH5870(((CLS140)ᴵʽ0).MTH3042(), arrayList0, s, ((CLS12)new CLS648(ᴵʽ0, s, arrayList0, 1)), false);
    }
}

