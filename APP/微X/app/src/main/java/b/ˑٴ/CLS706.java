// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS706 implements CLS2 {
    public final String FLD831;
    public final CLS794 FLD832;

    public CLS706(CLS794 ᴵʽ0, String s) {
        this.FLD832 = ᴵʽ0;
        this.FLD831 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            this.FLD832.FLD1447.MTH3025(this.FLD831, "");
        }
    }
}

