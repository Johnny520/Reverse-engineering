// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS1593 implements CLS3 {
    public final int FLD5017;
    public final String FLD5018;
    public final ArrayList FLD5019;
    public final CLS335 FLD5020;

    public CLS1593(CLS335 ˑٴ0, String s, ArrayList arrayList0) {
        this.FLD5017 = 1;
        super();
        this.FLD5019 = arrayList0;
        this.FLD5018 = s;
        this.FLD5020 = ˑٴ0;
    }

    public CLS1593(String s, ArrayList arrayList0, CLS335 ˑٴ0, int v) {
        this.FLD5017 = v;
        this.FLD5018 = s;
        this.FLD5019 = arrayList0;
        this.FLD5020 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS335 ˑٴ0 = this.FLD5020;
        ArrayList arrayList0 = this.FLD5019;
        String s = this.FLD5018;
        switch(this.FLD5017) {
            case 0: {
                try {
                    String s1 = CLS371.FLD3470.MTH5343(s);
                    Collections.sort(arrayList0, new CLS497(CLS66.MTH1505(s), s1));
                    ˑٴ0.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                arrayList0.clear();
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("web_vid", s);
                contentValues1.put("url", s);
                CLS182.MTH3478(0x38EA80A22B3CD335L, new StringBuilder(), 4101231879032460085L, s, contentValues1, "desc");
                arrayList0.add(contentValues1);
                ˑٴ0.MTH5112();
                return;
            }
            default: {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("web_img", s);
                contentValues0.put("url", s);
                CLS182.MTH3478(4101231964931806005L, new StringBuilder(), 4101232549047358261L, s, contentValues0, "desc");
                arrayList0.add(contentValues0);
                ˑٴ0.MTH5112();
            }
        }
    }
}

