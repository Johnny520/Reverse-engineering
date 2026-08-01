// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import b.ʾᵢ.CLS40;

public final class CLS498 implements DialogInterface.OnCancelListener {
    public final int FLD4913;
    public final Object FLD4914;

    public CLS498(int v, Object object0) {
        this.FLD4913 = v;
        this.FLD4914 = object0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        Object object0 = this.FLD4914;
        switch(this.FLD4913) {
            case 0: {
                CLS40.FLD157.MTH1121().removeCallbacks(((Runnable)object0));
                return;
            }
            case 1: {
                CLS40.FLD157.MTH1121().removeCallbacks(((Runnable)object0));
                return;
            }
            default: {
                ((boolean[])object0)[0] = true;
            }
        }
    }
}

