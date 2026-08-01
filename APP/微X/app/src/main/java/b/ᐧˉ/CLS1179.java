// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1179 implements CLS2 {
    public final ArrayList FLD2748;
    public final CLS210 FLD2749;
    public final CLS359 FLD2750;

    public CLS1179(CLS210 ˋʼ0, ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2749 = ˋʼ0;
        this.FLD2748 = arrayList0;
        this.FLD2750 = ⁱˉ0;
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
        String s2 = CLS34.MTH1079(4100671132397261621L, new StringBuilder(), s, 4100671179641901877L);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put(CLS182.MTH3479(101, contentValues0, "type", 4100671209706672949L), CLS27.MTH889("chatroom_invite") + ": " + this.FLD2749.FLD2006.MTH5316(s));
        contentValues0.put(CLS182.MTH3496(4100671862541701941L, contentValues0, s2, 4100671879721571125L), TextUtils.join(",", arrayList1));
        contentValues0.put("checked", Boolean.TRUE);
        this.FLD2748.add(contentValues0);
        this.FLD2750.MTH5235(this.FLD2748);
        this.FLD2750.MTH5231(contentValues0);
    }
}

