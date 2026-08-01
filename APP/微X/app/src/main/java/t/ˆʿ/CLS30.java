// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS305;

public final class CLS30 implements DialogInterface.OnClickListener {
    public final int FLD441;
    public final CLS141 FLD442;

    public CLS30(CLS141 ʾᵢ0, int v) {
        this.FLD441 = v;
        this.FLD442 = ʾᵢ0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        CLS141 ʾᵢ0 = this.FLD442;
        switch(this.FLD441) {
            case 0: {
                try {
                    ʾᵢ0.MTH2166();
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    ʾᵢ0.MTH2165();
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
                return;
            }
            default: {
                try {
                    ((CLS305)ʾᵢ0).MTH2192();
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
    }
}

