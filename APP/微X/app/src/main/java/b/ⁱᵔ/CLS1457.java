// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS1457 implements CLS8 {
    public final ArrayList FLD4311;
    public final CLS335 FLD4312;

    public CLS1457(CLS335 ˑٴ0, ArrayList arrayList0) {
        this.FLD4311 = arrayList0;
        this.FLD4312 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ArrayList arrayList0 = this.FLD4311;
        if(arrayList0.size() >= 9) {
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("img", ((String)object0));
        contentValues0.put("desc", ((String)object0));
        arrayList0.add(contentValues0);
        this.FLD4312.MTH5112();
    }
}

