// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS12;

public final class CLS136 implements MenuItem.OnMenuItemClickListener {
    public final int FLD1308;
    public final String FLD1309;
    public final CLS12 FLD1310;

    public CLS136(int v, CLS12 ᵔʾ0, String s) {
        this.FLD1308 = v;
        this.FLD1310 = ᵔʾ0;
        this.FLD1309 = s;
        super();
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        String s = this.FLD1309;
        CLS12 ᵔʾ0 = this.FLD1310;
        if(this.FLD1308 == 0) {
            ᵔʾ0.MTH791(s);
            return true;
        }
        ᵔʾ0.MTH791(s);
        return true;
    }
}

