// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ˈˈ.CLS86;
import b.ⁱʾ.CLS332;
import b.ⁱᵔ.CLS502;

public final class CLS992 implements CLS11 {
    public final CLS1112 FLD1978;

    public CLS992(CLS1112 ᐧˏ0) {
        this.FLD1978 = ᐧˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS1112 ᐧˏ0 = this.FLD1978;
        if(TextUtils.isEmpty(ᐧˏ0.FLD2478)) {
            return;
        }
        String[] arr_s = CLS502.MTH6941(ᐧˏ0.FLD2478);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            CLS86 ٴـ0 = new CLS86(0, ((int)ᐧˏ0.FLD2476.MTH7444()), s, null, ᐧˏ0.MTH4201());
            ᐧˏ0.FLD2454.add(ٴـ0);
            ᐧˏ0.FLD2466.MTH1267(ٴـ0);
            CLS332 ˊﾞ0 = ᐧˏ0.FLD2465;
            if(ˊﾞ0 != null) {
                ˊﾞ0.notifyDataSetChanged();
            }
        }
    }
}

