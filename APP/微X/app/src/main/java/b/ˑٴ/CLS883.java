// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS432;

public final class CLS883 implements CLS16, CLS39 {
    public final String FLD1526;
    public final CLS3 FLD1527;
    public final String FLD1528;

    public CLS883(String s, String s1, CLS3 ˆٴ0) {
        this.FLD1526 = s;
        this.FLD1528 = s1;
        this.FLD1527 = ˆٴ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        if(CLS432.MTH6181(this.FLD1526) && CLS432.MTH6185(this.FLD1528, this.FLD1526)) {
            CLS3 ˆٴ0 = this.FLD1527;
            if(ˆٴ0 != null) {
                ˆٴ0.MTH774();
            }
        }
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        if(!TextUtils.isEmpty(s) && !this.FLD1526.equals(s)) {
            CLS372.MTH5408(this.FLD1528, s);
            CLS66.MTH1447(this.FLD1528);
            this.FLD1527.MTH774();
        }
    }
}

