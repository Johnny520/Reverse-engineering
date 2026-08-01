// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import t.ⁱʾ.CLS305;

public final class CLS51 implements MenuItem.OnMenuItemClickListener {
    public final int FLD509;
    public final CLS55 FLD510;

    public CLS51(CLS55 ⁱˉ0, int v) {
        this.FLD509 = v;
        this.FLD510 = ⁱˉ0;
        super();
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        CLS55 ⁱˉ0 = this.FLD510;
        switch(this.FLD509) {
            case 0: {
                ⁱˉ0.dismiss();
                ((CLS305)ⁱˉ0.FLD513).MTH2192();
                return true;
            }
            case 1: {
                ⁱˉ0.FLD515 = null;
                ⁱˉ0.dismiss();
                ⁱˉ0.FLD513.MTH2165();
                return true;
            }
            default: {
                ⁱˉ0.FLD515 = null;
                ⁱˉ0.dismiss();
                ⁱˉ0.FLD513.MTH2166();
                return true;
            }
        }
    }
}

