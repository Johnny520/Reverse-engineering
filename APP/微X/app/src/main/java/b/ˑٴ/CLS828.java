// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS828 implements CLS2 {
    public final String FLD1264;
    public final CLS794 FLD1265;
    public final CLS3 FLD1266;

    public CLS828(CLS794 ᴵʽ0, String s, CLS3 ˆٴ0) {
        this.FLD1265 = ᴵʽ0;
        this.FLD1264 = s;
        this.FLD1266 = ˆٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            arrayList1.add("");
        }
        this.FLD1265.FLD1147.MTH1623(this.FLD1264, arrayList1);
        this.FLD1266.MTH774();
    }
}

