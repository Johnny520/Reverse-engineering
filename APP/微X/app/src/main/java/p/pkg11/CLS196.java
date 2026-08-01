// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import android.content.Context;
import android.text.TextUtils;
import p.pkg12.CLS75;
import p.pkg12.CLS76;
import p.pkg5.CLS182;
import p.pkg5.CLS24;
import p.pkg5.CLS29.CLS27;
import p.pkg5.CLS29;
import p.pkg8.CLS185;
import p.pkg8.CLS43.CLS41;
import p.pkg8.CLS43.CLS42;
import p.pkg8.CLS43;
import p.pkg8.CLS44;

public final class CLS196 implements CLS75, CLS76 {
    public final int FLD440;
    public final CLS68 FLD441;

    public CLS196(CLS68 ˊᴵ0, int v) {
        this.FLD440 = v;
        this.FLD441 = ˊᴵ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg12.CLS75
    public final void MTH1159() {
        CLS198 ﾞᵢ0;
        CLS74 ﾞˈ0 = null;
        CLS68 ˊᴵ0 = this.FLD441;
        if(this.FLD440 == 1) {
            ˊᴵ0.getClass();
            CLS196 ᴵᐧ0 = new CLS196(ˊᴵ0, 2);
            String s = ˊᴵ0.FLD420;
            if(s.contains("v.douyin.com")) {
                ﾞᵢ0 = new CLS198(3);
            }
            else if(s.contains("v.kuaishou.com") || s.contains("v.kuaishouapp.com")) {
                ﾞᵢ0 = new CLS198(1);
            }
            else if(s.contains("isee.weishi.qq.com")) {
                ﾞᵢ0 = new CLS198(4);
            }
            else if(s.contains("v.ixigua.com")) {
                ﾞᵢ0 = new CLS198(5);
            }
            else if(s.contains("b23.tv") || s.contains("bilibili.com")) {
                ﾞᵢ0 = new CLS198(0);
            }
            else if(s.contains("pipix.com")) {
                ﾞᵢ0 = new CLS198(2);
            }
            else {
                ﾞᵢ0 = null;
            }
            if(ﾞᵢ0 == null) {
                ᴵᐧ0.MTH1151(null);
                return;
            }
            CLS72 ˎᵔ0 = new CLS72(((Context)ˊᴵ0.FLD421.get()));
            if(s.contains("v.kuaishou.com") || s.contains("v.kuaishouapp.com")) {
                ˎᵔ0.setUserAgent("Mozilla/5.0.html (iPhone; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.html.2 Mobile/8J2 Safari/6533.18.5 ");
            }
            ˎᵔ0.setHtmlCallback(((CLS70)new CLS193(ﾞᵢ0, ((CLS75)ᴵᐧ0), ˎᵔ0)));
            CLS185 ˋˈ0 = new CLS185(ˊᴵ0, ˎᵔ0, 2);
            CLS43.FLD320.getClass();
            new CLS41(((CLS42)ˋˈ0)).execute(new Void[0]);
            return;
        }
        ˊᴵ0.getClass();
        CLS196 ᴵᐧ1 = new CLS196(ˊᴵ0, 4);
        String s1 = ˊᴵ0.FLD420;
        boolean z = false;
        if(CLS24.MTH814(s1)) {
            z = true;
            ﾞˈ0 = (CLS74)CLS24.FLD280.get(s1);
        }
        else if(TextUtils.isEmpty(CLS44.MTH888("shortvideo_api_url"))) {
            z = true;
        }
        if(z) {
            ᴵᐧ1.MTH1151(ﾞˈ0);
            return;
        }
        CLS29 ˎᵔ1 = new CLS29(CLS44.MTH888("shortvideo_api_url"));
        ˎᵔ1.FLD295 = "POST";
        ˎᵔ1.FLD298 = "url=" + s1;
        new CLS27(ˎᵔ1, new CLS182(ᴵᐧ1, s1, 1)).execute(new Void[0]);
    }

    public final void MTH1151(CLS74 ﾞˈ0) {
        CLS68 ˊᴵ0 = this.FLD441;
        switch(this.FLD440) {
            case 0: {
                ˊᴵ0.getClass();
                CLS194 יٴ0 = new CLS194(ˊᴵ0, ﾞˈ0, 0);
                CLS196 ᴵᐧ0 = new CLS196(ˊᴵ0, 1);
                if(ﾞˈ0 == null) {
                    ᴵᐧ0.MTH1159();
                    return;
                }
                CLS193 ˑᵎ0 = new CLS193(ﾞˈ0.FLD444, ((CLS75)יٴ0), ᴵᐧ0);
                CLS43.FLD320.MTH879(((CLS42)ˑᵎ0));
                return;
            }
            case 2: {
                ˊᴵ0.getClass();
                CLS194 יٴ1 = new CLS194(ˊᴵ0, ﾞˈ0, 1);
                CLS196 ᴵᐧ1 = new CLS196(ˊᴵ0, 3);
                if(ﾞˈ0 == null) {
                    ᴵᐧ1.MTH1159();
                    return;
                }
                CLS193 ˑᵎ1 = new CLS193(ﾞˈ0.FLD444, ((CLS75)יٴ1), ᴵᐧ1);
                CLS43.FLD320.MTH879(((CLS42)ˑᵎ1));
                return;
            }
            default: {
                ˊᴵ0.getClass();
                ˊᴵ0.MTH1125(ﾞˈ0);
            }
        }
    }
}

