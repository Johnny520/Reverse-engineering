// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import android.view.View.OnLongClickListener;
import android.view.View;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS565;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class CLS111 implements View.OnLongClickListener {
    public final int FLD705;
    public final String FLD706;
    public final CLS139 FLD707;
    public final String FLD708;

    public CLS111(CLS139 ﹶʼ0, String s, String s1, int v) {
        this.FLD705 = v;
        this.FLD707 = ﹶʼ0;
        this.FLD706 = s;
        this.FLD708 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        String s = this.FLD708;
        String s1 = this.FLD706;
        CLS139 ﹶʼ0 = this.FLD707;
        if(this.FLD705 == 0) {
            ﹶʼ0.getClass();
            ArrayList arrayList0 = CLS21.FLD76.MTH832("b.contactinfoui.menu.options", new Object[]{s1});
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object0: arrayList0) {
                linkedHashMap0.put(((String)((Pair)object0).first), ((Pair)object0).second);
            }
            CLS523.MTH7159(ﹶʼ0.MTH3026(), CLS27.MTH889("appname"), linkedHashMap0, ((CLS7)new CLS565(10, s1, s)));
            return true;
        }
        ﹶʼ0.getClass();
        ArrayList arrayList1 = CLS21.FLD76.MTH832("b.singlechatinfoui.menu.options", new Object[]{s1});
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object1: arrayList1) {
            linkedHashMap1.put(((String)((Pair)object1).first), ((Pair)object1).second);
        }
        CLS523.MTH7159(ﹶʼ0.MTH3026(), CLS27.MTH889("appname"), linkedHashMap1, ((CLS7)new CLS565(11, s1, s)));
        return true;
    }
}

