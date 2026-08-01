// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.AlertDialog;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.widget.Button;
import d.יʻ.CLS69;

public final class CLS26 implements DialogInterface.OnShowListener {
    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        Button button0 = ((AlertDialog)dialogInterface0).getButton(-1);
        int v = CLS43.MTH646();
        if(button0 != null) {
            try {
                button0.setTextColor(v);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }
}

