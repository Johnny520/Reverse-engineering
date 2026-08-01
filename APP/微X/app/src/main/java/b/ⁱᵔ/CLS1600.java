// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS1600 implements CLS11 {
    public final ArrayList FLD5061;
    public final CLS335 FLD5062;

    public CLS1600(CLS335 ˑٴ0, ArrayList arrayList0) {
        this.FLD5061 = arrayList0;
        this.FLD5062 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            ArrayList arrayList0 = this.FLD5061;
            String s = CLS27.MTH904();
            for(Object object0: arrayList0) {
                if(s.equals(((ContentValues)object0).getAsString("wxid"))) {
                    return;
                }
                if(false) {
                    break;
                }
            }
            String s1 = CLS21.FLD76.MTH826("getNickName", new Object[0]);
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("wxid", s);
            contentValues0.put("nickname", s1);
            contentValues0.put("desc", s + "<br>" + s1);
            arrayList0.add(contentValues0);
            this.FLD5062.MTH5111(arrayList0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

