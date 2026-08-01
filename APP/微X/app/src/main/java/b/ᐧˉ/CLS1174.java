// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1174 implements CLS2 {
    public final String FLD2725;
    public final CLS244 FLD2726;

    public CLS1174(CLS244 ᴵʻ0, String s) {
        this.FLD2726 = ᴵʻ0;
        this.FLD2725 = s;
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
        this.FLD2726.FLD2540.MTH7277(this.FLD2725 + "#chatroom " + s + " ");
    }
}

