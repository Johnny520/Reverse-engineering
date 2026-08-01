// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1206 implements CLS2 {
    public final String FLD2837;
    public final CLS210 FLD2838;

    public CLS1206(CLS210 ˋʼ0, String s) {
        this.FLD2838 = ˋʼ0;
        this.FLD2837 = s;
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
        this.FLD2838.FLD2007.MTH7277(this.FLD2837 + "#chatroom " + s + " ");
    }
}

