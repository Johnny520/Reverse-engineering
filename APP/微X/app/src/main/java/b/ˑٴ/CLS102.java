// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS565;
import b.ⁱᵔ.CLS523;
import java.util.LinkedHashMap;

public final class CLS102 implements MenuItem.OnMenuItemClickListener {
    public final int FLD509;
    public final String FLD510;
    public final LinkedHashMap FLD511;
    public final CLS139 FLD512;
    public final String FLD513;

    public CLS102(CLS139 ﹶʼ0, LinkedHashMap linkedHashMap0, String s, String s1, int v) {
        this.FLD509 = v;
        this.FLD512 = ﹶʼ0;
        this.FLD511 = linkedHashMap0;
        this.FLD513 = s;
        this.FLD510 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        LinkedHashMap linkedHashMap0 = this.FLD511;
        String s = this.FLD510;
        String s1 = this.FLD513;
        CLS139 ﹶʼ0 = this.FLD512;
        if(this.FLD509 == 0) {
            CLS523.MTH7159(ﹶʼ0.MTH3026(), CLS27.MTH889("appname"), linkedHashMap0, ((CLS7)new CLS565(9, s1, s)));
            return true;
        }
        CLS523.MTH7159(ﹶʼ0.MTH3026(), CLS27.MTH889("appname"), linkedHashMap0, ((CLS7)new CLS565(12, s1, s)));
        return true;
    }
}

