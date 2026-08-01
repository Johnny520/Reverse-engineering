// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ﾞˎ.CLS1626;

public final class CLS194 implements View.OnClickListener {
    public final int FLD1861;
    public final CLS1626 FLD1862;
    public final CLS1105 FLD1863;

    public CLS194(CLS1105 ᐧˈ0, CLS1626 ـﹳ0, int v) {
        this.FLD1861 = v;
        this.FLD1863 = ᐧˈ0;
        this.FLD1862 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1626 ـﹳ0 = this.FLD1862;
        CLS1105 ᐧˈ0 = this.FLD1863;
        switch(this.FLD1861) {
            case 0: {
                ᐧˈ0.FLD2415 = ـﹳ0;
                ᐧˈ0.FLD2416 = "rpamount_";
                ᐧˈ0.MTH4175();
                return;
            }
            case 1: {
                ᐧˈ0.FLD2415 = ـﹳ0;
                ᐧˈ0.FLD2416 = "transfer_money_";
                ᐧˈ0.MTH4175();
                return;
            }
            default: {
                ᐧˈ0.FLD2415 = ـﹳ0;
                ᐧˈ0.FLD2416 = "red_packet_notif_only_";
                ᐧˈ0.MTH4175();
            }
        }
    }
}

