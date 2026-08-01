// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS654 implements CLS2 {
    public final String FLD653;

    public CLS654(String s) {
        this.FLD653 = s;
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
            boolean z = CLS426.MTH6128("");
            String s2 = this.FLD653;
            if(z) {
                CLS66.MTH1376("", s2);
            }
            else {
                CLS466.MTH6515("", CLS27.MTH889("groupAnnounce"), "#ga " + s2);
            }
        }
    }
}

