// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ﾞˎ.CLS1626;

public final class CLS179 implements View.OnClickListener {
    public final int FLD1734;
    public final CLS1626 FLD1735;
    public final CLS899 FLD1736;

    public CLS179(CLS899 ʻʼ0, CLS1626 ـﹳ0, int v) {
        this.FLD1734 = v;
        this.FLD1736 = ʻʼ0;
        this.FLD1735 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1626 ـﹳ0 = this.FLD1735;
        CLS899 ʻʼ0 = this.FLD1736;
        if(this.FLD1734 == 0) {
            ʻʼ0.getClass();
            ʻʼ0.FLD2151.MTH922(0, "nca2_cnt");
            ـﹳ0.MTH7325(String.valueOf(ʻʼ0.FLD2151.MTH927(0, "nca2_cnt")));
            return;
        }
        ʻʼ0.getClass();
        ʻʼ0.FLD2151.MTH922(0, "nca3_cnt");
        ـﹳ0.MTH7325("" + ʻʼ0.FLD2151.MTH927(0, "nca3_cnt"));
    }
}

