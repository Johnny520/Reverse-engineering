// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ˆʿ.CLS56;
import b.ˈˈ.CLS86;
import b.ⁱʾ.CLS332;

public final class CLS900 implements CLS11 {
    public final CLS1112 FLD1667;

    public CLS900(CLS1112 ᐧˏ0) {
        this.FLD1667 = ᐧˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS1112 ᐧˏ0 = this.FLD1667;
        if(TextUtils.isEmpty(ᐧˏ0.FLD2463)) {
            return;
        }
        int v = ᐧˏ0.MTH4203(ᐧˏ0.FLD2463);
        CLS56 ᵔʾ0 = ᐧˏ0.FLD2466;
        if(v == -1) {
            String s = ᐧˏ0.FLD2463;
            String s1 = ᐧˏ0.FLD2464;
            CLS86 ٴـ0 = new CLS86(0, ((int)ᐧˏ0.FLD2476.MTH7444()), s, s1, ᐧˏ0.MTH4201());
            ٴـ0.MTH1701(ᐧˏ0.FLD2475);
            ᐧˏ0.FLD2454.add(ٴـ0);
            ᵔʾ0.MTH1267(ٴـ0);
            CLS332 ˊﾞ0 = ᐧˏ0.FLD2465;
            if(ˊﾞ0 != null) {
                ˊﾞ0.notifyDataSetChanged();
            }
        }
        else {
            try {
                CLS86 ٴـ1 = (CLS86)ᐧˏ0.FLD2454.get(v);
                ٴـ1.FLD346 = ᐧˏ0.FLD2463;
                ٴـ1.MTH1701(ᐧˏ0.FLD2475);
                ٴـ1.FLD345 = ᐧˏ0.FLD2464;
                ٴـ1.FLD349 = ᐧˏ0.MTH4201();
                ٴـ1.MTH1702();
                ٴـ1.FLD344 = ᐧˏ0.FLD2476.MTH7444() ? 1 : 0;
                ᵔʾ0.MTH1267(ٴـ1);
                CLS332 ˊﾞ1 = ᐧˏ0.FLD2465;
                if(ˊﾞ1 != null) {
                    ˊﾞ1.notifyDataSetChanged();
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

