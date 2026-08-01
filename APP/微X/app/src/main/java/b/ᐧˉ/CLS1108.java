// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ˈˈ.CLS86;
import b.ⁱʾ.CLS332;

public final class CLS1108 implements CLS11 {
    public final CLS86 FLD2437;
    public final CLS1112 FLD2438;

    public CLS1108(CLS1112 ᐧˏ0, CLS86 ٴـ0) {
        this.FLD2438 = ᐧˏ0;
        this.FLD2437 = ٴـ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD2438.FLD2466.MTH1272(this.FLD2437);
        this.FLD2438.FLD2454.remove(this.FLD2437);
        CLS332 ˊﾞ0 = this.FLD2438.FLD2465;
        if(ˊﾞ0 != null) {
            ˊﾞ0.notifyDataSetChanged();
        }
    }
}

