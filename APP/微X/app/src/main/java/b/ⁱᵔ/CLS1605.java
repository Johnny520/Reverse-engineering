// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˑٴ.CLS766;
import java.io.File;
import java.util.HashMap;

public final class CLS1605 implements CLS8 {
    public final HashMap FLD5084;
    public final Activity FLD5085;
    public final File FLD5086;
    public final CLS3 FLD5087;

    public CLS1605(HashMap hashMap0, File file0, Activity activity0, CLS3 ˆٴ0) {
        this.FLD5084 = hashMap0;
        this.FLD5086 = file0;
        this.FLD5085 = activity0;
        this.FLD5087 = ˆٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
        CLS31.MTH1035(this.FLD5086);
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        CLS766 ـﹶ0 = new CLS766(object0, this.FLD5084, this.FLD5086, this.FLD5085, this.FLD5087, 14);
        CLS40.FLD157.MTH1124(((CLS39)ـﹶ0));
    }
}

