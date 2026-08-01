// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;

public final class CLS272 implements View.OnClickListener {
    public final int FLD2828;
    public final CLS78 FLD2829;
    public final CLS1019 FLD2830;

    public CLS272(CLS1019 ˎʻ0, CLS78 ˊﾞ0, int v) {
        this.FLD2828 = v;
        this.FLD2830 = ˎʻ0;
        this.FLD2829 = ˊﾞ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1019 ˎʻ0 = this.FLD2830;
        CLS78 ˊﾞ0 = this.FLD2829;
        switch(this.FLD2828) {
            case 0: {
                ˎʻ0.getClass();
                try {
                    ˎʻ0.MTH3825(ˊﾞ0, 0);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                ˎʻ0.getClass();
                try {
                    ˎʻ0.MTH3825(ˊﾞ0, 6);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 2: {
                ˎʻ0.getClass();
                try {
                    ˎʻ0.MTH3825(ˊﾞ0, 1);
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            default: {
                ˎʻ0.getClass();
                try {
                    ˎʻ0.MTH3825(ˊﾞ0, 2);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

