// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS1573 implements CLS2 {
    public final boolean FLD4920;
    public final ArrayList FLD4921;
    public final Activity FLD4922;

    public CLS1573(Activity activity0, ArrayList arrayList0) {
        this.FLD4920 = true;
        this.FLD4922 = activity0;
        this.FLD4921 = arrayList0;
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
        CLS1420 ˋˋ0 = new CLS1420(this, hashSet0);
        CLS387.MTH5585(this.FLD4920, this.FLD4922, this.FLD4921, ((CLS2)ˋˋ0), null, -1);
    }
}

