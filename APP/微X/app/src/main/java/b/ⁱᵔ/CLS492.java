// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;

public final class CLS492 implements DialogInterface.OnDismissListener {
    public final CLS380 FLD4840;

    public CLS492(CLS380 ʼˎ0) {
        this.FLD4840 = ʼˎ0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        CLS3 ˆٴ0 = this.FLD4840.FLD3519;
        if(ˆٴ0 != null) {
            try {
                ˆٴ0.MTH774();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

