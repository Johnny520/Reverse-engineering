// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1527 implements CLS8 {
    public final ArrayList FLD4699;
    public final CLS359 FLD4700;

    public CLS1527(CLS359 ⁱˉ0, ArrayList arrayList0) {
        this.FLD4699 = arrayList0;
        this.FLD4700 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(!TextUtils.isEmpty(((String)object0))) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("type", -16);
            contentValues0.put("path", ((String)object0));
            contentValues0.put("desc", CLS27.MTH889("video"));
            this.FLD4699.add(contentValues0);
            this.FLD4700.MTH5235(this.FLD4699);
            this.FLD4700.MTH5231(contentValues0);
        }
    }
}

