// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS1567 implements CLS8 {
    public final ArrayList FLD4887;
    public final CLS335 FLD4888;

    public CLS1567(CLS335 ˑٴ0, ArrayList arrayList0) {
        this.FLD4887 = arrayList0;
        this.FLD4888 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        this.FLD4887.clear();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("vid", ((String)object0));
        contentValues0.put("desc", ((String)object0));
        this.FLD4887.add(contentValues0);
        this.FLD4888.MTH5112();
    }
}

