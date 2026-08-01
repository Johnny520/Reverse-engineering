// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS326;

public final class CLS495 implements AdapterView.OnItemClickListener {
    public final int FLD4893;
    public final CLS7 FLD4894;
    public final AlertDialog[] FLD4895;
    public final CLS326 FLD4896;

    public CLS495(AlertDialog[] arr_alertDialog, CLS7 יᐧ0, CLS326 ˉᐧ0, int v) {
        this.FLD4893 = v;
        this.FLD4895 = arr_alertDialog;
        this.FLD4894 = יᐧ0;
        this.FLD4896 = ˉᐧ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS7 יᐧ0 = this.FLD4894;
        CLS326 ˉᐧ0 = this.FLD4896;
        AlertDialog[] arr_alertDialog = this.FLD4895;
        if(this.FLD4893 == 0) {
            try {
                AlertDialog alertDialog0 = arr_alertDialog[0];
                if(alertDialog0 != null) {
                    alertDialog0.dismiss();
                }
                if(יᐧ0 != null) {
                    יᐧ0.MTH784(ˉᐧ0.getItem(v));
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            AlertDialog alertDialog1 = arr_alertDialog[0];
            if(alertDialog1 != null) {
                alertDialog1.dismiss();
            }
            if(יᐧ0 != null) {
                יᐧ0.MTH784(ˉᐧ0.getItem(v));
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

