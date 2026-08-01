// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS314;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS647 implements CLS2 {
    public final String FLD630;
    public final CLS794 FLD631;

    public CLS647(CLS794 ᴵʽ0, String s) {
        this.FLD631 = ᴵʽ0;
        this.FLD630 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        HashSet hashSet0 = new HashSet();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            hashSet0.add("");
        }
        if(hashSet0.isEmpty()) {
            return;
        }
        String s2 = this.FLD630;
        if(CLS66.MTH1455(s2)) {
            CLS523.MTH7165(((CLS140)this.FLD631).MTH3042(), CLS371.FLD3470.MTH5316(s2), CLS27.MTH889("reason"), "", 1, ((CLS16)new CLS1255(s2, hashSet0, 17)));
            return;
        }
        ArrayList arrayList1 = new ArrayList(hashSet0);
        CLS314.FLD3231.MTH5003(s2, null, arrayList1);
        CLS314.FLD3231.MTH5002();
    }
}

