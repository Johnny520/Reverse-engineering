// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1204 implements CLS2 {
    public final ArrayList FLD2831;
    public final CLS244 FLD2832;
    public final CLS359 FLD2833;

    public CLS1204(CLS244 ᴵʻ0, ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2832 = ᴵʻ0;
        this.FLD2831 = arrayList0;
        this.FLD2833 = ⁱˉ0;
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
        String s2 = CLS34.MTH1079(4100638804178424629L, new StringBuilder(), s, 4100638851423064885L);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put(CLS182.MTH3479(101, contentValues0, "type", 4100638881487835957L), CLS27.MTH889("chatroom_invite") + ": " + this.FLD2832.FLD2541.MTH5316(s));
        contentValues0.put(CLS182.MTH3496(4100638984567051061L, contentValues0, s2, 4100639001746920245L), TextUtils.join(",", arrayList1));
        contentValues0.put("checked", Boolean.TRUE);
        this.FLD2831.add(contentValues0);
        this.FLD2833.MTH5235(this.FLD2831);
        this.FLD2833.MTH5231(contentValues0);
    }
}

