// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;

public final class CLS1391 implements CLS2 {
    public final CLS1626 FLD3942;

    public CLS1391(CLS1626 ـﹳ0) {
        this.FLD3942 = ـﹳ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arrayList0.size(); ++v) {
                stringBuilder0.append(v + 1);
                stringBuilder0.append(". ");
                stringBuilder0.append("");
                stringBuilder0.append("<br>");
                if(v > 10) {
                    stringBuilder0.append("...");
                    break;
                }
            }
            CLS409.FLD3998 = s;
            this.FLD3942.MTH800(stringBuilder0.toString());
        }
    }
}

