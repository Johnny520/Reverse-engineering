// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import java.util.ArrayList;
import java.util.HashSet;

public final class CLS298 implements CLS136 {
    public final int FLD920;
    public final CLS131 FLD921;

    public CLS298(CLS131 ⁱʽ$ˆٴ0, int v) {
        this.FLD920 = v;
        this.FLD921 = ⁱʽ$ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        CLS131 ⁱʽ$ˆٴ0 = this.FLD921;
        if(this.FLD920 == 0) {
            ⁱʽ$ˆٴ0.getClass();
            ArrayList arrayList0 = (ArrayList)CLS123.FLD912.MTH2010("core", "listModuleFiles", new Object[]{ⁱʽ$ˆٴ0.FLD939, ⁱʽ$ˆٴ0.FLD941});
            ⁱʽ$ˆٴ0.FLD937.clear();
            ⁱʽ$ˆٴ0.FLD937.addAll(arrayList0);
            ⁱʽ$ˆٴ0.FLD940.clear();
            ⁱʽ$ˆٴ0.FLD940.addAll(ⁱʽ$ˆٴ0.FLD937);
            HashSet hashSet0 = new HashSet(ⁱʽ$ˆٴ0.FLD938.keySet());
            ⁱʽ$ˆٴ0.FLD938.clear();
            for(Object object0: hashSet0) {
                ⁱʽ$ˆٴ0.MTH2076(((String)object0));
            }
            CLS298 יᐧ0 = new CLS298(ⁱʽ$ˆٴ0, 1);
            CLS137.FLD972.MTH2141(((CLS136)יᐧ0));
            return;
        }
        for(Object object1: ⁱʽ$ˆٴ0.FLD937) {
            ⁱʽ$ˆٴ0.MTH2077(((String)object1));
        }
    }
}

