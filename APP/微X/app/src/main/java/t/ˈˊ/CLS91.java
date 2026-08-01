// Decompiled by JEB v5.42.0.202606242140

package t.ˈˊ;

import android.view.View;
import t.ᵔʾ.CLS297;

public final class CLS91 implements Runnable {
    public final int FLD709;
    public final CLS88 FLD710;

    public CLS91(CLS88 ˊﾞ0, int v) {
        this.FLD709 = v;
        this.FLD710 = ˊﾞ0;
        super();
    }

    @Override
    public final void run() {
        CLS88 ˊﾞ0 = this.FLD710;
        if(this.FLD709 == 0) {
            ˊﾞ0.FLD658 = false;
            CLS87 ˊﾞ$ˆٴ0 = ˊﾞ0.FLD678;
            if(ˊﾞ$ˆٴ0 != null) {
                ((View)((CLS297)ˊﾞ$ˆٴ0).FLD915).setVisibility(8);
            }
            return;
        }
        ˊﾞ0.FLD658 = true;
        CLS87 ˊﾞ$ˆٴ1 = ˊﾞ0.FLD678;
        if(ˊﾞ$ˆٴ1 != null) {
            ((View)((CLS297)ˊﾞ$ˆٴ1).FLD915).setVisibility(0);
        }
    }
}

