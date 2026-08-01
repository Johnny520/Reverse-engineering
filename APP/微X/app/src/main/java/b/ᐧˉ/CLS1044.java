// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1044 implements CLS2 {
    public final String FLD2219;
    public final CLS244 FLD2220;

    public CLS1044(CLS244 ᴵʻ0, String s) {
        this.FLD2220 = ᴵʻ0;
        this.FLD2219 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.FLD2220.FLD2540.MTH7277(this.FLD2219 + " " + s);
    }
}

