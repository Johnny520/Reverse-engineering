// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Intent;
import android.graphics.Bitmap;
import b.ʻˑ.CLS12;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS485;
import java.util.ArrayList;

public final class CLS859 implements CLS12 {
    public final CLS725 FLD1361;
    public final long FLD1362;
    public final String FLD1363;
    public final String FLD1364;
    public final String FLD1365;

    public CLS859(CLS725 ˏˈ0, String s, String s1, String s2, long v) {
        this.FLD1361 = ˏˈ0;
        this.FLD1364 = s;
        this.FLD1363 = s1;
        this.FLD1365 = s2;
        this.FLD1362 = v;
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS485 ᐧﾞ0 = this.FLD1361.MTH2410();
        Bitmap bitmap0 = CLS372.MTH5411(this.FLD1364);
        this.FLD1361.MTH2410().getClass();
        Intent intent0 = CLS485.MTH6743();
        ᐧﾞ0.MTH6713(this.FLD1364, this.FLD1363, this.FLD1365, ((ArrayList)object0), bitmap0, this.FLD1362, intent0);
    }
}

