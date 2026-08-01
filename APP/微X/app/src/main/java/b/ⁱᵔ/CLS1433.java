// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1626;

public final class CLS1433 implements CLS8 {
    public final CLS1626 FLD4235;

    public CLS1433(CLS1626 ـﹳ0) {
        this.FLD4235 = ـﹳ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(TextUtils.isEmpty(((String)object0))) {
            return;
        }
        CLS27.MTH895().MTH922(((String)object0), "moment_sig");
        this.FLD4235.MTH800(((String)object0));
    }
}

