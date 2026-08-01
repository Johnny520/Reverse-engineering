// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.AlertDialog;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.widget.Button;
import t.ᵔʾ.CLS133;

public final class CLS45 implements DialogInterface.OnShowListener {
    public final boolean FLD495;

    public CLS45(boolean z) {
        this.FLD495 = z;
    }

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
        Button button1 = ((AlertDialog)dialogInterface0).getButton(-2);
        int v1 = CLS46.MTH1452();
        if(button1 != null) {
            try {
                button1.setTextColor(v1);
            }
            catch(Throwable throwable1) {
                CLS133.MTH2113(throwable1);
            }
        }
        if(this.FLD495) {
            Button button2 = ((AlertDialog)dialogInterface0).getButton(-3);
            int v2 = CLS46.MTH1452();
            if(button2 != null) {
                try {
                    button2.setTextColor(v2);
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
            }
        }
    }
}

