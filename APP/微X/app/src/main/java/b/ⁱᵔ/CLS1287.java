// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Pair;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS82;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import java.util.ArrayList;

public final class CLS1287 implements CLS7, CLS17 {
    public final AlertDialog[] FLD3533;
    public final Activity FLD3534;
    public final ArrayList FLD3535;

    public CLS1287(Activity activity0, AlertDialog[] arr_alertDialog, ArrayList arrayList0) {
        this.FLD3534 = activity0;
        this.FLD3533 = arr_alertDialog;
        this.FLD3535 = arrayList0;
    }

    public CLS1287(AlertDialog[] arr_alertDialog, ArrayList arrayList0, Activity activity0) {
        this.FLD3533 = arr_alertDialog;
        this.FLD3535 = arrayList0;
        this.FLD3534 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS1625 ـˏ0 = new CLS1625(this.FLD3534);
        ـˏ0.MTH800(CLS27.MTH889("add_to_existing_voice_file"));
        ـˏ0.MTH7320(new CLS400(this.FLD3534, this.FLD3533, this.FLD3535));
        CLS1625 ـˏ1 = new CLS1625(this.FLD3534);
        ـˏ1.MTH800(CLS27.MTH889("new_voice_file"));
        ـˏ1.MTH7320(new CLS400(this.FLD3533, this.FLD3535, this.FLD3534));
        CLS1623 יᐧ0 = new CLS1623(this.FLD3534);
        CLS182.MTH3498(יᐧ0, new Object[]{ـˏ0, ـˏ1}, 10, linearLayout0, יᐧ0);
    }

    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        AlertDialog alertDialog0 = this.FLD3533[0];
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
        }
        for(Object object1: this.FLD3535) {
            CLS54.FLD172.MTH1247(((CLS82)object0), ((String)((Pair)object1).first), ((int)(((Integer)((Pair)object1).second))));
        }
        CLS476.MTH6647(this.FLD3534, ((CLS82)object0), null);
    }
}

