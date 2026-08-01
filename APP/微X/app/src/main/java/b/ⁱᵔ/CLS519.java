// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ﾞˎ.CLS1626;

public final class CLS519 implements View.OnClickListener {
    public final int FLD5091;
    public final CLS1626 FLD5092;
    public final CLS1626 FLD5093;

    public CLS519(CLS1626 ـﹳ0, CLS1626 ـﹳ1, int v) {
        this.FLD5091 = v;
        this.FLD5093 = ـﹳ0;
        this.FLD5092 = ـﹳ1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1626 ـﹳ0 = this.FLD5092;
        CLS1626 ـﹳ1 = this.FLD5093;
        if(this.FLD5091 == 0) {
            ـﹳ1.MTH7325("");
            ـﹳ0.MTH7325("");
            CLS476.FLD4663 = 0;
            CLS476.FLD4665 = 0;
            return;
        }
        ـﹳ1.MTH7325("");
        ـﹳ0.MTH7325("");
        CLS476.FLD4663 = 0;
        CLS476.FLD4665 = 0;
    }
}

