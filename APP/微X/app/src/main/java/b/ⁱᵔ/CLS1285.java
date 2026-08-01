// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS21;
import java.util.ArrayList;
import java.util.Arrays;

public final class CLS1285 implements CLS11 {
    public final ArrayList FLD3528;

    public CLS1285(ArrayList arrayList0) {
        this.FLD3528 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        for(Object object0: this.FLD3528) {
            String s = ((ContentValues)object0).getAsString("wxid");
            ArrayList arrayList0 = new ArrayList(Arrays.asList(CLS502.MTH6941(((ContentValues)object0).getAsString("chatrooms"))));
            for(int v = 1; v < arrayList0.size(); ++v) {
                Object[] arr_object = {arrayList0.get(v), s, null, null, Boolean.TRUE};
                CLS21.FLD76.MTH818("bandialog_ban", arr_object);
            }
        }
    }
}

