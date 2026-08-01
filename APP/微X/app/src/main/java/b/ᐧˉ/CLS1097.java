// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ˈˈ.CLS86;
import java.util.Iterator;

public final class CLS1097 implements CLS11 {
    public final CLS1112 FLD2384;

    public CLS1097(CLS1112 ᐧˏ0) {
        this.FLD2384 = ᐧˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS1112 ᐧˏ0 = this.FLD2384;
        Iterator iterator0 = ᐧˏ0.FLD2454.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ᐧˏ0.FLD2466.MTH1272(((CLS86)object0));
            iterator0.remove();
        }
        ᐧˏ0.FLD2465.notifyDataSetChanged();
    }
}

