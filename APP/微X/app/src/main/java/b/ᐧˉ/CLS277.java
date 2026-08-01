// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ⁱᵔ.CLS485;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;

public final class CLS277 implements View.OnClickListener {
    public final int FLD2880;
    public final CLS1635 FLD2881;
    public final Activity FLD2882;
    public final CLS1105 FLD2883;
    public final CLS1635 FLD2884;
    public final CLS1626 FLD2885;

    public CLS277(CLS1105 ᐧˈ0, Activity activity0, CLS1626 ـﹳ0, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1) {
        this.FLD2880 = 0;
        super();
        this.FLD2883 = ᐧˈ0;
        this.FLD2882 = activity0;
        this.FLD2885 = ـﹳ0;
        this.FLD2884 = ﾞᵎ0;
        this.FLD2881 = ﾞᵎ1;
    }

    public CLS277(CLS1105 ᐧˈ0, Activity activity0, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1626 ـﹳ0, int v) {
        this.FLD2880 = v;
        this.FLD2883 = ᐧˈ0;
        this.FLD2882 = activity0;
        this.FLD2884 = ﾞᵎ0;
        this.FLD2881 = ﾞᵎ1;
        this.FLD2885 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1635 ﾞᵎ0 = this.FLD2881;
        CLS1635 ﾞᵎ1 = this.FLD2884;
        CLS1626 ـﹳ0 = this.FLD2885;
        Activity activity0 = this.FLD2882;
        CLS1105 ᐧˈ0 = this.FLD2883;
        switch(this.FLD2880) {
            case 0: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2414.getClass();
                CLS485.MTH6716(activity0, "wx_rpamount_");
                ـﹳ0.MTH801(0);
                ﾞᵎ1.MTH801(0);
                ﾞᵎ0.MTH801(0);
                return;
            }
            case 1: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2414.getClass();
                CLS485.MTH6716(activity0, "wx_transfer_money_");
                ﾞᵎ1.MTH801(0);
                ﾞᵎ0.MTH801(0);
                ـﹳ0.MTH801(0);
                return;
            }
            default: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2414.getClass();
                CLS485.MTH6716(activity0, "wx_red_packet_notif_only_");
                ﾞᵎ1.MTH801(0);
                ﾞᵎ0.MTH801(0);
                ـﹳ0.MTH801(0);
            }
        }
    }
}

