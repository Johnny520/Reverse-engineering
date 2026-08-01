// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS1258;
import b.ⁱᵔ.CLS466;
import java.io.File;

public final class CLS574 implements CLS3 {
    public final int FLD142;
    public final String FLD143;
    public final String FLD144;

    public CLS574(int v, String s, String s1) {
        this.FLD142 = v;
        this.FLD144 = s;
        this.FLD143 = s1;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD143;
        String s1 = this.FLD144;
        switch(this.FLD142) {
            case 0: {
                String s2 = CLS31.MTH1030(new File(CLS31.MTH1038(CLS27.MTH900()), s1), s);
                if(!TextUtils.isEmpty(s2)) {
                    CLS31.MTH996(s2);
                    CLS466.MTH6506(new File(s2));
                }
                return;
            }
            case 1: {
                CLS66.MTH1458(s1, s);
                return;
            }
            case 2: {
                CLS466.MTH6529(((CLS6)new CLS1258(6, s1)), CLS66.MTH1508(s), true);
                return;
            }
            default: {
                CLS466.MTH6529(((CLS6)new CLS1258(16, s1)), CLS66.MTH1508(s), true);
            }
        }
    }
}

