// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.AlertDialog;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.widget.Button;
import b.ʾᵢ.CLS27;

public final class CLS520 implements DialogInterface.OnShowListener {
    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        Button button0 = ((AlertDialog)dialogInterface0).getButton(-1);
        int v = CLS522.MTH7109();
        if(button0 != null) {
            try {
                button0.setTextColor(v);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

