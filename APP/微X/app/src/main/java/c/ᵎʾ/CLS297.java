// Decompiled by JEB v5.42.0.202606242140

package c.ᵎʾ;

import android.app.Activity;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class CLS297 implements MenuItem.OnMenuItemClickListener {
    public final String FLD1358;
    public final CLS627 FLD1359;
    public final Activity FLD1360;

    public CLS297(CLS627 ʻﾞ$ˊﹶ0, Activity activity0, String s) {
        this.FLD1359 = ʻﾞ$ˊﹶ0;
        this.FLD1360 = activity0;
        this.FLD1358 = s;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        return this.FLD1359.MTH3808(this.FLD1360, this.FLD1358, menuItem0);
    }
}

