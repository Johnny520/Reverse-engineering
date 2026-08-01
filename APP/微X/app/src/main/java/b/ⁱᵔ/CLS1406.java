// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import java.io.File;

public final class CLS1406 implements CLS3 {
    public final CLS442 FLD4019;

    public CLS1406(CLS442 ˎᵢ0) {
        this.FLD4019 = ˎᵢ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS442 ˎᵢ0 = this.FLD4019;
        if(!TextUtils.isEmpty(ˎᵢ0.FLD4214)) {
            File file0 = new File(ˎᵢ0.FLD4214);
            ˎᵢ0.FLD4224 = file0;
            ˎᵢ0.FLD4219 = file0;
            ˎᵢ0.MTH6229();
        }
    }
}

