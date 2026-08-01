// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS34;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1432 implements CLS7 {
    public final int FLD4231;
    public final ArrayList FLD4232;
    public final CLS47 FLD4233;
    public final CLS359 FLD4234;

    public CLS1432(CLS47 ˈˊ0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD4231 = v;
        this.FLD4233 = ˈˊ0;
        this.FLD4232 = arrayList0;
        this.FLD4234 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS359 ⁱˉ0 = this.FLD4234;
        ArrayList arrayList0 = this.FLD4232;
        CLS47 ˈˊ0 = this.FLD4233;
        if(this.FLD4231 == 0) {
            CLS81 יᐧ0 = ˈˊ0.MTH1199(((long)(((Long)object0))));
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put(CLS34.MTH1063(4100838434258342709L, contentValues0, -3, 4100838455733179189L), יᐧ0.FLD308);
            contentValues0.put("desc", "MP3: " + יᐧ0.FLD307);
            CLS182.MTH3477(arrayList0, contentValues0, ⁱˉ0, arrayList0, contentValues0);
            return;
        }
        CLS81 יᐧ1 = ˈˊ0.MTH1199(((long)(((Long)object0))));
        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(CLS34.MTH1063(4100857083006341941L, contentValues1, -3, 4100857104481178421L), יᐧ1.FLD308);
        contentValues1.put("desc", "MP3: " + יᐧ1.FLD307);
        CLS182.MTH3477(arrayList0, contentValues1, ⁱˉ0, arrayList0, contentValues1);
    }
}

