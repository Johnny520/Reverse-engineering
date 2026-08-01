// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʾᵢ.CLS21;

public final class CLS114 implements MenuItem.OnMenuItemClickListener {
    public final int FLD773;
    public final String FLD774;
    public final Pair FLD775;

    public CLS114(Pair pair0, String s, int v) {
        this.FLD773 = v;
        this.FLD775 = pair0;
        this.FLD774 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        String s = this.FLD774;
        Pair pair0 = this.FLD775;
        if(this.FLD773 == 0) {
            CLS21.FLD76.MTH819("chattingui.optionsmenu.config", new Object[]{pair0.second, s});
            return true;
        }
        CLS21.FLD76.MTH819("b.chatroominfoui.menu.config", new Object[]{pair0.second, s});
        return true;
    }
}

