// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.יʻ.CLS69;
import d.ٴˑ.CLS181;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS191;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS125;
import java.util.LinkedHashMap;

public final class CLS151 implements CLS8 {
    public final Activity FLD167;
    public final LinkedHashMap FLD168;
    public final int FLD169;
    public final CLS110 FLD170;
    public final String FLD171;

    public CLS151(Activity activity0, String s, CLS110 ٴˑ0, LinkedHashMap linkedHashMap0) {
        this.FLD169 = 1;
        super();
        this.FLD167 = activity0;
        this.FLD171 = s;
        this.FLD170 = ٴˑ0;
        this.FLD168 = linkedHashMap0;
    }

    public CLS151(String s, Activity activity0, CLS110 ٴˑ0, LinkedHashMap linkedHashMap0) {
        this.FLD169 = 0;
        super();
        this.FLD171 = s;
        this.FLD167 = activity0;
        this.FLD170 = ٴˑ0;
        this.FLD168 = linkedHashMap0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        LinkedHashMap linkedHashMap0 = this.FLD168;
        CLS110 ٴˑ0 = this.FLD170;
        Activity activity0 = this.FLD167;
        String s = this.FLD171;
        if(this.FLD169 == 0) {
            if(!TextUtils.isEmpty(s)) {
                CLS188 ᴵʾ0 = new CLS188(activity0);
                ᴵʾ0.FLD531 = false;
                ᴵʾ0.MTH1181(s);
                CLS45.MTH660(linearLayout0, ((CLS125)ᴵʾ0));
            }
            CLS181 ˆـ0 = new CLS181(activity0);
            ˆـ0.MTH894(ٴˑ0);
            ˆـ0.MTH893(new CLS23(ٴˑ0, linkedHashMap0, activity0));
            CLS14 ʽˉ0 = new CLS14(ٴˑ0, linkedHashMap0, activity0);
            ˆـ0.FLD395 = ʽˉ0;
            ˆـ0.FLD403.setOnItemLongClickListener(ʽˉ0);
            CLS45.MTH660(linearLayout0, ((CLS125)ˆـ0));
            return;
        }
        CLS188 ᴵʾ1 = new CLS188(activity0);
        ᴵʾ1.FLD531 = false;
        ᴵʾ1.MTH1181(CLS69.MTH795("auto_friend_req_buy_warn"));
        CLS45.MTH660(linearLayout0, ((CLS125)ᴵʾ1));
        CLS187 ᐧﹶ0 = new CLS187(activity0);
        ᐧﹶ0.MTH1181(CLS69.MTH795("auto_friend_req_buy_accept"));
        ᐧﹶ0.MTH991(new CLS29(activity0, s, ٴˑ0, linkedHashMap0));
        CLS45.MTH660(linearLayout0, ((CLS125)ᐧﹶ0));
        ᐧﹶ0.FLD516.setEnabled(false);
        CLS169 ﹳᵎ0 = new CLS169(ᐧﹶ0);
        CLS191 ⁱٴ0 = new CLS191(ᐧﹶ0, 1);
        new CLS22(10000L, ﹳᵎ0, new int[]{0}, ⁱٴ0).start();
    }
}

