// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.os.Bundle;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS568;
import b.ﾞˎ.CLS1621;

public final class CLS1597 implements CLS11 {
    public final CLS12 FLD5048;
    public final CLS1621 FLD5049;
    public final CLS1621 FLD5050;

    public CLS1597(CLS568 יᐧ0, CLS1621 ˎᵢ0, CLS1621 ˎᵢ1) {
        this.FLD5048 = יᐧ0;
        this.FLD5050 = ˎᵢ0;
        this.FLD5049 = ˎᵢ1;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS12 ᵔʾ0 = this.FLD5048;
        if(ᵔʾ0 != null) {
            Bundle bundle0 = new Bundle();
            bundle0.putLong("start", this.FLD5050.FLD5241);
            bundle0.putLong("end", this.FLD5049.FLD5241);
            try {
                ᵔʾ0.MTH791(bundle0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

