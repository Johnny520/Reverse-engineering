// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS126;
import d.ⁱٴ.CLS211;

public final class CLS11 implements DialogInterface.OnClickListener {
    public final CLS126 FLD53;
    public final int FLD54;

    public CLS11(CLS126 ⁱﾞ0, int v) {
        this.FLD54 = v;
        this.FLD53 = ⁱﾞ0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        CLS126 ⁱﾞ0 = this.FLD53;
        switch(this.FLD54) {
            case 0: {
                try {
                    ⁱﾞ0.MTH1183();
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    ⁱﾞ0.MTH1184();
                }
                catch(Throwable throwable2) {
                    CLS69.MTH797(throwable2);
                }
                return;
            }
            default: {
                try {
                    ((CLS211)ⁱﾞ0).MTH1172();
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
        }
    }
}

