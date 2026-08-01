// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1548 implements CLS8 {
    public final ArrayList FLD4815;
    public final CLS359 FLD4816;

    public CLS1548(CLS359 ⁱˉ0, ArrayList arrayList0) {
        this.FLD4815 = arrayList0;
        this.FLD4816 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("img", ((String)object0));
        contentValues0.put(CLS182.MTH3479(0xFFFFFFD1, contentValues0, "type", 0x38EA900C2B3CD335L), CLS27.MTH889("gif"));
        this.FLD4815.add(contentValues0);
        this.FLD4816.MTH5235(this.FLD4815);
        this.FLD4816.MTH5231(contentValues0);
    }
}

