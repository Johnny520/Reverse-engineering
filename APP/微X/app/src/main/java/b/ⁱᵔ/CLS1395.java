// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS15;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS97;
import b.ᐧˉ.CLS182;
import java.io.File;

public final class CLS1395 implements CLS15 {
    public final int FLD3954;
    public final String FLD3955;
    public final CLS97 FLD3956;

    public CLS1395(CLS97 ﾞٴ0, String s, int v) {
        this.FLD3954 = v;
        this.FLD3956 = ﾞٴ0;
        this.FLD3955 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS15
    public final void MTH794() {
        CLS97 ﾞٴ0 = this.FLD3956;
        String s = this.FLD3955;
        switch(this.FLD3954) {
            case 0: {
                ﾞٴ0.MTH1768(new File(CLS66.MTH1449(s)));
                return;
            }
            case 1: {
                ﾞٴ0.MTH1768(new File(CLS66.MTH1449(s)));
                return;
            }
            default: {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("origin");
                ﾞٴ0.MTH1768(new File(CLS66.MTH1449(stringBuilder0.toString())));
            }
        }
    }
}

