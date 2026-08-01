// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS395;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS822 implements CLS3 {
    public final int FLD1252;
    public final String FLD1253;
    public final CLS794 FLD1254;
    public final CLS3 FLD1255;

    public CLS822(CLS794 ᴵʽ0, String s, CLS3 ˆٴ0, int v) {
        this.FLD1252 = v;
        this.FLD1254 = ᴵʽ0;
        this.FLD1253 = s;
        this.FLD1255 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD1253;
        CLS794 ᴵʽ0 = this.FLD1254;
        if(this.FLD1252 == 0) {
            for(Object object0: ᴵʽ0.FLD1147.MTH1634(s)) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                if(ᴵʽ0.FLD1444.MTH5375("") > 0) {
                    CLS66.MTH1408("", null);
                }
            }
            this.FLD1255.MTH774();
            return;
        }
        CLS3 ˆٴ0 = this.FLD1255;
        ArrayList arrayList0 = ᴵʽ0.FLD1147.MTH1634(s);
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator1 = arrayList0.iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
            arrayList1.add("");
        }
        CLS395.MTH5744(false, ((CLS140)ᴵʽ0).MTH3042(), arrayList1, ((CLS3)new CLS848(ˆٴ0, s, arrayList1, arrayList0, 0)));
    }
}

