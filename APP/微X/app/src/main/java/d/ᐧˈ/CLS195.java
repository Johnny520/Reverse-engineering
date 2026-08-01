// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS10.CLS8;
import d.ˑʽ.CLS10.CLS9;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS152;
import d.ˑʽ.CLS27;
import d.ˑʽ.CLS28;
import d.ˑʽ.CLS45;
import d.ˑʽ.CLS47;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS187;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS91;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS122;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;
import java.util.Collections;

public final class CLS195 implements CLS8, CLS9, CLS120, CLS122 {
    public final Activity FLD578;
    public final int FLD579;

    public CLS195(Activity activity0, int v) {
        this.FLD579 = v;
        this.FLD578 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS120
    public final void MTH1170(Object object0) {
        Activity activity0 = this.FLD578;
        switch(this.FLD579) {
            case 0: {
                try {
                    CLS1.MTH362(activity0, Uri.parse(((String)object0)));
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                return;
            }
            case 2: {
                switch(((String)object0).hashCode()) {
                    case 100358090: {
                        if(((String)object0).equals("input")) {
                            CLS28.MTH528(activity0);
                            return;
                        }
                        break;
                    }
                    case 1810371957: {
                        if(((String)object0).equals("generate")) {
                            String s = CLS13.MTH433();
                            if(!TextUtils.isEmpty(s)) {
                                CLS45.MTH653(activity0, CLS69.MTH795("generate_transfer_key"), ((CLS124)new CLS152(activity0, s, true)), null);
                                CLS13.MTH428(activity0, s);
                                CLS13.MTH426(activity0, CLS69.MTH795("copy_transferkey"));
                            }
                            return;
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
                return;
            }
            case 3: {
                try {
                    Intent intent0 = new Intent();
                    intent0.setData(Uri.parse(("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D" + ((String)object0))));
                    try {
                        activity0.startActivity(intent0);
                        return;
                    }
                    catch(Exception unused_ex) {
                    }
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
                return;
            }
            case 4: {
                switch(((String)object0).hashCode()) {
                    case 100358090: {
                        if(((String)object0).equals("input")) {
                            CLS28.MTH528(activity0);
                            return;
                        }
                        break;
                    }
                    case 1810371957: {
                        if(((String)object0).equals("generate")) {
                            String s1 = CLS13.MTH433();
                            if(!TextUtils.isEmpty(s1)) {
                                CLS45.MTH653(activity0, CLS69.MTH795("generate_transfer_key"), ((CLS124)new CLS152(activity0, s1, true)), null);
                                CLS13.MTH428(activity0, s1);
                                CLS13.MTH426(activity0, CLS69.MTH795("copy_transferkey"));
                            }
                            return;
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
                return;
            }
            case 6: {
                CLS1.MTH363(activity0, ((String)object0));
                return;
            }
            default: {
                CLS1.MTH363(activity0, ((String)object0));
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS9
    public final void MTH416(CLS91 ٴˆ0) {
        Activity activity0 = this.FLD578;
        if(this.FLD579 == 9) {
            if(!CLS71.MTH831(0xFFFF3B952DFB3E45L)) {
                ٴˆ0.MTH969("donate_feedback", ((CLS123)new CLS202(activity0, 8)));
            }
            return;
        }
        ٴˆ0.MTH969(CLS69.MTH795("copy_link"), ((CLS123)new CLS202(activity0, 5)));
        ٴˆ0.MTH969("open_with_external_browser", ((CLS123)new CLS202(activity0, 6)));
        if(!CLS71.MTH831(0xFFFF3B292DFB3E45L)) {
            ٴˆ0.MTH969("donate_feedback", ((CLS123)new CLS202(activity0, 7)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        Activity activity0 = this.FLD578;
        if(this.FLD579 == 10) {
            CLS182 ˆᐧ0 = new CLS182(activity0);
            CLS188 ᴵʾ0 = new CLS188(activity0);
            ᴵʾ0.FLD531 = false;
            ᴵʾ0.MTH1181(CLS69.MTH795("donate_crypto_desc"));
            ˆᐧ0.MTH907(((CLS125)ᴵʾ0));
            if(!TextUtils.isEmpty(CLS69.MTH806("donate_feedback_url"))) {
                CLS187 ᐧﹶ0 = new CLS187(activity0);
                ᐧﹶ0.MTH1181(CLS69.MTH795("donate_feedback"));
                ᐧﹶ0.MTH991(new CLS47(activity0, 1));
                ˆᐧ0.MTH907(((CLS125)ᐧﹶ0));
            }
            CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), CLS45.MTH662(10));
            CLS187 ᐧﹶ1 = new CLS187(activity0);
            ᐧﹶ1.MTH1181(CLS69.MTH795("donate"));
            ᐧﹶ1.MTH991(new CLS47(activity0, 2));
            CLS45.MTH660(linearLayout0, ((CLS125)ᐧﹶ1));
            return;
        }
        CLS188 ᴵʾ1 = new CLS188(activity0);
        ᴵʾ1.FLD531 = false;
        ᴵʾ1.MTH1179(CLS69.MTH795("donate_feedback_desc"));
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = CLS1.MTH369();
        stringBuilder0.append("wxid: ");
        stringBuilder0.append(s);
        stringBuilder0.append("<br>");
        stringBuilder0.append("商品: ");
        CLS188 ᴵʾ2 = new CLS188(activity0);
        ᴵʾ2.FLD531 = false;
        ᴵʾ2.MTH1181(stringBuilder0.toString());
        ᴵʾ2.MTH1179(CLS69.MTH795("click_to_copy"));
        ᴵʾ2.MTH1000(new CLS27(activity0, stringBuilder0, 1));
        CLS187 ᐧﹶ2 = new CLS187(activity0);
        ᐧﹶ2.MTH1181(CLS69.MTH795("donate_feedback"));
        ᐧﹶ2.MTH991(new CLS47(activity0, 4));
        CLS182 ˆᐧ1 = new CLS182(activity0);
        Collections.addAll(ˆᐧ1.FLD411, new Object[]{ᴵʾ1, ᴵʾ2, ᐧﹶ2});
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ1), CLS45.MTH662(10));
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS122
    public final void MTH1173(String s) {
        Activity activity0 = this.FLD578;
        switch(this.FLD579) {
            case 1: {
                if(!TextUtils.isEmpty(s) && s.startsWith("http")) {
                    CLS1.MTH363(activity0, s);
                }
                return;
            }
            case 5: {
                if(!TextUtils.isEmpty(s) && s.startsWith("http")) {
                    CLS1.MTH363(activity0, s);
                }
                return;
            }
            case 7: {
                if(!TextUtils.isEmpty(s) && s.startsWith("http")) {
                    CLS1.MTH363(activity0, s);
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s) && s.startsWith("http")) {
                    CLS1.MTH363(activity0, s);
                }
            }
        }
    }
}

