// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ᵔʾ.CLS304.CLS303;
import b.ᵔʾ.CLS304;
import b.ⁱʾ.CLS319;
import java.util.Iterator;

public final class CLS943 implements CLS11 {
    public final CLS174 FLD1795;

    public CLS943(CLS174 ʻˑ0) {
        this.FLD1795 = ʻˑ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS174 ʻˑ0 = this.FLD1795;
        Iterator iterator0 = ʻˑ0.FLD1676.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            CLS304.FLD3172.MTH4908(((CLS303)object0));
            iterator0.remove();
        }
        CLS304.FLD3172.MTH4909();
        CLS319 ˆٴ0 = ʻˑ0.FLD1681;
        if(ˆٴ0 != null) {
            ˆٴ0.notifyDataSetChanged();
        }
    }
}

