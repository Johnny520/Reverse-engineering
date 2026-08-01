// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS8;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS785 implements CLS11 {
    public final CLS8 FLD1117;
    public final CLS335 FLD1118;

    public CLS785(CLS8 ـˏ0, CLS335 ˑٴ0) {
        this.FLD1117 = ـˏ0;
        this.FLD1118 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS8 ـˏ0 = this.FLD1117;
        if(ـˏ0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.FLD1118.FLD3333) {
                arrayList0.add(((ContentValues)object0).getAsString("img"));
            }
            ـˏ0.MTH786(arrayList0);
        }
    }
}

