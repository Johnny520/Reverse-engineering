// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;

public final class CLS182 implements MenuItem.OnMenuItemClickListener {
    public final CLS168 FLD1311;
    public final String FLD1312;

    public CLS182(CLS168 ˑٴ0, String s) {
        this.FLD1311 = ˑٴ0;
        this.FLD1312 = s;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        this.FLD1311.getClass();
        try {
            CLS143 ˆٴ0 = (CLS143)this.FLD1311.FLD1179.get(this.FLD1312);
            if(ˆٴ0 != null) {
                ˆٴ0.MTH2169();
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return true;
    }
}

