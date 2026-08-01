// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;

public final class CLS377 implements View.OnClickListener {
    public final int FLD3511;
    public final CLS3 FLD3512;

    public CLS377(CLS3 ˆٴ0, int v) {
        this.FLD3511 = v;
        this.FLD3512 = ˆٴ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS3 ˆٴ0 = this.FLD3512;
        switch(this.FLD3511) {
            case 0: {
                if(ˆٴ0 != null) {
                    try {
                        ˆٴ0.MTH774();
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 1: {
                ˆٴ0.MTH774();
                return;
            }
            default: {
                ˆٴ0.MTH774();
            }
        }
    }
}

