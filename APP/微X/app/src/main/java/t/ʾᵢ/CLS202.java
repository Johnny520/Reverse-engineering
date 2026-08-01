// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import t.ⁱʾ.CLS140;
import t.ⁱʾ.CLS144;

public final class CLS202 implements CLS140 {
    public final int FLD183;
    public final int FLD184;
    public final CLS144 FLD185;

    public CLS202(CLS144 ˊﾞ0, int v, int v1) {
        this.FLD183 = v1;
        this.FLD185 = ˊﾞ0;
        this.FLD184 = v;
        super();
    }

    @Override  // t.ⁱʾ.CLS140
    public final void MTH2164(String s) {
        CLS144 ˊﾞ0 = this.FLD185;
        int v = this.FLD184;
        if(this.FLD183 == 0) {
            if(!TextUtils.isEmpty(s)) {
                ˊﾞ0.MTH2170(new Object[]{v, Integer.valueOf(s)});
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            ˊﾞ0.MTH2170(new Object[]{v, Integer.valueOf(s)});
        }
    }
}

