// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS523;

public final class CLS268 implements View.OnClickListener {
    public final int FLD2816;
    public final CLS899 FLD2817;

    public CLS268(CLS899 ʻʼ0, int v) {
        this.FLD2816 = v;
        this.FLD2817 = ʻʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS899 ʻʼ0 = this.FLD2817;
        switch(this.FLD2816) {
            case 0: {
                CLS216 ˎˎ0 = ʻʼ0.FLD1664;
                Activity activity0 = (Activity)ˎˎ0.FLD2112.get();
                CLS1147 ᵎٴ0 = new CLS1147(ˎˎ0);
                String s = ˎˎ0.FLD2110.MTH925("custom_avatar_list", "");
                CLS387.MTH5590(activity0, ʻʼ0.FLD1659, ((CLS2)ᵎٴ0), s, null);
                return;
            }
            case 1: {
                ʻʼ0.MTH3341(1);
                return;
            }
            case 2: {
                CLS210 ˋʼ0 = ʻʼ0.FLD1660;
                String s1 = CLS27.MTH889("introduction_text");
                ˋʼ0.FLD1999 = true;
                ˋʼ0.FLD2016 = true;
                ˋʼ0.MTH3749(s1, "_FRIENDREQUEST_INTRO_", false);
                return;
            }
            case 3: {
                ʻʼ0.MTH3341(0);
                return;
            }
            case 4: {
                ʻʼ0.FLD1660.MTH3749(CLS27.MTH889("config_responses"), "_FRIEND_ACCEPT_", true);
                return;
            }
            case 5: {
                Activity activity1 = ((CLS219)ʻʼ0).MTH3883();
                CLS523.MTH7150(activity1, CLS27.MTH889("keyword_remark"), ((CLS17)new CLS1156(ʻʼ0, activity1, 8)));
                return;
            }
            default: {
                ʻʼ0.FLD1660.MTH3749(CLS27.MTH889("config_responses"), "_SELF_ACCEPT_", true);
            }
        }
    }
}

