// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʾᵢ.CLS21;

public final class CLS123 implements MenuItem.OnMenuItemClickListener {
    public final int FLD964;
    public final String FLD965;
    public final Pair FLD966;
    public final String FLD967;

    public CLS123(Pair pair0, String s, String s1, int v) {
        this.FLD964 = v;
        this.FLD966 = pair0;
        this.FLD965 = s;
        this.FLD967 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        String s = this.FLD967;
        String s1 = this.FLD965;
        Pair pair0 = this.FLD966;
        if(this.FLD964 == 0) {
            CLS21.FLD76.MTH819("b.contactinfoui.menu.config", new Object[]{pair0.second, s1, s});
            return true;
        }
        CLS21.FLD76.MTH819("b.singlechatinfoui.menu.config", new Object[]{pair0.second, s1, s});
        return true;
    }
}

