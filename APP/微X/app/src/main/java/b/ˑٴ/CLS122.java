// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import android.view.View.OnLongClickListener;
import android.view.View;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1258;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class CLS122 implements View.OnLongClickListener {
    public final CLS139 FLD915;
    public final String FLD916;

    public CLS122(CLS139 ﹶʼ0, String s) {
        this.FLD915 = ﹶʼ0;
        this.FLD916 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        CLS139 ﹶʼ0 = this.FLD915;
        ﹶʼ0.getClass();
        Object[] arr_object = new Object[1];
        String s = this.FLD916;
        arr_object[0] = s;
        ArrayList arrayList0 = CLS21.FLD76.MTH832("b.chatroominfoui.menu.options", arr_object);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: arrayList0) {
            linkedHashMap0.put(((String)((Pair)object0).first), ((Pair)object0).second);
        }
        CLS523.MTH7159(ﹶʼ0.MTH3026(), CLS27.MTH889("appname"), linkedHashMap0, ((CLS7)new CLS1258(9, s)));
        return true;
    }
}

