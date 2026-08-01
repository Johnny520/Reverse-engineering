// Decompiled by JEB v5.42.0.202606242140

package c.ˆˆ;

import android.app.Activity;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class CLS71 implements MenuItem.OnMenuItemClickListener {
    public final Activity FLD402;
    public final CLS546 FLD403;
    public final String FLD404;

    public CLS71(CLS546 ᵔˊ$ˈⁱ0, Activity activity0, String s) {
        this.FLD403 = ᵔˊ$ˈⁱ0;
        this.FLD402 = activity0;
        this.FLD404 = s;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        return this.FLD403.MTH1442(this.FLD402, this.FLD404, menuItem0);
    }
}

