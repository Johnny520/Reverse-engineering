// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1048 implements CLS8 {
    public final ArrayList FLD2237;
    public final CLS359 FLD2238;

    public CLS1048(ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2237 = arrayList0;
        this.FLD2238 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        String s = CLS182.MTH3489(4100600209602302773L, new StringBuilder(), object0);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("img", ((String)object0));
        contentValues0.put(CLS182.MTH3479(0xFFFFFFD1, contentValues0, "type", 4100600274026812213L), CLS27.MTH889("gif"));
        contentValues0.put("msg", s);
        contentValues0.put("checked", Boolean.TRUE);
        this.FLD2237.add(contentValues0);
        this.FLD2238.MTH5235(this.FLD2237);
        this.FLD2238.MTH5231(contentValues0);
    }
}

