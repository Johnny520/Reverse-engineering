// Decompiled by JEB v5.42.0.202606242140

package p.pkg2;

import android.content.Context;
import android.os.Handler.Callback;
import android.text.TextUtils;
import p.pkg11.CLS195;
import p.pkg11.CLS196;
import p.pkg11.CLS197;
import p.pkg11.CLS68;
import p.pkg11.CLS72.CLS70;
import p.pkg11.CLS72;
import p.pkg11.CLS74;
import p.pkg5.CLS182;
import p.pkg5.CLS184;
import p.pkg5.CLS24;
import p.pkg5.CLS29.CLS27;
import p.pkg5.CLS29;
import p.pkg8.CLS43.CLS41;
import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS43;
import p.pkg8.CLS44;
import p.pkg8.CLS55.CLS54;

public final class CLS81 implements CLS54 {
    public final int FLD19;
    public final CLS83 FLD20;

    public CLS81(CLS83 ﾞˈ0, int v) {
        this.FLD19 = v;
        this.FLD20 = ﾞˈ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg8.CLS55$CLS54
    public final void MTH948(Object[] arr_object) {
        CLS74 ﾞˈ1;
        CLS83 ﾞˈ0 = this.FLD20;
        if(this.FLD19 == 0) {
            if(ﾞˈ0.FLD22.FLD24.FLD287) {
                String s = (String)arr_object[0];
                Handler.Callback handler$Callback0 = (Handler.Callback)arr_object[1];
                String s1 = CLS24.MTH815(s);
                String s2 = CLS44.MTH892("parsing_vid_url") + " (" + s1 + ")";
                Context context0 = CLS44.MTH898();
                if(!TextUtils.isEmpty(s2) && context0 != null && !TextUtils.isEmpty(s2)) {
                    CLS184 ﹳˑ0 = new CLS184(context0, "[" + CLS44.MTH892("appname") + "] " + s2);
                    CLS43.FLD320.MTH880(((CLS42)ﹳˑ0));
                }
                CLS68 ˊᴵ0 = new CLS68(s1, handler$Callback0, ((CLS5)ﾞˈ0).MTH430());
                if(CLS24.MTH814(s1)) {
                    ˊᴵ0.MTH1125(((CLS74)CLS24.FLD280.get(s1)));
                    return;
                }
                CLS196 ᴵᐧ0 = new CLS196(ˊᴵ0, 0);
                boolean z = false;
                if(CLS24.MTH814(s1)) {
                    z = true;
                    ﾞˈ1 = (CLS74)CLS24.FLD280.get(s1);
                }
                else if(TextUtils.isEmpty(CLS44.MTH888("shortvideo_api_url"))) {
                    z = true;
                    ﾞˈ1 = null;
                }
                if(z) {
                    ᴵᐧ0.MTH1151(ﾞˈ1);
                    return;
                }
                CLS29 ˎᵔ0 = new CLS29(CLS44.MTH888("shortvideo_api_url2"));
                ˎᵔ0.FLD295 = "POST";
                String s3 = CLS44.MTH888("shortvideo_api_url2_appid");
                ˎᵔ0.FLD297.put("appid", s3);
                String s4 = CLS44.MTH888("shortvideo_api_url2_appsecret");
                ˎᵔ0.FLD297.put("appsecret", s4);
                ˎᵔ0.FLD297.put("url", s1);
                new CLS27(ˎᵔ0, new CLS182(ᴵᐧ0, s1, 0)).execute(new Void[0]);
            }
            return;
        }
        ﾞˈ0.getClass();
        String s5 = (String)arr_object[0];
        Handler.Callback handler$Callback1 = (Handler.Callback)arr_object[1];
        CLS72 ˎᵔ1 = new CLS72(((CLS5)ﾞˈ0).MTH430());
        ˎᵔ1.setHtmlCallback(((CLS70)new CLS197(2, handler$Callback1)));
        CLS195 ᐧᴵ0 = new CLS195(ˎᵔ1, s5, 1);
        CLS43.FLD320.getClass();
        new CLS41(((CLS42)ᐧᴵ0)).execute(new Void[0]);
    }
}

