// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;

public final class CLS1154 implements CLS8 {
    public final ArrayList FLD2638;
    public final CLS244 FLD2639;
    public final CLS359 FLD2640;

    public CLS1154(CLS244 ᴵʻ0, ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2639 = ᴵʻ0;
        this.FLD2638 = arrayList0;
        this.FLD2640 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        String s2;
        try {
            CLS359 ⁱˉ0 = this.FLD2640;
            ArrayList arrayList0 = this.FLD2638;
            CLS244 ᴵʻ0 = this.FLD2639;
            String s = (String)object0;
            if(CLS502.MTH6934(s, new String[]{"com.android.providers.media.photopicker"})) {
                String s1 = ᴵʻ0.FLD2550.MTH1255(s);
                s2 = "#img " + s1;
                s = ᴵʻ0.FLD2550.MTH1254(s1);
            }
            else {
                s2 = "#pic " + s;
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("img", s);
            contentValues0.put("type", -2);
            contentValues0.put("desc", CLS27.MTH889("image"));
            contentValues0.put("msg", s2);
            contentValues0.put("checked", Boolean.TRUE);
            arrayList0.add(contentValues0);
            ⁱˉ0.MTH5235(arrayList0);
            ⁱˉ0.MTH5231(contentValues0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

