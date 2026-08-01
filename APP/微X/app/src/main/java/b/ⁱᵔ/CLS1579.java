// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ﾞˎ.CLS525;

public final class CLS1579 implements CLS17 {
    public final int FLD4940;
    public final CLS378 FLD4941;
    public final Activity FLD4942;
    public final CLS379 FLD4943;

    public CLS1579(Activity activity0, CLS378 ʼˎ$ˆٴ0, CLS379 ʼˎ$ᵔʾ0, int v) {
        this.FLD4940 = v;
        this.FLD4942 = activity0;
        this.FLD4941 = ʼˎ$ˆٴ0;
        this.FLD4943 = ʼˎ$ᵔʾ0;
        super();
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS379 ʼˎ$ᵔʾ0 = this.FLD4943;
        CLS378 ʼˎ$ˆٴ0 = this.FLD4941;
        Activity activity0 = this.FLD4942;
        if(this.FLD4940 == 0) {
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
            if(ʼˎ$ˆٴ0 != null) {
                ʼˎ$ˆٴ0.MTH5452(ʻˑ0);
                ʻˑ0.MTH7188();
            }
            if(ʼˎ$ᵔʾ0 != null) {
                ʼˎ$ᵔʾ0.MTH5453(linearLayout0);
            }
            return;
        }
        Menu menu1 = (Menu)arr_object[0];
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS525 ʻˑ1 = new CLS525(activity0, linearLayout1, menu1);
        if(ʼˎ$ˆٴ0 != null) {
            ʼˎ$ˆٴ0.MTH5452(ʻˑ1);
            ʻˑ1.MTH7188();
        }
        if(ʼˎ$ᵔʾ0 != null) {
            ʼˎ$ᵔʾ0.MTH5453(linearLayout1);
        }
    }
}

