// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import android.view.View.OnLongClickListener;
import android.view.View;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

public final class CLS135 implements View.OnLongClickListener {
    public final int FLD1291;
    public final CLS770 FLD1292;

    public CLS135(CLS770 ٴʿ0, int v) {
        this.FLD1291 = v;
        this.FLD1292 = ٴʿ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        CLS770 ٴʿ0 = this.FLD1292;
        if(this.FLD1291 == 0) {
            ٴʿ0.MTH2583(null);
            return true;
        }
        String s = ٴʿ0.FLD1447.FLD1434;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ArrayList arrayList0 = CLS21.FLD76.MTH832("specialModes.options", new Object[0]);
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            hashSet0.add(((String)((Pair)object0).second));
            linkedHashMap0.put(((String)((Pair)object0).first), ((Pair)object0).second);
        }
        ArrayList arrayList1 = CLS21.FLD76.MTH832("chattingui.optionsmenu.options", new Object[]{s});
        HashSet hashSet1 = new HashSet();
        for(Object object1: arrayList1) {
            hashSet1.add(((String)((Pair)object1).second));
            linkedHashMap0.put(((String)((Pair)object1).first), ((Pair)object1).second);
        }
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        if(CLS426.MTH6126(s)) {
            for(Object object2: CLS21.FLD76.MTH832("b.chatroominfoui.menu.options", new Object[]{s})) {
                hashSet2.add(((String)((Pair)object2).second));
                linkedHashMap0.put(((String)((Pair)object2).first), ((Pair)object2).second);
            }
        }
        else {
            for(Object object3: CLS21.FLD76.MTH832("b.contactinfoui.menu.options", new Object[]{s})) {
                hashSet3.add(((String)((Pair)object3).second));
                linkedHashMap0.put(((String)((Pair)object3).first), ((Pair)object3).second);
            }
        }
        CLS523.MTH7159(((CLS140)ٴʿ0).MTH3042(), CLS371.FLD3470.MTH5316(s), linkedHashMap0, ((CLS7)new CLS766(hashSet0, hashSet1, s, hashSet2, hashSet3, 2, 0)));
        return true;
    }
}

