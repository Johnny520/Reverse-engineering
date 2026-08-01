// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Pair;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS7;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS82;
import java.util.ArrayList;

public final class CLS400 implements View.OnClickListener {
    public final int FLD3821;
    public final ArrayList FLD3822;
    public final AlertDialog[] FLD3823;
    public final Activity FLD3824;

    public CLS400(Activity activity0, AlertDialog[] arr_alertDialog, ArrayList arrayList0) {
        this.FLD3821 = 0;
        super();
        this.FLD3824 = activity0;
        this.FLD3823 = arr_alertDialog;
        this.FLD3822 = arrayList0;
    }

    public CLS400(AlertDialog[] arr_alertDialog, ArrayList arrayList0, Activity activity0) {
        this.FLD3821 = 1;
        super();
        this.FLD3823 = arr_alertDialog;
        this.FLD3822 = arrayList0;
        this.FLD3824 = activity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD3824;
        ArrayList arrayList0 = this.FLD3822;
        AlertDialog[] arr_alertDialog = this.FLD3823;
        if(this.FLD3821 == 0) {
            CLS476.MTH6640(activity0, ((CLS7)new CLS1287(arr_alertDialog, arrayList0, activity0)));
            return;
        }
        AlertDialog alertDialog0 = arr_alertDialog[0];
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
        }
        CLS82 יﹳ0 = new CLS82();
        for(Object object0: arrayList0) {
            CLS54.FLD172.MTH1247(יﹳ0, ((String)((Pair)object0).first), ((int)(((Integer)((Pair)object0).second))));
        }
        CLS476.MTH6647(activity0, יﹳ0, null);
    }
}

