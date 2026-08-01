// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS12;
import java.util.HashSet;

public final class CLS1545 implements CLS12 {
    public final int FLD4806;
    public final HashSet FLD4807;

    public CLS1545(HashSet hashSet0, int v) {
        this.FLD4806 = v;
        this.FLD4807 = hashSet0;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        HashSet hashSet0 = this.FLD4807;
        switch(this.FLD4806) {
            case 0: {
                if(!TextUtils.isEmpty(((String)object0))) {
                    hashSet0.clear();
                    hashSet0.add(((String)object0));
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(((String)object0))) {
                    hashSet0.add(((String)object0));
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(((String)object0))) {
                    hashSet0.remove(((String)object0));
                }
            }
        }
    }
}

