// Decompiled by JEB v5.42.0.202606242140

package c.ᵎʾ;

import android.app.Activity;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class CLS304 implements MenuItem.OnMenuItemClickListener {
    public final CLS663 FLD1432;
    public final Activity FLD1433;

    public CLS304(CLS663 ʻﾞ0, Activity activity0) {
        this.FLD1432 = ʻﾞ0;
        this.FLD1433 = activity0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        return this.FLD1432.MTH4106(this.FLD1433, menuItem0);
    }
}

