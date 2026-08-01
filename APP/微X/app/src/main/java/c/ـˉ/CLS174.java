// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.AlertDialog;
import android.view.View.OnClickListener;
import android.view.View;
import c.ˋﹳ.CLS111;

public final class CLS174 implements View.OnClickListener {
    public final AlertDialog[] FLD851;
    public final String FLD852;
    public final CLS111 FLD853;

    public CLS174(String s, AlertDialog[] arr_alertDialog, CLS111 ᴵⁱ0) {
        this.FLD852 = s;
        this.FLD851 = arr_alertDialog;
        this.FLD853 = ᴵⁱ0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS232.MTH3544(this.FLD852, this.FLD851, this.FLD853, view0);
    }
}

