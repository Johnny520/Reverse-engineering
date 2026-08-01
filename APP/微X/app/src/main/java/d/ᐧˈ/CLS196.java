// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˑʽ.CLS10;
import d.ˑʽ.CLS45;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ⁱٴ.CLS125;

public final class CLS196 extends CLS101 {
    public CLS196(String s, String s1) {
        super(s, s1);
    }

    @Override  // d.ᐧˈ.CLS101
    public final void MTH1054(boolean z, boolean z1, String s) {
        if(z1) {
            this.FLD580.clear();
        }
        CLS10 ʻﹶ0 = new CLS10(((CLS101)this).MTH1053(), this.FLD584);
        ʻﹶ0.FLD44 = new CLS201(((CLS101)this), z, z1, 2);
        ʻﹶ0.FLD43 = new CLS193(ʻﹶ0, 1);
        ʻﹶ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS101)this).MTH1058(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ᐧˈ.CLS101
    public final void MTH1056(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        int v = CLS45.MTH662(10);
        Activity activity0 = ((CLS101)this).MTH1053();
        CLS182 ˆᐧ0 = new CLS182(activity0);
        CLS188 ᴵʾ0 = new CLS188(activity0);
        ᴵʾ0.FLD531 = false;
        ᴵʾ0.MTH1179(CLS69.MTH795("donate_keycard_desc"));
        ˆᐧ0.MTH907(((CLS125)ᴵʾ0));
        CLS187 ᐧﹶ0 = ((CLS101)this).MTH1055(z1, z2);
        ᐧﹶ0.MTH1181(CLS69.MTH795("get_keycard"));
        ᐧﹶ0.MTH991(new CLS104(activity0, 22));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ0));
        CLS187 ᐧﹶ1 = ((CLS101)this).MTH1055(z1, z2);
        ᐧﹶ1.MTH1181(CLS69.MTH795("keycard"));
        ᐧﹶ1.MTH991(new CLS104(activity0, 23));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ1));
        if(!CLS71.MTH831(0xFFFF0AF52DFB3E45L)) {
            CLS187 ᐧﹶ2 = ((CLS101)this).MTH1055(z1, z2);
            ᐧﹶ2.MTH1181(CLS69.MTH795("keycard_lookup"));
            ᐧﹶ2.MTH991(new CLS104(activity0, 24));
            ˆᐧ0.MTH907(((CLS125)ᐧﹶ2));
        }
        if(!CLS71.MTH831(0xFFFF0A9B2DFB3E45L)) {
            CLS187 ᐧﹶ3 = ((CLS101)this).MTH1055(z1, z2);
            ᐧﹶ3.MTH1181(CLS69.MTH795("wechat_pay_input"));
            ᐧﹶ3.MTH1179(CLS69.MTH795("wechat_pay_input_desc2"));
            ᐧﹶ3.MTH991(new CLS104(activity0, 25));
            ˆᐧ0.MTH907(((CLS125)ᐧﹶ3));
        }
        if(!CLS71.MTH831(0xFFFF0AA22DFB3E45L)) {
            CLS187 ᐧﹶ4 = ((CLS101)this).MTH1055(z1, z2);
            ᐧﹶ4.MTH1181(CLS69.MTH795("keycard_feedback"));
            ᐧﹶ4.MTH991(new CLS104(activity0, 26));
            ˆᐧ0.MTH907(((CLS125)ᐧﹶ4));
        }
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), v);
    }
}

