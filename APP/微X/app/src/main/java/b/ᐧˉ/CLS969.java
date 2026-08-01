// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS969 implements CLS8 {
    public final ArrayList FLD1894;
    public final CLS359 FLD1895;

    public CLS969(ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD1894 = arrayList0;
        this.FLD1895 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(!TextUtils.isEmpty(((String)object0))) {
            String s = CLS182.MTH3484(0x38E9EBE02B3CD335L, new StringBuilder(), ((String)object0));
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("type", -16);
            contentValues0.put("path", ((String)object0));
            contentValues0.put("desc", CLS27.MTH889("video"));
            contentValues0.put("msg", s);
            contentValues0.put("checked", Boolean.TRUE);
            this.FLD1894.add(contentValues0);
            this.FLD1895.MTH5235(this.FLD1894);
            this.FLD1895.MTH5231(contentValues0);
        }
    }
}

