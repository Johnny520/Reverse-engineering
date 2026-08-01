// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS323;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class CLS1546 implements CLS2 {
    public final CLS425 FLD4808;

    public CLS1546(CLS425 ˊﹳ0) {
        this.FLD4808 = ˊﹳ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS425 ˊﹳ0;
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            ˊﹳ0 = this.FLD4808;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            CLS78 ˊﾞ0 = (CLS78)object0;
            arrayList1.add("");
            CLS323 ˈˈ0 = ˊﹳ0.FLD4096;
            HashMap hashMap0 = ˈˈ0.FLD3297;
            if(!hashMap0.containsKey("")) {
                hashMap0.put("", ˊﾞ0);
                ˈˈ0.FLD3290.add(ˊﾞ0);
            }
        }
        ˊﹳ0.FLD4096.MTH5050();
        ˊﹳ0.FLD4091.MTH1623(ˊﹳ0.FLD4088, arrayList1);
    }
}

