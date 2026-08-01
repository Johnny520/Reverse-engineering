// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1079 implements CLS2 {
    public final ArrayList FLD2318;
    public final CLS359 FLD2319;

    public CLS1079(ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2318 = arrayList0;
        this.FLD2319 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s2 = CLS182.MTH3484(4100985270600258357L, new StringBuilder(), s);
        ContentValues contentValues0 = new ContentValues();
        String s3 = CLS182.MTH3479(-4, contentValues0, "type", 0x38E9A06A2B3CD335L);
        CLS182.MTH3478(0x38E9A06F2B3CD335L, new StringBuilder(), 4100985382269408053L, s1, contentValues0, s3);
        contentValues0.put("avatar", s);
        contentValues0.put("msg", s2);
        contentValues0.put("checked", Boolean.TRUE);
        this.FLD2318.add(contentValues0);
        this.FLD2319.MTH5235(this.FLD2318);
        this.FLD2319.MTH5231(contentValues0);
    }
}

