// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˎˏ.CLS1;
import d.יʻ.CLS173;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS189;
import d.ٴˑ.CLS83.CLS81;
import d.ٴˑ.CLS83;
import d.ٴˑ.CLS84;
import d.ᐧˏ.CLS108;
import d.ᵎʻ.CLS119;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS125;
import java.util.HashMap;
import java.util.Set;

public final class CLS170 implements CLS8 {
    public final String FLD263;
    public final boolean FLD264;
    public final CLS123 FLD265;
    public final Activity FLD266;
    public final CLS123 FLD267;
    public final int[] FLD268;
    public final String FLD269;

    public CLS170(Activity activity0, String s, int[] arr_v, CLS136 ˈﹶ0, boolean z, String s1, CLS165 ᵢᴵ0) {
        this.FLD266 = activity0;
        this.FLD263 = s;
        this.FLD268 = arr_v;
        this.FLD267 = ˈﹶ0;
        this.FLD264 = z;
        this.FLD269 = s1;
        this.FLD265 = ᵢᴵ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        Activity activity0 = this.FLD266;
        CLS182 ˆᐧ0 = new CLS182(activity0);
        String s = CLS1.MTH369();
        String s1 = CLS7.FLD41.MTH413();
        if(!TextUtils.isEmpty(s1) && !s.equals(s1)) {
            StringBuilder stringBuilder0 = CLS71.MTH830(s);
            stringBuilder0.append(" (");
            stringBuilder0.append(s1);
            stringBuilder0.append(")");
            s = stringBuilder0.toString();
        }
        CLS188 ᴵʾ0 = new CLS188(activity0);
        ᴵʾ0.FLD531 = false;
        ᴵʾ0.MTH1181(String.format(CLS69.MTH795("keycard_bind_account"), s));
        ᴵʾ0.MTH1179(CLS69.MTH795("epay_desc2"));
        ˆᐧ0.MTH907(((CLS125)ᴵʾ0));
        CLS187 ᐧﹶ0 = new CLS187(activity0);
        ᐧﹶ0.MTH1181(CLS69.MTH795("donate_feedback"));
        ᐧﹶ0.MTH1179(CLS69.MTH795("donate_fb_desc"));
        ᐧﹶ0.MTH991(new CLS47(activity0, 5));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ0));
        CLS187 ᐧﹶ1 = new CLS187(activity0);
        ᐧﹶ1.MTH1181(CLS69.MTH795("check_update"));
        ᐧﹶ1.MTH991(new CLS47(activity0, 6));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ1));
        CLS119 ⁱٴ0 = new CLS119();
        String s2 = this.FLD263;
        String s3 = CLS69.MTH795((s2 + "_m_advanced_features"));
        ((HashMap)ⁱٴ0.FLD667).put(s3, 0);
        ((HashMap)ⁱٴ0.FLD669).put(0, s3);
        String s4 = CLS69.MTH795((s2 + "_y_advanced_features"));
        ((HashMap)ⁱٴ0.FLD667).put(s4, 2);
        ((HashMap)ⁱٴ0.FLD669).put(2, s4);
        CLS189 ᴵˏ0 = new CLS189(activity0);
        Set set0 = ((HashMap)ⁱٴ0.FLD667).keySet();
        CLS83 ˈˈ0 = ᴵˏ0.FLD543;
        ˈˈ0.getClass();
        if(set0 != null && !set0.isEmpty()) {
            ˈˈ0.FLD426.clear();
            ˈˈ0.FLD426.addAll(set0);
            ˈˈ0.FLD423.notifyDataSetChanged();
        }
        StringBuilder stringBuilder1 = CLS71.MTH830(s2);
        stringBuilder1.append("_m_advanced_features");
        ᴵˏ0.MTH1009(CLS69.MTH795(stringBuilder1.toString()));
        CLS84 ˉᵢ0 = new CLS84(ˈˈ0, ((CLS81)new CLS173(this.FLD268, ⁱٴ0, 13)));
        ˈˈ0.FLD424.setOnItemSelectedListener(ˉᵢ0);
        ˆᐧ0.MTH907(((CLS125)ᴵˏ0));
        CLS187 ᐧﹶ2 = new CLS187(activity0);
        ᐧﹶ2.MTH1181(CLS69.MTH795("show_qrcode"));
        ᐧﹶ2.MTH1179(CLS69.MTH795("show_qr_pay_desc"));
        ᐧﹶ2.MTH991(new CLS33(this.FLD267, 1));
        if(this.FLD264) {
            ˆᐧ0.MTH907(((CLS125)ᐧﹶ2));
        }
        CLS187 ᐧﹶ3 = new CLS187(activity0);
        ᐧﹶ3.MTH1181(CLS69.MTH795(CLS108.MTH1103(("wxpay".equals(this.FLD269) ? 0xFFFF3AFA2DFB3E45L : 0xFFFF3AEA2DFB3E45L))));
        ᐧﹶ3.MTH991(new CLS33(this.FLD265, 2));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ3));
        ˆᐧ0.MTH904(linearLayout0, 0);
    }
}

