// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ˈˈ.CLS86;
import b.ⁱᵔ.CLS426;
import java.util.ArrayList;

public final class CLS1211 implements CLS2 {
    public final String FLD2856;
    public final CLS1112 FLD2857;

    public CLS1211(CLS1112 ᐧˏ0, String s) {
        this.FLD2857 = ᐧˏ0;
        this.FLD2856 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
        CLS1112 ᐧˏ0 = this.FLD2857;
        ᐧˏ0.FLD2463 = this.FLD2856;
        if(TextUtils.isEmpty(this.FLD2856)) {
            return;
        }
        if(CLS426.MTH6126(ᐧˏ0.FLD2463)) {
            ᐧˏ0.FLD2479.MTH801(0);
            ᐧˏ0.FLD2460.MTH801(0);
            ᐧˏ0.FLD2480.MTH801(8);
            return;
        }
        ᐧˏ0.FLD2479.MTH801(8);
        ᐧˏ0.FLD2460.MTH801(8);
        ᐧˏ0.FLD2480.MTH801(0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS1112 ᐧˏ0 = this.FLD2857;
        if(arrayList0 != null) {
            try {
                if(!arrayList0.isEmpty()) {
                    ᐧˏ0.FLD2463 = s;
                    ᐧˏ0.FLD2470.MTH798(s1);
                    ᐧˏ0.FLD2475 = "";
                    int v = ᐧˏ0.MTH4203(ᐧˏ0.FLD2463);
                    if(v == -1) {
                        ᐧˏ0.FLD2464 = null;
                    }
                    else {
                        CLS86 ٴـ0 = (CLS86)ᐧˏ0.FLD2454.get(v);
                        ᐧˏ0.FLD2464 = ٴـ0.FLD345;
                        ᐧˏ0.FLD2476.MTH7437(ٴـ0.FLD344 == 1);
                        ᐧˏ0.MTH4204(ٴـ0.FLD349);
                        ᐧˏ0.FLD2475 = ٴـ0.MTH1699();
                    }
                    if(CLS426.MTH6126(ᐧˏ0.FLD2463)) {
                        ᐧˏ0.FLD2479.MTH801(0);
                        ᐧˏ0.FLD2460.MTH801(0);
                        ᐧˏ0.FLD2480.MTH801(8);
                        return;
                    }
                    ᐧˏ0.FLD2479.MTH801(8);
                    ᐧˏ0.FLD2460.MTH801(8);
                    ᐧˏ0.FLD2480.MTH801(0);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

