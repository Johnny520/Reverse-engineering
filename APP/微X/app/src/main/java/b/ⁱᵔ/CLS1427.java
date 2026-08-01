// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS21;
import java.util.ArrayList;

public final class CLS1427 implements CLS11 {
    public final ArrayList FLD4182;

    public CLS1427(ArrayList arrayList0) {
        this.FLD4182 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        for(Object object0: this.FLD4182) {
            CLS21.FLD76.MTH818("permaban", new Object[]{((String)object0)});
        }
    }
}

