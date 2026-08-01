// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS71;
import b.ᵔʾ.CLS1225;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class CLS134 implements MenuItem.OnMenuItemClickListener {
    public final int FLD1280;
    public final Object FLD1281;

    public CLS134(int v, Object object0) {
        this.FLD1280 = v;
        this.FLD1281 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        Object object0 = this.FLD1281;
        switch(this.FLD1280) {
            case 0: {
                ((CLS71)object0).MTH1573();
                return true;
            }
            case 1: {
                ((CLS12)object0).MTH791(0);
                return true;
            }
            case 2: {
                CLS21.FLD76.MTH819("snstimelineui.optionsmenu.config", new Object[]{((Pair)object0).second});
                return true;
            }
            case 3: {
                CLS21.FLD76.MTH819("plus.config", new Object[]{((String)object0)});
                return true;
            }
            default: {
                ((CLS139)object0).getClass();
                ArrayList arrayList0 = CLS21.FLD76.MTH832("specialModes.options", new Object[0]);
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object1: arrayList0) {
                    linkedHashMap0.put(((String)((Pair)object1).first), ((Pair)object1).second);
                }
                CLS523.MTH7159(((CLS139)object0).MTH3026(), CLS27.MTH889("specialModes"), linkedHashMap0, ((CLS7)new CLS1225(15)));
                return true;
            }
        }
    }
}

