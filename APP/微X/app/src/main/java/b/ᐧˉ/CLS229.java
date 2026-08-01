// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS387;

public final class CLS229 implements View.OnClickListener {
    public final int FLD2229;
    public final CLS1105 FLD2230;

    public CLS229(CLS1105 ᐧˈ0, int v) {
        this.FLD2229 = v;
        this.FLD2230 = ᐧˈ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1105 ᐧˈ0 = this.FLD2230;
        switch(this.FLD2229) {
            case 0: {
                ᐧˈ0.FLD2417.MTH3749(CLS27.MTH889("config_responses"), "f_rp_reply_mt", true);
                return;
            }
            case 1: {
                ᐧˈ0.FLD2417.MTH3749(CLS27.MTH889("f_rp_threshold_reply_rp_gt"), "f_rp_threshold_reply_rp_gt", true);
                return;
            }
            case 2: {
                ᐧˈ0.FLD2417.MTH3749(CLS27.MTH889("f_rp_threshold_reply_rp_lt"), "f_rp_threshold_reply_rp_lt", true);
                return;
            }
            case 3: {
                ᐧˈ0.FLD2417.MTH3749(CLS27.MTH889("f_rp_threshold_reply_mt_gt"), "f_rp_threshold_reply_mt_gt", true);
                return;
            }
            case 4: {
                ᐧˈ0.FLD2417.MTH3749(CLS27.MTH889("f_rp_threshold_reply_mt_lt"), "f_rp_threshold_reply_mt_lt", true);
                return;
            }
            case 5: {
                ᐧˈ0.FLD2417.MTH3749(CLS27.MTH889("config_responses"), "f_rp_reply_rp", true);
                return;
            }
            case 6: {
                ᐧˈ0.FLD2421.MTH4271("_MONEYTRANSFER_");
                return;
            }
            case 7: {
                ᐧˈ0.FLD2417.MTH3749(CLS27.MTH889("config_responses"), "_MONEYTRANSFER_", true);
                return;
            }
            case 8: {
                ᐧˈ0.getClass();
                String s = ᐧˈ0.FLD2151.MTH925("grab_red_packet_exclude", "");
                Activity activity0 = ((CLS219)ᐧˈ0).MTH3883();
                CLS1201 ﹶˆ0 = new CLS1201(ᐧˈ0);
                CLS387.MTH5585(true, activity0, ᐧˈ0.FLD2419, ((CLS2)ﹶˆ0), s, -1);
                return;
            }
            default: {
                ᐧˈ0.getClass();
                try {
                    ᐧˈ0.MTH4174("", CLS27.MTH889("general"));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

