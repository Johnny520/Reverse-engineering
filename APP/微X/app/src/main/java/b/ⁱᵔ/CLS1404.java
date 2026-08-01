// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ﾞˎ.CLS1626;
import java.util.Date;

public final class CLS1404 implements CLS3 {
    public final int FLD4002;
    public final CLS1626 FLD4003;
    public final long FLD4004;

    public CLS1404(long v, CLS1626 ـﹳ0, int v1) {
        this.FLD4002 = v1;
        this.FLD4004 = v;
        this.FLD4003 = ـﹳ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS1626 ـﹳ0 = this.FLD4003;
        String s = "";
        long v = this.FLD4004;
        if(this.FLD4002 == 0) {
            CLS409.FLD3999 = v;
            if(v != 0L) {
                Date date0 = new Date(CLS409.FLD3999);
                s = CLS409.FLD3997.format(date0);
            }
            ـﹳ0.MTH7325(s);
            return;
        }
        CLS409.FLD4001 = v;
        if(v != 0L) {
            Date date1 = new Date(CLS409.FLD4001);
            s = CLS409.FLD3997.format(date1);
        }
        ـﹳ0.MTH7325(s);
    }
}

