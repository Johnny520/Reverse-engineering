// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ˈˈ.CLS79;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1489 implements CLS2 {
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
        CLS371.FLD3470.getClass();
        CLS371.FLD3470.MTH5318("Update rconversation set parentRef = \'\' where 1 != 1  or username in (\'" + TextUtils.join("\',\'", arrayList1) + "\')");
        CLS79.FLD292.MTH1633();
    }
}

