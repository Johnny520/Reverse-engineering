// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS81;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1003 implements CLS7 {
    public final int FLD2052;
    public final ArrayList FLD2053;
    public final CLS244 FLD2054;
    public final CLS359 FLD2055;

    public CLS1003(CLS244 ᴵʻ0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD2052 = v;
        this.FLD2054 = ᴵʻ0;
        this.FLD2053 = arrayList0;
        this.FLD2055 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS359 ⁱˉ0 = this.FLD2055;
        ArrayList arrayList0 = this.FLD2053;
        CLS244 ᴵʻ0 = this.FLD2054;
        if(this.FLD2052 == 0) {
            ᴵʻ0.getClass();
            String s = CLS182.MTH3489(4100682844773077813L, new StringBuilder(), object0);
            CLS81 יᐧ0 = ᴵʻ0.FLD2557.MTH1199(((long)(((Long)object0))));
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put(CLS34.MTH1063(4100682870542881589L, contentValues0, -3, 4100682892017718069L), יᐧ0.FLD308);
            contentValues0.put("desc", "MP3: " + יᐧ0.FLD307);
            contentValues0.put(CLS182.MTH3496(4100682960737194805L, contentValues0, s, 4100682977917063989L), Boolean.TRUE);
            CLS182.MTH3477(arrayList0, contentValues0, ⁱˉ0, arrayList0, contentValues0);
            return;
        }
        ᴵʻ0.getClass();
        String s1 = CLS182.MTH3489(4100655769299243829L, new StringBuilder(), object0);
        CLS81 יᐧ1 = ᴵʻ0.FLD2557.MTH1199(((long)(((Long)object0))));
        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(CLS34.MTH1063(4100655795069047605L, contentValues1, -3, 4100655816543884085L), יᐧ1.FLD308);
        contentValues1.put("desc", "MP3: " + יᐧ1.FLD307);
        contentValues1.put(CLS182.MTH3496(4100656435019174709L, contentValues1, s1, 4100656452199043893L), Boolean.TRUE);
        CLS182.MTH3477(arrayList0, contentValues1, ⁱˉ0, arrayList0, contentValues1);
    }
}

