// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1407 implements CLS8 {
    public final ArrayList FLD4024;
    public final CLS359 FLD4025;

    public CLS1407(CLS359 ⁱˉ0, ArrayList arrayList0) {
        this.FLD4024 = arrayList0;
        this.FLD4025 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        try {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("img", ((String)object0));
            contentValues0.put("type", -2);
            contentValues0.put("desc", CLS27.MTH889("image"));
            this.FLD4024.add(contentValues0);
            this.FLD4025.MTH5235(this.FLD4024);
            this.FLD4025.MTH5231(contentValues0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

