// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS2;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1608 implements CLS2 {
    public final ArrayList FLD5097;
    public final CLS359 FLD5098;

    public CLS1608(CLS359 ⁱˉ0, ArrayList arrayList0) {
        this.FLD5097 = arrayList0;
        this.FLD5098 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        ContentValues contentValues0 = new ContentValues();
        String s2 = CLS182.MTH3479(-4, contentValues0, "type", 0x38EA90532B3CD335L);
        CLS182.MTH3478(0x38EA90582B3CD335L, new StringBuilder(), 0x38EA90632B3CD335L, s1, contentValues0, s2);
        contentValues0.put("avatar", s);
        this.FLD5097.add(contentValues0);
        this.FLD5098.MTH5235(this.FLD5097);
        this.FLD5098.MTH5231(contentValues0);
    }
}

