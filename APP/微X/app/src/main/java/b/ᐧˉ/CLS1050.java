// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;

public final class CLS1050 implements CLS8 {
    public final ArrayList FLD2243;
    public final CLS210 FLD2244;
    public final CLS359 FLD2245;

    public CLS1050(CLS210 ˋʼ0, ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD2244 = ˋʼ0;
        this.FLD2243 = arrayList0;
        this.FLD2245 = ⁱˉ0;
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
            CLS359 ⁱˉ0 = this.FLD2245;
            ArrayList arrayList0 = this.FLD2243;
            CLS210 ˋʼ0 = this.FLD2244;
            for(Object object1: ((ArrayList)object0)) {
                String s = (String)object1;
                if(CLS502.MTH6934(s, new String[]{"com.android.providers.media.photopicker"})) {
                    String s1 = ˋʼ0.FLD2002.MTH1255(s);
                    s2 = "#img " + s1;
                    s = ˋʼ0.FLD2002.MTH1254(s1);
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
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

