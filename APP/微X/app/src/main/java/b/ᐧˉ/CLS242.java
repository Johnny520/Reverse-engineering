// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS523;

public final class CLS242 implements View.OnClickListener {
    public final int FLD2487;
    public final CLS1030 FLD2488;

    public CLS242(CLS1030 ˎᵢ0, int v) {
        this.FLD2487 = v;
        this.FLD2488 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1030 ˎᵢ0 = this.FLD2488;
        switch(this.FLD2487) {
            case 0: {
                ˎᵢ0.getClass();
                String s1 = CLS27.MTH889("general");
                Activity activity1 = ((CLS219)ˎᵢ0).MTH3883();
                CLS523.MTH7133(activity1, s1, ((CLS379)new CLS1063(ˎᵢ0, "", activity1, 0)), null, null);
                return;
            }
            case 1: {
                Activity activity2 = ((CLS219)ˎᵢ0).MTH3883();
                CLS907 ʻᵎ0 = new CLS907(ˎᵢ0);
                String s2 = ˎᵢ0.FLD2151.MTH925("custom_autoreply_list", "");
                CLS387.MTH5590(activity2, ˎᵢ0.FLD2136, ((CLS2)ʻᵎ0), s2, null);
                return;
            }
            default: {
                ˎᵢ0.getClass();
                String s = ˎᵢ0.FLD2151.MTH925("autoreply_exclude_usernames", "");
                Activity activity0 = ((CLS219)ˎᵢ0).MTH3883();
                CLS1215 ﾞᵎ0 = new CLS1215(ˎᵢ0);
                CLS387.MTH5585(true, activity0, ˎᵢ0.FLD2136, ((CLS2)ﾞᵎ0), s, -1);
            }
        }
    }
}

