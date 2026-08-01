// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import java.util.ArrayList;

public final class CLS1153 implements CLS2 {
    public final String FLD2626;
    public final CLS1000 FLD2627;

    public CLS1153(CLS1000 ˋˋ0, String s) {
        this.FLD2627 = ˋˋ0;
        this.FLD2626 = s;
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
        stringBuilder0.append(this.FLD2626);
        stringBuilder0.append(",");
        stringBuilder0.append(s1);
        ˎᵢ0.MTH922(stringBuilder0.toString(), "friendreq_limit_hack_fixed");
        StringBuilder stringBuilder1 = CLS182.MTH3483(this.FLD2626);
        stringBuilder1.append(": ");
        stringBuilder1.append(s1);
        this.FLD2627.FLD2037.MTH798(stringBuilder1.toString());
    }
}

