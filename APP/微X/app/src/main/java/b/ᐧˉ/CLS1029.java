// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1029 implements CLS2 {
    public final CLS899 FLD2131;

    public CLS1029(CLS899 ʻʼ0) {
        this.FLD2131 = ʻʼ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS899 ʻʼ0 = this.FLD2131;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ʻʼ0.FLD2151.MTH922(s, "zombie_excl_list");
            return;
        }
        ʻʼ0.FLD2151.MTH922("", "zombie_excl_list");
    }
}

