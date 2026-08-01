// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ⁱʾ.CLS338;

public final class CLS499 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD4918;
    public final CLS338 FLD4919;

    public CLS499(CLS338 יᐧ0, int v) {
        this.FLD4918 = v;
        this.FLD4919 = יᐧ0;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS338 יᐧ0 = this.FLD4919;
        if(this.FLD4918 == 0) {
            if(z) {
                יᐧ0.MTH5124();
                return;
            }
            יᐧ0.MTH5130();
            return;
        }
        if(z) {
            יᐧ0.MTH5124();
            return;
        }
        יᐧ0.MTH5130();
    }
}

