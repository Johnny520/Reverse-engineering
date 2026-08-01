// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS971 implements CLS2 {
    public final String FLD1910;
    public final CLS210 FLD1911;

    public CLS971(CLS210 ˋʼ0, String s) {
        this.FLD1911 = ˋʼ0;
        this.FLD1910 = s;
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
        this.FLD1911.FLD2007.MTH7277(this.FLD1910 + " " + s);
    }
}

