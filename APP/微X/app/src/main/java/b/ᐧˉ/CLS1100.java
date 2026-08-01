// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1100 implements CLS8 {
    public final ArrayList FLD2396;
    public final CLS359 FLD2397;

    public CLS1100(ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2396 = arrayList0;
        this.FLD2397 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(!TextUtils.isEmpty(((String)object0))) {
            String s = CLS182.MTH3484(4100642338936509237L, new StringBuilder(), ((String)object0));
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("type", -16);
            contentValues0.put("path", ((String)object0));
            contentValues0.put("desc", CLS27.MTH889("video"));
            contentValues0.put("msg", s);
            contentValues0.put("checked", Boolean.TRUE);
            this.FLD2396.add(contentValues0);
            this.FLD2397.MTH5235(this.FLD2396);
            this.FLD2397.MTH5231(contentValues0);
        }
    }
}

