// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS67;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS955 implements CLS379 {
    public final int FLD1843;
    public final Activity FLD1844;
    public final CLS1112 FLD1845;
    public final String FLD1846;

    public CLS955(CLS1112 ᐧˏ0, Activity activity0, String s, int v) {
        this.FLD1843 = v;
        this.FLD1845 = ᐧˏ0;
        this.FLD1844 = activity0;
        this.FLD1846 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        String s = this.FLD1846;
        Activity activity0 = this.FLD1844;
        CLS1112 ᐧˏ0 = this.FLD1845;
        if(this.FLD1843 == 0) {
            ᐧˏ0.getClass();
            CLS1635 ﾞᵎ0 = new CLS1635(activity0);
            ﾞᵎ0.MTH800(CLS27.MTH889(s));
            CLS29 ˎᵢ0 = ᐧˏ0.FLD2151;
            ﾞᵎ0.MTH7437(ˎᵢ0.MTH938(s, false));
            ﾞᵎ0.MTH7438(new CLS270(ᐧˏ0, s, 0));
            CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ᐧˏ0.FLD2482) {
                JSONObject jSONObject0 = (JSONObject)object0;
                try {
                    arrayList0.add(jSONObject0.getString("n"));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            CLS1620 ˊˏ0 = new CLS1620(activity0);
            ˊˏ0.MTH7248(((CLS533)new CLS1099(ᐧˏ0, s, 0)));
            ˊˏ0.MTH7247(arrayList0);
            ˊˏ0.MTH7246(ˎᵢ0.MTH925(CLS34.MTH1074(new StringBuilder(), s, 4100645482852569909L), ""));
            CLS523.MTH7147(linearLayout0, ((CLS18)ˊˏ0), true);
            return;
        }
        ᐧˏ0.getClass();
        int v = CLS523.MTH7137(10);
        CLS1635 ﾞᵎ1 = new CLS1635(activity0);
        ﾞᵎ1.MTH800(CLS27.MTH889(("all_" + s + "_chat_blacklist")));
        String s1 = CLS34.MTH1079(0x38E86B012B3CD335L, new StringBuilder(), s, 4100645134960218933L);
        CLS29 ˎᵢ1 = ᐧˏ0.FLD2151;
        ﾞᵎ1.MTH7437(ˎᵢ1.MTH938(s1, false));
        ﾞᵎ1.MTH7438(new CLS270(ᐧˏ0, s, 1));
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("config_exclude"));
        ـˏ0.MTH7320(new CLS67(ᐧˏ0, s, activity0, 9));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ﾞᵎ1, ـˏ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: ᐧˏ0.FLD2482) {
            JSONObject jSONObject1 = (JSONObject)object1;
            try {
                arrayList1.add(jSONObject1.getString("n"));
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        CLS1620 ˊˏ1 = new CLS1620(activity0);
        ˊˏ1.MTH7248(((CLS533)new CLS1099(ᐧˏ0, s, 1)));
        ˊˏ1.MTH7247(arrayList1);
        ˊˏ1.MTH7246(ˎᵢ1.MTH925(CLS34.MTH1079(4100645276694139701L, new StringBuilder(), s, 4100645298168976181L), ""));
        CLS523.MTH7147(linearLayout0, ((CLS18)ˊˏ1), true);
    }
}

