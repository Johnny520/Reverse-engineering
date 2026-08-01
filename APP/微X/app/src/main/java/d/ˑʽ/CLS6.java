// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.AlertDialog;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.widget.Button;
import d.יʻ.CLS69;

public final class CLS6 implements DialogInterface.OnShowListener {
    public final boolean FLD38;

    public CLS6(boolean z) {
        this.FLD38 = z;
    }

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
        Button button1 = ((AlertDialog)dialogInterface0).getButton(-2);
        int v1 = CLS43.MTH646();
        if(button1 != null) {
            try {
                button1.setTextColor(v1);
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
            }
        }
        if(this.FLD38) {
            Button button2 = ((AlertDialog)dialogInterface0).getButton(-3);
            int v2 = CLS43.MTH646();
            if(button2 != null) {
                try {
                    button2.setTextColor(v2);
                }
                catch(Throwable throwable2) {
                    CLS69.MTH797(throwable2);
                }
            }
        }
    }
}

