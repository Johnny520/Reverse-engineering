// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS175 implements View.OnClickListener {
    public final int FLD1700;
    public final CLS1173 FLD1701;

    public CLS175(CLS1173 ᵢᵢ0, int v) {
        this.FLD1700 = v;
        this.FLD1701 = ᵢᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1173 ᵢᵢ0 = this.FLD1701;
        switch(this.FLD1700) {
            case 0: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4446("custom", CLS27.MTH889("replace_wechat_notification"));
                return;
            }
            case 1: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4446("msg_recall", CLS27.MTH889("customize_recall_notification"));
                return;
            }
            case 2: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4446("comment_recall", CLS27.MTH889("customize_comment_recall_notification"));
                return;
            }
            case 3: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4446("new_comment", CLS27.MTH889("customize_new_comment_notification"));
                return;
            }
            case 4: {
                ᵢᵢ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                ᵢᵢ0.FLD2717.MTH5293(ᵢᵢ0.FLD2157, arrayList0);
                Activity activity0 = ((CLS219)ᵢᵢ0).MTH3883();
                CLS387.MTH5590(activity0, arrayList0, ((CLS2)new CLS1151(ᵢᵢ0)), ᵢᵢ0.FLD2151.MTH925("personal_notif_list", ""), new CLS1259(ᵢᵢ0, activity0, arrayList0, 27));
                return;
            }
            case 5: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4446("moments", CLS27.MTH889("moments_notification"));
                return;
            }
            case 6: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4446("keyword", CLS27.MTH889("keyword_notification"));
                return;
            }
            case 7: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4446("sns_keyword", CLS27.MTH889("sns_keyword_notification"));
                return;
            }
            case 8: {
                Activity activity1 = ((CLS219)ᵢᵢ0).MTH3883();
                CLS523.MTH7133(activity1, CLS27.MTH889("custom_videocall"), ((CLS379)new CLS1156(ᵢᵢ0, activity1, 9)), null, null);
                return;
            }
            case 9: {
                ᵢᵢ0.getClass();
                ᵢᵢ0.MTH4444("general", CLS27.MTH889("general_settings"));
                return;
            }
            default: {
                ᵢᵢ0.MTH4447(1, ᵢᵢ0.FLD2721);
            }
        }
    }
}

