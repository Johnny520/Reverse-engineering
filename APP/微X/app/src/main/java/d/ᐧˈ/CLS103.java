// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.view.View.OnClickListener;
import android.view.View;

public final class CLS103 implements View.OnClickListener {
    public final CLS194 FLD593;
    public final int FLD594;

    public CLS103(CLS194 ʼˎ0, int v) {
        this.FLD594 = v;
        this.FLD593 = ʼˎ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS194 ʼˎ0 = this.FLD593;
        if(this.FLD594 == 0) {
            ʼˎ0.MTH1039();
            return;
        }
        ʼˎ0.MTH1042();
    }
}

