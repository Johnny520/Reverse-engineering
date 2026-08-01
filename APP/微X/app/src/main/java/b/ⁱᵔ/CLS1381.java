// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS846;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1622;
import java.util.Calendar;

public final class CLS1381 implements CLS11 {
    public final String[] FLD3899;
    public final CLS3 FLD3900;
    public final String FLD3901;
    public final CLS1622 FLD3902;
    public final Calendar FLD3903;

    public CLS1381(String[] arr_s, CLS1622 ˑٴ0, String s, Calendar calendar0, CLS846 ⁱˎ0) {
        this.FLD3899 = arr_s;
        this.FLD3902 = ˑٴ0;
        this.FLD3901 = s;
        this.FLD3903 = calendar0;
        this.FLD3900 = ⁱˎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = this.FLD3899[0];
        String s1 = this.FLD3902.MTH7285();
        String s2 = this.FLD3901;
        if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            boolean z = s.equals(CLS27.MTH904());
            long v = this.FLD3903.getTime().getTime();
            if(!z && CLS426.MTH6126(s2)) {
                s1 = CLS182.MTH3484(0x38EAD2E62B3CD335L, CLS182.MTH3483(s), s1);
            }
            CLS66.MTH1441(this.FLD3901, s1, v, 1, ((int)z));
            this.FLD3900.MTH774();
        }
    }
}

