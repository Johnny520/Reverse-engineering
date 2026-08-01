// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS123;

public final class CLS54 implements DialogInterface.OnDismissListener {
    public final CLS10 FLD283;

    public CLS54(CLS10 ʻﹶ0) {
        this.FLD283 = ʻﹶ0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        CLS123 ᐧי0 = this.FLD283.FLD43;
        if(ᐧי0 != null) {
            try {
                ᐧי0.MTH1174();
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }
}

