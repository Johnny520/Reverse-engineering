// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS8;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1507 implements CLS8 {
    public final HashMap FLD4588;
    public final String FLD4589;
    public final Activity FLD4590;

    public CLS1507(HashMap hashMap0, Activity activity0, String s) {
        this.FLD4588 = hashMap0;
        this.FLD4590 = activity0;
        this.FLD4589 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: ((ArrayList)object0)) {
                arrayList0.add(((String)this.FLD4588.get(((String)object1))));
            }
            CLS403.MTH5869(this.FLD4590, arrayList0, this.FLD4589, true, null);
        }
    }
}

