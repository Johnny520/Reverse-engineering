// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS563;

public final class CLS386 implements MenuItem.OnMenuItemClickListener {
    public final int FLD3592;
    public final CLS380 FLD3593;

    public CLS386(CLS380 ʼˎ0, int v) {
        this.FLD3592 = v;
        this.FLD3593 = ʼˎ0;
        super();
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        CLS380 ʼˎ0 = this.FLD3593;
        switch(this.FLD3592) {
            case 0: {
                ʼˎ0.dismiss();
                ((CLS563)ʼˎ0.FLD3517).MTH775();
                return true;
            }
            case 1: {
                ʼˎ0.FLD3519 = null;
                ʼˎ0.dismiss();
                ʼˎ0.FLD3517.MTH789();
                return true;
            }
            default: {
                ʼˎ0.FLD3519 = null;
                ʼˎ0.dismiss();
                ʼˎ0.FLD3517.MTH790();
                return true;
            }
        }
    }
}

