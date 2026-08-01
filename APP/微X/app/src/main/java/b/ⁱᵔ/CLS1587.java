// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ˆٴ.CLS66;

public final class CLS1587 implements CLS11 {
    public final String FLD4979;
    public final CLS425 FLD4980;

    public CLS1587(CLS425 ˊﹳ0, String s) {
        this.FLD4980 = ˊﹳ0;
        this.FLD4979 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = this.FLD4979;
        boolean z = CLS426.MTH6126(s);
        CLS425 ˊﹳ0 = this.FLD4980;
        if(z) {
            CLS66.MTH1436(s, ˊﹳ0.FLD4089);
        }
        else {
            CLS66.MTH1507(s);
        }
        ˊﹳ0.FLD4091.MTH1620(ˊﹳ0.FLD4088, s);
        ˊﹳ0.FLD4096.MTH5046(s);
        ˊﹳ0.FLD4096.notifyDataSetChanged();
    }
}

