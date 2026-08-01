// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1215 implements CLS2 {
    public final CLS1030 FLD2879;

    public CLS1215(CLS1030 ˎᵢ0) {
        this.FLD2879 = ˎᵢ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS1030 ˎᵢ0 = this.FLD2879;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ˎᵢ0.FLD2151.MTH922(s, "autoreply_exclude_usernames");
            return;
        }
        ˎᵢ0.FLD2151.MTH922("", "autoreply_exclude_usernames");
    }
}

