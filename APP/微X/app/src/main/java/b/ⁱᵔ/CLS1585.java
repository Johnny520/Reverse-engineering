// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;

public final class CLS1585 implements CLS2 {
    public final String FLD4973;
    public final CLS1320 FLD4974;

    public CLS1585(CLS1320 ʾʼ$ﾞˎ0, String s) {
        this.FLD4974 = ʾʼ$ﾞˎ0;
        this.FLD4973 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        stringBuilder0.append(",");
        stringBuilder0.append(this.FLD4973);
        stringBuilder0.append(",");
        stringBuilder0.append(s1);
        ˎᵢ0.MTH922(stringBuilder0.toString(), "friendreq_limit_hack_fixed");
        StringBuilder stringBuilder1 = CLS182.MTH3483(this.FLD4973);
        stringBuilder1.append(": ");
        stringBuilder1.append(s1);
        this.FLD4974.FLD3641.MTH798(stringBuilder1.toString());
    }
}

