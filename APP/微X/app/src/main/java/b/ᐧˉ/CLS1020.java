// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS81;
import b.ⁱᵔ.CLS523;

public final class CLS1020 implements CLS3 {
    public final int FLD2093;
    public final Activity FLD2094;
    public final CLS1062 FLD2095;
    public final CLS81 FLD2096;

    public CLS1020(CLS1062 יٴ0, Activity activity0, CLS81 יᐧ0, int v) {
        this.FLD2093 = v;
        this.FLD2095 = יٴ0;
        this.FLD2094 = activity0;
        this.FLD2096 = יᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD2094;
        CLS81 יᐧ0 = this.FLD2096;
        CLS1062 יٴ0 = this.FLD2095;
        switch(this.FLD2093) {
            case 0: {
                יٴ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("title"), "", יᐧ0.FLD307, 1, ((CLS16)new CLS1156(יٴ0, יᐧ0, 11)));
                return;
            }
            case 1: {
                יٴ0.getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS1057(יٴ0, יᐧ0)));
                return;
            }
            default: {
                יٴ0.getClass();
                CLS523.MTH7160(activity0, CLS27.MTH889("tags") + ": " + יᐧ0.FLD307, ((CLS17)new CLS1049(יٴ0, יᐧ0, activity0, 0)), ((CLS11)new CLS1060(יٴ0, יᐧ0)));
            }
        }
    }
}

