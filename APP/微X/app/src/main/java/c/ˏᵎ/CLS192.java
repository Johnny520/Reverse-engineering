// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.AlertDialog;
import android.view.View.OnClickListener;
import android.view.View;
import c.ﹶˆ.CLS343;

public final class CLS192 implements View.OnClickListener {
    public final CLS343 FLD793;
    public final String FLD794;
    public final AlertDialog[] FLD795;

    public CLS192(String s, AlertDialog[] arr_alertDialog, CLS343 ˋʼ0) {
        this.FLD794 = s;
        this.FLD795 = arr_alertDialog;
        this.FLD793 = ˋʼ0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS138.MTH2082(this.FLD794, this.FLD795, this.FLD793, view0);
    }
}

