// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS323;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1467 implements CLS3 {
    public final int FLD4368;
    public final CLS425 FLD4369;

    public CLS1467(CLS425 ˊﹳ0, int v) {
        this.FLD4368 = v;
        this.FLD4369 = ˊﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS425 ˊﹳ0 = this.FLD4369;
        if(this.FLD4368 == 0) {
            CLS323 ˈˈ0 = ˊﹳ0.FLD4096;
            ˈˈ0.getClass();
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = ˈˈ0.FLD3290.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                if(!CLS404.MTH5909("") && ˈˈ0.MTH5045("")) {
                    arrayList0.add("");
                }
            }
            for(Object object0: arrayList0) {
                CLS66.MTH1408(((String)object0), null);
            }
            ˊﹳ0.FLD4096.MTH5050();
            return;
        }
        ˊﹳ0.FLD4096.MTH5050();
    }
}

