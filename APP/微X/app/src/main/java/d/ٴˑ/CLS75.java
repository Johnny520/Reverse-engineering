// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS123;

public final class CLS75 implements MenuItem.OnMenuItemClickListener {
    public final String FLD368;
    public final CLS91 FLD369;

    public CLS75(CLS91 ٴˆ0, String s) {
        this.FLD369 = ٴˆ0;
        this.FLD368 = s;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        this.FLD369.getClass();
        try {
            CLS123 ᐧי0 = (CLS123)this.FLD369.FLD492.get(this.FLD368);
            if(ᐧי0 != null) {
                ᐧי0.MTH1174();
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return true;
    }
}

