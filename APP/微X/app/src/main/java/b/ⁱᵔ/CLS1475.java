// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS2;
import b.ˈˈ.CLS79;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1475 implements CLS2 {
    public final boolean FLD4405;
    public final Activity FLD4406;

    public CLS1475(Activity activity0, boolean z) {
        this.FLD4405 = z;
        this.FLD4406 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            arrayList1.add("");
        }
        if(this.FLD4405) {
            CLS371.FLD3470.MTH5326(arrayList1);
            CLS79.FLD292.MTH1633();
            return;
        }
        CLS1390 ˈʾ0 = new CLS1390(arrayList1);
        CLS523.MTH7142(this.FLD4406, ((CLS11)ˈʾ0));
    }
}

