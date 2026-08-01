// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import d.ˎˏ.CLS1;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS176;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS74;
import d.ٴˑ.CLS91;
import d.ٴˑ.CLS95;
import d.ᐧˈ.CLS104;
import d.ᐧˈ.CLS202;
import d.ᐧˏ.CLS108;
import d.ᐧי.CLS207;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS125;
import java.io.Serializable;

public final class CLS157 implements CLS8, CLS9 {
    public final Activity FLD207;
    public final Object FLD208;
    public final int FLD209;
    public final Object FLD210;
    public final boolean FLD211;

    public CLS157(Activity activity0, boolean z, Object object0, Object object1, int v) {
        this.FLD209 = v;
        this.FLD207 = activity0;
        this.FLD211 = z;
        this.FLD210 = object0;
        this.FLD208 = object1;
        super();
    }

    public CLS157(Activity activity0, double[] arr_f, boolean z, String s) {
        this.FLD209 = 0;
        super();
        this.FLD207 = activity0;
        this.FLD210 = arr_f;
        this.FLD211 = z;
        this.FLD208 = s;
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS9
    public final void MTH416(CLS91 ٴˆ0) {
        boolean z = this.FLD211;
        Activity activity0 = this.FLD207;
        Object object0 = this.FLD208;
        Object object1 = this.FLD210;
        if(this.FLD209 == 1) {
            ٴˆ0.MTH969("donate_feedback", ((CLS123)new CLS202(activity0, 9)));
            ٴˆ0.MTH969("check_update", ((CLS123)new CLS202(activity0, 10)));
            if(z) {
                ٴˆ0.MTH969("show_qrcode", ((CLS123)new CLS207(activity0, ((double[])object1), 1)));
            }
            ٴˆ0.MTH969("start_pay", ((CLS123)new CLS133(activity0, ((double[])object1), ((String)object0))));
            return;
        }
        ٴˆ0.MTH969("donate_feedback", ((CLS123)new CLS202(activity0, 12)));
        ٴˆ0.MTH969("check_update", ((CLS123)new CLS202(activity0, 13)));
        if(z) {
            ٴˆ0.MTH969("show_qrcode", ((CLS123)object1));
        }
        ٴˆ0.MTH969("start_pay", ((CLS123)object0));
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        double[] arr_f = (double[])this.FLD210;
        String s = (String)this.FLD208;
        Activity activity0 = this.FLD207;
        CLS182 ˆᐧ0 = new CLS182(activity0);
        String s1 = CLS1.MTH369();
        String s2 = CLS7.FLD41.MTH413();
        if(!TextUtils.isEmpty(s2) && !s1.equals(s2)) {
            StringBuilder stringBuilder0 = CLS71.MTH830(s1);
            stringBuilder0.append(" (");
            stringBuilder0.append(s2);
            stringBuilder0.append(")");
            s1 = stringBuilder0.toString();
        }
        CLS188 ᴵʾ0 = new CLS188(activity0);
        ᴵʾ0.FLD531 = false;
        ᴵʾ0.MTH1181(String.format(CLS69.MTH795("keycard_bind_account"), s1));
        ᴵʾ0.MTH1179(CLS69.MTH795("epay_desc"));
        ˆᐧ0.MTH907(((CLS125)ᴵʾ0));
        CLS187 ᐧﹶ0 = new CLS187(activity0);
        ᐧﹶ0.MTH1181(CLS69.MTH795("donate_feedback"));
        ᐧﹶ0.MTH1179(CLS69.MTH795("donate_fb_desc"));
        ᐧﹶ0.MTH991(new CLS104(activity0, 28));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ0));
        CLS187 ᐧﹶ1 = new CLS187(activity0);
        ᐧﹶ1.MTH1181(CLS69.MTH795("check_update"));
        ᐧﹶ1.MTH991(new CLS104(activity0, 29));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ1));
        NumberPicker numberPicker0 = new NumberPicker(activity0);
        numberPicker0.setMinValue(0);
        numberPicker0.setMaxValue(9);
        numberPicker0.setDisplayedValues(new String[]{"￥10.00", "￥20.00", "￥30.00", "￥40.00", "￥50.00", "￥60.00", "￥70.00", "￥80.00", "￥90.00", "￥100.00"});
        numberPicker0.setWrapSelectorWheel(true);
        numberPicker0.setOnValueChangedListener(new CLS16(arr_f));
        CLS176 ʻ0 = new CLS176(activity0);
        ʻ0.FLD351.add(numberPicker0);
        ˆᐧ0.MTH907(((CLS125)ʻ0));
        if(this.FLD211) {
            CLS187 ᐧﹶ2 = new CLS187(activity0);
            ᐧﹶ2.MTH1181(CLS69.MTH795("show_qrcode"));
            ᐧﹶ2.MTH1179(CLS69.MTH795("show_qr_pay_desc"));
            ᐧﹶ2.MTH991(new CLS74(activity0, ((Serializable)arr_f), 3));
            ˆᐧ0.MTH907(((CLS125)ᐧﹶ2));
        }
        CLS187 ᐧﹶ3 = new CLS187(activity0);
        ᐧﹶ3.MTH1181(CLS69.MTH795(CLS108.MTH1103(("wxpay".equals(s) ? 0xFFFF3BF32DFB3E45L : 0xFFFF3BE32DFB3E45L))));
        ᐧﹶ3.MTH991(new CLS95(activity0, arr_f, s));
        ˆᐧ0.MTH907(((CLS125)ᐧﹶ3));
        ˆᐧ0.MTH904(linearLayout0, 0);
    }
}

