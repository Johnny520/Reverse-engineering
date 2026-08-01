// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS281;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class CLS1555 implements CLS17 {
    public final String FLD4835;
    public final String FLD4836;
    public final long FLD4837;
    public final Activity FLD4838;
    public final CLS371 FLD4839;

    public CLS1555(String s, Activity activity0, long v, CLS371 ʻ0, String s1) {
        this.FLD4835 = s;
        this.FLD4838 = activity0;
        this.FLD4837 = v;
        this.FLD4839 = ʻ0;
        this.FLD4836 = s1;
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Activity activity0 = this.FLD4838;
        String s = this.FLD4836;
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        String s1 = this.FLD4835;
        if(!s1.equals(CLS409.FLD4000)) {
            CLS409.FLD4000 = s1;
            CLS409.FLD3999 = 0L;
            CLS409.FLD4001 = 0L;
            CLS409.FLD3998 = "";
        }
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        CLS1626 ـﹳ1 = new CLS1626(activity0);
        CLS1626 ـﹳ2 = new CLS1626(activity0);
        CLS1404 ˉˉ0 = new CLS1404(this.FLD4837, ـﹳ1, 0);
        CLS1404 ˉˉ1 = new CLS1404(this.FLD4837, ـﹳ2, 1);
        CLS371 ʻ0 = this.FLD4839;
        ـﹳ0.MTH800(ʻ0.MTH5311(s1));
        ـﹳ0.FLD5295 = false;
        ـﹳ1.MTH800(CLS27.MTH889("start_time"));
        ـﹳ1.MTH7324(new CLS377(((CLS3)ˉˉ0), 1));
        ـﹳ1.MTH798(CLS27.MTH889("set_as_first_message"));
        SimpleDateFormat simpleDateFormat0 = CLS409.FLD3997;
        if(CLS409.FLD3999 != 0L) {
            ـﹳ1.MTH7325(simpleDateFormat0.format(new Date(CLS409.FLD3999)));
        }
        ـﹳ2.MTH800(CLS27.MTH889("end_time"));
        ـﹳ2.MTH798(CLS27.MTH889("set_as_last_message"));
        if(CLS409.FLD4001 != 0L) {
            ـﹳ2.MTH7325(simpleDateFormat0.format(new Date(CLS409.FLD4001)));
        }
        ـﹳ2.MTH7324(new CLS377(((CLS3)ˉˉ1), 2));
        CLS1626 ـﹳ3 = new CLS1626(activity0);
        ـﹳ3.MTH800(CLS27.MTH889("members_lbl"));
        ـﹳ3.MTH7325(CLS27.MTH889("click_to_select_members"));
        if(!TextUtils.isEmpty(CLS409.FLD3998)) {
            StringBuilder stringBuilder0 = new StringBuilder();
            String[] arr_s = CLS502.MTH6941(CLS409.FLD3998);
            for(int v = 0; v < arr_s.length; ++v) {
                stringBuilder0.append(v + 1);
                stringBuilder0.append(". ");
                stringBuilder0.append(ʻ0.MTH5311(arr_s[v]));
                stringBuilder0.append("<br>");
                if(v > 10) {
                    stringBuilder0.append("...");
                    break;
                }
            }
            ـﹳ3.MTH798(stringBuilder0.toString());
        }
        ـﹳ3.MTH7324(new CLS281(s1, ʻ0, s, activity0, ـﹳ3, 6));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ـﹳ0, ـﹳ1, ـﹳ2, ـﹳ3});
        יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(10));
    }
}

