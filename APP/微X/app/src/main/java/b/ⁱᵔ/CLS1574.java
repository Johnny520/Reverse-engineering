// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;

public final class CLS1574 implements CLS8 {
    public final ArrayList FLD4930;
    public final CLS335 FLD4931;

    public CLS1574(CLS335 ˑٴ0, ArrayList arrayList0) {
        this.FLD4930 = arrayList0;
        this.FLD4931 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
            for(Object object1: ((ArrayList)object0)) {
                ArrayList arrayList0 = this.FLD4930;
                if(arrayList0.size() >= 9) {
                    break;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("img", ((String)object1));
                contentValues0.put("desc", ((String)object1));
                arrayList0.add(contentValues0);
            }
            this.FLD4931.MTH5112();
        }
    }
}

