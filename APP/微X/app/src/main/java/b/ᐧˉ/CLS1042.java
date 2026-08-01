// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1042 implements CLS2 {
    public final CLS1105 FLD2216;

    public CLS1042(CLS1105 ᐧˈ0) {
        this.FLD2216 = ᐧˈ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS1105 ᐧˈ0 = this.FLD2216;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ᐧˈ0.FLD2151.MTH922(s, "confirm_transfer_exclude");
            return;
        }
        ᐧˈ0.FLD2151.MTH922("", "confirm_transfer_exclude");
    }
}

