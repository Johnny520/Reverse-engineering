// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ᐧˉ.CLS1043;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1624;

public final class CLS1387 implements CLS17 {
    public final int FLD3925;
    public final CLS369 FLD3926;
    public final Activity FLD3927;
    public final String[] FLD3928;

    public CLS1387(Activity activity0, CLS369 ﾞᵎ0, String[] arr_s, int v) {
        this.FLD3925 = v;
        this.FLD3927 = activity0;
        this.FLD3926 = ﾞᵎ0;
        this.FLD3928 = arr_s;
        super();
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        String[] arr_s = this.FLD3928;
        CLS369 ﾞᵎ0 = this.FLD3926;
        Activity activity0 = this.FLD3927;
        switch(this.FLD3925) {
            case 0: {
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS1624 יﹳ1 = new CLS1624(activity0);
                יﹳ1.FLD5274 = new CLS1043(ﾞᵎ0, 13);
                יﹳ1.MTH7311();
                יﹳ1.MTH7302();
                יﹳ1.MTH7303(ﾞᵎ0);
                יﹳ1.MTH7301(new CLS457(ﾞᵎ0, arr_s, 3));
                CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ1), true);
                return;
            }
            case 1: {
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS1624 יﹳ2 = new CLS1624(activity0);
                יﹳ2.FLD5274 = new CLS1043(ﾞᵎ0, 12);
                יﹳ2.MTH7311();
                יﹳ2.MTH7302();
                יﹳ2.MTH7303(ﾞᵎ0);
                יﹳ2.MTH7301(new CLS457(ﾞᵎ0, arr_s, 2));
                CLS523.MTH7147(linearLayout2, ((CLS18)יﹳ2), true);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS1624 יﹳ0 = new CLS1624(activity0);
                יﹳ0.FLD5274 = new CLS1043(ﾞᵎ0, 17);
                יﹳ0.MTH7311();
                יﹳ0.MTH7302();
                יﹳ0.MTH7303(ﾞᵎ0);
                יﹳ0.MTH7301(new CLS457(ﾞᵎ0, arr_s, 4));
                CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
            }
        }
    }
}

