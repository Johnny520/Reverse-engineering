// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS722 implements CLS2 {
    public final String FLD873;
    public final int FLD874;
    public final String FLD875;

    public CLS722(String s, String s1, int v) {
        this.FLD873 = s;
        this.FLD875 = s1;
        this.FLD874 = v;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                CLS466.MTH6502(CLS426.MTH6106(this.FLD874, this.FLD873, this.FLD875), "");
            }
        }
    }
}

