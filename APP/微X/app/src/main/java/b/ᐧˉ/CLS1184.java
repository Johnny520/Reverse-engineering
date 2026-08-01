// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1184 implements CLS2 {
    public final ArrayList FLD2773;
    public final CLS359 FLD2774;

    public CLS1184(ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2773 = arrayList0;
        this.FLD2774 = ⁱˉ0;
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
        String s2 = CLS182.MTH3484(4100786954780332853L, new StringBuilder(), s);
        ContentValues contentValues0 = new ContentValues();
        String s3 = CLS182.MTH3479(-4, contentValues0, "type", 4100786997730005813L);
        CLS182.MTH3478(4100787019204842293L, new StringBuilder(), 4100787066449482549L, s1, contentValues0, s3);
        contentValues0.put("avatar", s);
        contentValues0.put("msg", s2);
        contentValues0.put("checked", Boolean.TRUE);
        this.FLD2773.add(contentValues0);
        this.FLD2774.MTH5235(this.FLD2773);
        this.FLD2774.MTH5231(contentValues0);
    }
}

