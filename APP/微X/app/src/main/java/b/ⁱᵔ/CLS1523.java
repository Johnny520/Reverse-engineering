// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS21;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS1523 implements CLS11 {
    public final CLS359 FLD4674;

    public CLS1523(CLS359 ⁱˉ0) {
        this.FLD4674 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        ArrayList arrayList0 = this.FLD4674.MTH5234();
        if(arrayList0.isEmpty()) {
            return;
        }
        for(Object object0: arrayList0) {
            Object[] arr_object = {((ContentValues)object0).getAsLong("id")};
            CLS21.FLD76.MTH818("snsLikeDelayed", arr_object);
        }
    }
}

