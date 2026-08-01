// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;

public final class CLS39 implements DialogInterface.OnDismissListener {
    public final CLS55 FLD487;

    public CLS39(CLS55 ⁱˉ0) {
        this.FLD487 = ⁱˉ0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        CLS143 ˆٴ0 = this.FLD487.FLD515;
        if(ˆٴ0 != null) {
            try {
                ˆٴ0.MTH2169();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }
}

