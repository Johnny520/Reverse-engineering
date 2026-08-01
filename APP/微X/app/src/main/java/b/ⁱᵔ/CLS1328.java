// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS568;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1328 implements CLS11 {
    public final CLS366 FLD3681;
    public final CLS12 FLD3682;

    public CLS1328(CLS366 ﾞᐧ0, CLS568 יᐧ0) {
        this.FLD3681 = ﾞᐧ0;
        this.FLD3682 = יᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        ArrayList arrayList0 = this.FLD3681.FLD3455;
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            arrayList1.add("");
        }
        this.FLD3682.MTH791(arrayList1);
    }
}

