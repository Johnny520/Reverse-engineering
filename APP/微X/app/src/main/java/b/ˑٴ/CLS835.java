// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ⁱᵔ.CLS404;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS835 implements CLS2 {
    public final CLS3 FLD1287;
    public final ArrayList FLD1288;
    public final String FLD1289;
    public final CLS794 FLD1290;

    public CLS835(CLS794 ᴵʽ0, CLS3 ˆٴ0, String s, ArrayList arrayList0) {
        this.FLD1290 = ᴵʽ0;
        this.FLD1287 = ˆٴ0;
        this.FLD1289 = s;
        this.FLD1288 = arrayList0;
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
        this.FLD1287.MTH774();
        this.FLD1290.FLD1147.MTH1646(this.FLD1289, arrayList1);
        CLS404.MTH5896(this.FLD1289, this.FLD1288, arrayList0);
    }
}

