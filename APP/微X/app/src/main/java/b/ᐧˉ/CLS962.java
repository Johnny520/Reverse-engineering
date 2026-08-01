// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ˑٴ.CLS116;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS525;

public final class CLS962 implements CLS378, CLS379 {
    public final CLS174 FLD1865;
    public final Activity FLD1866;

    public CLS962(CLS174 ʻˑ0, Activity activity0) {
        this.FLD1865 = ʻˑ0;
        this.FLD1866 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD1865.getClass();
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1274(this.FLD1865, this.FLD1866, 15)));
        ʻˑ0.MTH7187("add", ((CLS3)new CLS1627(4, this.FLD1865)));
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        this.FLD1865.getClass();
        CLS1624 יﹳ0 = new CLS1624(this.FLD1866);
        יﹳ0.MTH7311();
        יﹳ0.MTH7301(new CLS249(0, this.FLD1865));
        יﹳ0.MTH7305(new CLS116(1, this.FLD1865));
        יﹳ0.MTH7303(this.FLD1865.FLD1681);
        יﹳ0.MTH7308(10);
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

