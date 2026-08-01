// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.AlertDialog;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.widget.Button;
import b.ʾᵢ.CLS27;

public final class CLS384 implements DialogInterface.OnShowListener {
    public final boolean FLD3582;

    public CLS384(boolean z) {
        this.FLD3582 = z;
    }

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
        Button button1 = ((AlertDialog)dialogInterface0).getButton(-2);
        int v1 = CLS522.MTH7109();
        if(button1 != null) {
            try {
                button1.setTextColor(v1);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        if(this.FLD3582) {
            Button button2 = ((AlertDialog)dialogInterface0).getButton(-3);
            int v2 = CLS522.MTH7109();
            if(button2 != null) {
                try {
                    button2.setTextColor(v2);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
            }
        }
    }
}

