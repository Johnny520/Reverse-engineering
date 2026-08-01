// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS563;
import b.ʾᵢ.CLS27;

public final class CLS419 implements DialogInterface.OnClickListener {
    public final int FLD4050;
    public final CLS11 FLD4051;

    public CLS419(CLS11 ᐧⁱ0, int v) {
        this.FLD4050 = v;
        this.FLD4051 = ᐧⁱ0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        CLS11 ᐧⁱ0 = this.FLD4051;
        switch(this.FLD4050) {
            case 0: {
                try {
                    ᐧⁱ0.MTH790();
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    ᐧⁱ0.MTH789();
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                try {
                    ((CLS563)ᐧⁱ0).MTH775();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

