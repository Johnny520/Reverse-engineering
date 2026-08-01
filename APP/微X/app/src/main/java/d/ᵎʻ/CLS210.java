// Decompiled by JEB v5.42.0.202606242140

package d.ᵎʻ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS10.CLS8;
import d.ˑʽ.CLS10.CLS9;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS21.CLS17;
import d.ˑʽ.CLS21.CLS20;
import d.ˑʽ.CLS28;
import d.ˑʽ.CLS35;
import d.ˑʽ.CLS50;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS180.CLS79;
import d.ٴˑ.CLS180;
import d.ٴˑ.CLS191;
import d.ٴˑ.CLS90.CLS89;
import d.ٴˑ.CLS91;
import d.ᐧˈ.CLS101;
import d.ᐧˈ.CLS194;
import d.ᐧˈ.CLS198;
import d.ᐧˈ.CLS199;
import d.ᐧˈ.CLS202;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS123;
import org.json.JSONObject;

public final class CLS210 implements CLS8, CLS9, CLS17, CLS67, CLS89, CLS120 {
    public final Object FLD661;
    public final int FLD662;

    public CLS210(Object object0, int v) {
        this.FLD662 = v;
        this.FLD661 = object0;
        super();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS68$CLS67
    public final void run() {
        CLS28.MTH529(((JSONObject)this.FLD661).optString("key"), ((JSONObject)this.FLD661).optBoolean("wrong_key"));
    }

    @Override  // d.ⁱٴ.CLS120
    public final void MTH1170(Object object0) {
        CLS117 יʻ0 = (CLS117)this.FLD661;
        יʻ0.getClass();
        try {
            CLS123 ᐧי0 = (CLS123)יʻ0.FLD660.get(((String)object0));
            if(ᐧי0 != null) {
                ᐧי0.MTH1174();
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS9
    public final void MTH416(CLS91 ٴˆ0) {
        Object object0 = this.FLD661;
        switch(this.FLD662) {
            case 3: {
                Activity activity0 = ((CLS101)(((CLS194)object0))).MTH1053();
                ٴˆ0.MTH969("donate_keycard_advanced", ((CLS123)new CLS198(((CLS194)object0), 0)));
                ٴˆ0.MTH969("email", ((CLS123)new CLS202(activity0, 0)));
                if(!CLS71.MTH831(0xFFFF043D2DFB3E45L)) {
                    ٴˆ0.MTH969("forum", ((CLS123)new CLS202(activity0, 1)));
                }
                if(!CLS71.MTH831(0xFFFF04312DFB3E45L)) {
                    ٴˆ0.MTH969("qq_author", ((CLS123)new CLS202(activity0, 2)));
                }
                if(!CLS71.MTH831(0xFFFF05DF2DFB3E45L)) {
                    ٴˆ0.MTH969("qq_groups", ((CLS123)new CLS198(((CLS194)object0), 1)));
                }
                if(!CLS71.MTH831(0xFFFF05CB2DFB3E45L)) {
                    ٴˆ0.MTH968("Telegram", "telegram", ((CLS123)new CLS202(activity0, 3)));
                }
                if(!CLS71.MTH831(0xFFFF05EC2DFB3E45L) && !((CLS194)object0).FLD582.MTH594("feedback")) {
                    ٴˆ0.MTH969("feedback", ((CLS123)new CLS202(activity0, 4)));
                }
                if(!CLS71.MTH831(0xFFFF058D2DFB3E45L)) {
                    ٴˆ0.MTH969("cloud_storage", ((CLS123)new CLS198(((CLS194)object0), 2)));
                }
                return;
            }
            case 4: {
                if(((CLS9)object0) != null) {
                    ((CLS9)object0).MTH416(ٴˆ0);
                }
                return;
            }
            default: {
                ٴˆ0.MTH969("share", ((CLS123)new CLS191(((Bitmap)object0), 2)));
            }
        }
    }

    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        CLS79 ʿﾞ$ᐧי0 = ((CLS180)this.FLD661).FLD390;
        if(ʿﾞ$ᐧי0 != null) {
            ((CLS199)ʿﾞ$ᐧי0).MTH1073(linearLayout0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS21$CLS17
    public final void MTH446(CLS20 ʾﹶ$ⁱٴ0) {
        String s = (String)this.FLD661;
        CLS35.FLD189 = false;
        if(ʾﹶ$ⁱٴ0.MTH454()) {
            CLS13.MTH431(CLS69.MTH795("wxpay_not_possible"));
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(ʾﹶ$ⁱٴ0.MTH455());
            CLS13.MTH434(("" + jSONObject0));
            int v = jSONObject0.optInt("code");
            String s1 = jSONObject0.getString("trade_no");
            if(v != 1) {
                CLS13.MTH431(jSONObject0.optString("msg"));
                return;
            }
            CLS68.FLD326.MTH789("wx+donate", s1, 600000L);
            CLS35.MTH579();
            CLS35.MTH577(s, jSONObject0);
            JSONObject jSONObject1 = new JSONObject();
            CLS35.FLD188.MTH1156(s1, jSONObject1, 30000L);
            if(jSONObject0.has("qrcode")) {
                CLS35.MTH577((s + "qr"), jSONObject0);
                String s2 = jSONObject0.getString("qrcode");
                CLS50.MTH690(CLS1.MTH366(), CLS69.MTH795("epay"), s1, s2);
                CLS35.MTH584();
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }
}

