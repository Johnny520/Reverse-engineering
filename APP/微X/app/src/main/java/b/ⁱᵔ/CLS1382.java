// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS1382 implements CLS16 {
    public final int FLD3904;
    public final CLS335 FLD3905;
    public final ArrayList FLD3906;

    public CLS1382(int v, CLS335 ˑٴ0, ArrayList arrayList0) {
        this.FLD3904 = v;
        this.FLD3906 = arrayList0;
        this.FLD3905 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS335 ˑٴ0 = this.FLD3905;
        ArrayList arrayList0 = this.FLD3906;
        if(this.FLD3904 == 0) {
            if(!TextUtils.isEmpty(s) && arrayList0.size() < 9) {
                CLS432.MTH6173(s, ((CLS3)new CLS1593(s, arrayList0, ˑٴ0, 2)));
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            CLS432.MTH6173(s, ((CLS3)new CLS1593(ˑٴ0, s, arrayList0)));
        }
    }
}

