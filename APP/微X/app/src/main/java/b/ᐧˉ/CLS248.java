// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS485;
import java.util.ArrayList;

public final class CLS248 implements View.OnClickListener {
    public final int FLD2600;
    public final Activity FLD2601;
    public final CLS1173 FLD2602;

    public CLS248(CLS1173 ᵢᵢ0, Activity activity0, int v) {
        this.FLD2600 = v;
        this.FLD2602 = ᵢᵢ0;
        this.FLD2601 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2601;
        CLS1173 ᵢᵢ0 = this.FLD2602;
        switch(this.FLD2600) {
            case 0: {
                ᵢᵢ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                ᵢᵢ0.FLD2717.MTH5381(ᵢᵢ0.FLD2157, arrayList0);
                CLS1170 ᵢᵢ$ⁱʾ0 = new CLS1170(ᵢᵢ0, "notif_moments_selected_list");
                String s1 = ᵢᵢ0.FLD2151.MTH925("notif_moments_selected_list", "");
                CLS387.MTH5585(true, this.FLD2601, arrayList0, ((CLS2)ᵢᵢ$ⁱʾ0), s1, -1);
                return;
            }
            case 1: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.FLD2716.getClass();
                CLS485.MTH6721(activity0, "wx_custom_chatroom");
                return;
            }
            default: {
                CLS935 ʽˎ0 = new CLS935(ᵢᵢ0);
                String s = ᵢᵢ0.FLD2151.MTH925("custom_videocall_ringtone_list", "");
                CLS387.MTH5590(activity0, ᵢᵢ0.FLD2722, ((CLS2)ʽˎ0), s, null);
            }
        }
    }
}

