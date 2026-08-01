// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS568;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS485;

public final class CLS238 implements View.OnClickListener {
    public final int FLD2352;
    public final Activity FLD2353;
    public final CLS1105 FLD2354;

    public CLS238(CLS1105 ᐧˈ0, Activity activity0, int v) {
        this.FLD2352 = v;
        this.FLD2354 = ᐧˈ0;
        this.FLD2353 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2353;
        CLS1105 ᐧˈ0 = this.FLD2354;
        switch(this.FLD2352) {
            case 0: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2414.getClass();
                CLS485.MTH6721(activity0, "wx_rpamount_");
                return;
            }
            case 1: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2414.getClass();
                CLS485.MTH6721(activity0, "wx_transfer_money_");
                return;
            }
            case 2: {
                ᐧˈ0.getClass();
                String s1 = ᐧˈ0.FLD2151.MTH925("confirm_transfer_specific", "");
                CLS1203 ﹶˎ0 = new CLS1203(ᐧˈ0);
                CLS387.MTH5585(true, activity0, ᐧˈ0.FLD2419, ((CLS2)ﹶˎ0), s1, -1);
                return;
            }
            case 3: {
                ᐧˈ0.getClass();
                String s2 = ᐧˈ0.FLD2151.MTH925("confirm_transfer_exclude", "");
                CLS1042 ˑʻ0 = new CLS1042(ᐧˈ0);
                CLS387.MTH5585(true, activity0, ᐧˈ0.FLD2419, ((CLS2)ˑʻ0), s2, -1);
                return;
            }
            case 4: {
                ᐧˈ0.getClass();
                ᐧˈ0.FLD2414.getClass();
                CLS485.MTH6721(activity0, "wx_red_packet_notif_only_");
                return;
            }
            case 5: {
                ᐧˈ0.getClass();
                new String("WxRpCustomTempl_");
                CLS403.MTH5865(activity0, CLS27.MTH889("createTemplate"), "WxRpCustomTemplates", "WxRpCustomTempl_", ((CLS12)new CLS568(((CLS219)ᐧˈ0), activity0, 8)));
                return;
            }
            default: {
                CLS1185 ⁱᵎ0 = new CLS1185(ᐧˈ0);
                String s = ᐧˈ0.FLD2151.MTH925("rp_custom_list", "");
                CLS387.MTH5590(activity0, ᐧˈ0.FLD2419, ((CLS2)ⁱᵎ0), s, null);
            }
        }
    }
}

