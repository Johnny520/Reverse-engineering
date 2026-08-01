// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.AlertDialog;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.widget.Button;
import t.ᵔʾ.CLS133;

public final class CLS58 implements DialogInterface.OnShowListener {
    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        Button button0 = ((AlertDialog)dialogInterface0).getButton(-1);
        int v = CLS46.MTH1452();
        if(button0 != null) {
            try {
                button0.setTextColor(v);
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }
}

