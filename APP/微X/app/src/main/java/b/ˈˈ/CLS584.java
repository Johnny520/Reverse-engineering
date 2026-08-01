// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ˑٴ.CLS139;
import b.ـˏ.CLS169;
import b.ـˏ.CLS885;
import b.ـˏ.CLS887;
import b.ٴـ.CLS896.CLS170;
import b.ⁱᵔ.CLS502;
import java.util.HashMap;

public final class CLS584 implements CLS12 {
    public final int FLD358;
    public final String FLD359;
    public final CLS139 FLD360;

    public CLS584(CLS139 ﹶʼ0, String s, int v) {
        this.FLD358 = v;
        this.FLD360 = ﹶʼ0;
        this.FLD359 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS139 ﹶʼ0 = this.FLD360;
        String s = this.FLD359;
        if(this.FLD358 == 0) {
            ﹶʼ0.MTH3029(new CLS170(((CLS169)new CLS885(((HashMap)object0))), s));
            return;
        }
        ﹶʼ0.getClass();
        String s1 = new String(((byte[])object0));
        if(!TextUtils.isEmpty(s1)) {
            ﹶʼ0.MTH3019(((CLS169)new CLS887(CLS502.MTH6921(s1))), s);
        }
    }
}

