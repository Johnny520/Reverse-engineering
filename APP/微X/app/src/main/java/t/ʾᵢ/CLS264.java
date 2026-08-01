// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS54;
import t.ˊﾞ.CLS106;
import t.ˊﾞ.CLS290;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS145;
import t.ⁱʾ.CLS147;
import t.ﾞᐧ.CLS157;
import t.ﾞᐧ.CLS177.CLS176;
import t.ﾞᐧ.CLS181;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS335;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS339;
import t.ﾞᐧ.CLS341;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS345;

public final class CLS264 implements CLS54 {
    public final String[] FLD380;
    public final CLS335 FLD381;
    public final CLS332 FLD382;
    public final CLS216 FLD383;
    public final String[] FLD384;
    public final CLS339 FLD385;
    public final CLS147 FLD386;
    public final CLS332 FLD387;
    public final CLS339 FLD388;
    public final CLS106 FLD389;
    public final Activity FLD390;

    public CLS264(CLS216 ˎﾞ0, CLS332 ʻᵎ0, CLS147 ⁱʾ0, CLS339 יﹳ0, CLS339 יﹳ1, Activity activity0, CLS106 ٴـ0, CLS335 ˉᐧ0, CLS332 ʻᵎ1, String[] arr_s, String[] arr_s1) {
        this.FLD383 = ˎﾞ0;
        this.FLD387 = ʻᵎ0;
        this.FLD386 = ⁱʾ0;
        this.FLD388 = יﹳ0;
        this.FLD385 = יﹳ1;
        this.FLD390 = activity0;
        this.FLD389 = ٴـ0;
        this.FLD381 = ˉᐧ0;
        this.FLD382 = ʻᵎ1;
        this.FLD380 = arr_s;
        this.FLD384 = arr_s1;
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        ArrayList arrayList0;
        CLS332 ʻᵎ0 = this.FLD382;
        String[] arr_s = this.FLD380;
        String[] arr_s1 = this.FLD384;
        CLS216 ˎﾞ0 = this.FLD383;
        ˎﾞ0.getClass();
        int v = CLS43.MTH1439(10);
        CLS147 ⁱʾ0 = this.FLD386;
        boolean z = ⁱʾ0.isEnabled();
        CLS332 ʻᵎ1 = this.FLD387;
        this.FLD387.MTH2328(z);
        this.FLD387.MTH2172(CLS133.MTH2099("enable"));
        String s = CLS133.MTH2099("label");
        CLS339 יﹳ0 = this.FLD388;
        this.FLD388.MTH2172(s);
        String s1 = ⁱʾ0.getText();
        this.FLD388.MTH2409(s1);
        String s2 = CLS133.MTH2099("action");
        CLS339 יﹳ1 = this.FLD385;
        יﹳ1.MTH2172(s2);
        יﹳ1.MTH2409(ⁱʾ0.MTH2186());
        Activity activity0 = this.FLD390;
        CLS338 יᐧ0 = new CLS338(activity0);
        CLS345 ﹳˊ0 = new CLS345(activity0);
        CLS106 ٴـ0 = this.FLD389;
        if(ⁱʾ0 instanceof CLS290) {
            ٴـ0.MTH1842(CLS133.MTH2099("menu_header"), "menu_header");
        }
        ٴـ0.MTH1842(CLS133.MTH2099("tab_main"), "tab_main");
        ٴـ0.MTH1842(CLS133.MTH2099("tab_contacts"), "tab_contacts");
        ٴـ0.MTH1842(CLS133.MTH2099("tab_discover"), "tab_discover");
        ٴـ0.MTH1842(CLS133.MTH2099("tab_me"), "tab_me");
        ٴـ0.MTH1842(CLS133.MTH2099("search"), "search");
        ٴـ0.MTH1842(CLS133.MTH2099("timeline"), "timeline");
        ٴـ0.MTH1842(CLS133.MTH2099("scan"), "scan");
        ٴـ0.MTH1842(CLS133.MTH2099("addfriend"), "addfriend");
        ٴـ0.MTH1842(CLS133.MTH2099("wallet"), "wallet");
        ٴـ0.MTH1842(CLS133.MTH2099("start_groupchat"), "groupchat");
        ٴـ0.MTH1842(CLS133.MTH2099("favorite"), "favorite");
        if(!TextUtils.isEmpty(CLS133.MTH2115("AppBrandLauncherUI"))) {
            ٴـ0.MTH1842(CLS133.MTH2099("appbrand"), "appbrand");
        }
        ٴـ0.MTH1842(CLS133.MTH2099("walletcoin"), "walletcoin");
        ٴـ0.MTH1842(CLS133.MTH2099("appname"), "wexposed");
        ٴـ0.MTH1842(CLS133.MTH2099("custom"), "custom");
        ٴـ0.MTH1842(CLS133.MTH2099("settings"), "settings");
        ٴـ0.MTH1842(CLS133.MTH2099("nearbyfriends"), "nearbyfriends");
        ٴـ0.MTH1842(CLS133.MTH2099("shake"), "shake");
        ٴـ0.MTH1842(CLS133.MTH2099("snsuser"), "snsuser");
        ٴـ0.MTH1842(CLS133.MTH2099("emojistore"), "emoji");
        ٴـ0.MTH1842(CLS133.MTH2099("gamecenterui"), "gamecenterui");
        if(!TextUtils.isEmpty(CLS133.MTH2115("FTSSOSHomeWebViewUI"))) {
            ٴـ0.MTH1842(CLS133.MTH2099("ftssearch"), "ftssearch");
        }
        if(!CLS15.MTH1077(0xFFFFD5CA2B3CF2B7L)) {
            ٴـ0.MTH1842(CLS133.MTH2099("topstories"), "topstories");
        }
        if(!CLS15.MTH1077(0xFFFFD5A52B3CF2B7L)) {
            ٴـ0.MTH1842(CLS133.MTH2099("qrcode"), "qrcode");
        }
        if(!CLS15.MTH1077(0xFFFFD58A2B3CF2B7L)) {
            ٴـ0.MTH1842(CLS133.MTH2099("switch_account"), "switch_account");
        }
        if(!CLS15.MTH1077(0xFFFFD5542B3CF2B7L)) {
            ٴـ0.MTH1842(CLS133.MTH2099("video_channel_tag"), "video_channels");
        }
        if(!CLS15.MTH1077(-47149425560905L)) {
            ٴـ0.MTH1842(CLS133.MTH2099("live_stream_tag"), "live_stream");
        }
        ٴـ0.MTH1842(CLS133.MTH2099("drawer_toggle"), "drawer_toggle");
        CLS123 ʾᵢ0 = CLS123.FLD912;
        Object[] arr_object = new Object[0];
        if(ʾᵢ0.FLD908 == null) {
        label_74:
            arrayList0 = ʾᵢ0.MTH1998("plus.options", arr_object);
        }
        else {
            Method method0 = ʾᵢ0.MTH2008("gd2");
            if(method0 == null) {
                Method method1 = ʾᵢ0.MTH2008("gd");
                if(method1 != null) {
                    try {
                        arrayList0 = (ArrayList)method1.invoke(ʾᵢ0.FLD908, "plus.options", arr_object);
                        goto label_75;
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                goto label_74;
            }
            else {
                arrayList0 = new ArrayList();
                try {
                    arrayList0.addAll(((ArrayList)method0.invoke(ʾᵢ0.FLD908, "themes", "plus.options", arr_object)));
                }
                catch(Throwable unused_ex) {
                }
                arrayList0.addAll(ʾᵢ0.MTH1998("plus.options", arr_object));
            }
        }
    label_75:
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                String s3 = (String)((Pair)object0).second;
                if(s3.contains("#")) {
                    s3 = s3.substring(0, s3.lastIndexOf("#"));
                }
                ٴـ0.MTH1842(CLS133.MTH2099("wx_shortcut_cmd") + ((String)((Pair)object0).first), "wx_" + s3);
            }
        }
        ArrayList arrayList1 = new ArrayList(((HashMap)ٴـ0.FLD790).keySet());
        Collections.sort(arrayList1);
        CLS258 ⁱי0 = new CLS258(ٴـ0, יﹳ1, יᐧ0, ﹳˊ0, ʻᵎ0);
        CLS181 ⁱᵔ0 = new CLS181(this.FLD381.FLD1139, ((CLS176)ⁱי0));
        this.FLD381.FLD1139.FLD1257.setOnItemSelectedListener(ⁱᵔ0);
        this.FLD381.MTH2364(arrayList1);
        String s4 = ⁱʾ0.MTH2191();
        String s5 = (String)((HashMap)ٴـ0.FLD789).get(s4);
        this.FLD381.FLD1139.MTH2445(s5);
        ImageView imageView0 = new ImageView(activity0);
        CLS335 ˉᐧ0 = this.FLD381;
        CLS199 ˊˏ0 = new CLS199(arr_s, ʻᵎ0, arr_s1, imageView0, 2);
        יᐧ0.MTH2172(CLS133.MTH2099("select_icon"));
        יᐧ0.MTH2400(new CLS157(ˎﾞ0, arr_s, ˊˏ0, 5));
        ʻᵎ0.MTH2172(CLS133.MTH2099("colorizeIcon"));
        ʻᵎ0.MTH2328(ⁱʾ0.MTH2184());
        ʻᵎ0.MTH2327(new CLS19(ˊˏ0, 28));
        ﹳˊ0.MTH2172(CLS133.MTH2099("setIconColor"));
        ﹳˊ0.FLD1310 = "#FFFFFF";
        ﹳˊ0.MTH2493(arr_s1[0]);
        ﹳˊ0.FLD1303 = new CLS235(arr_s1, ((CLS143)ˊˏ0), 1);
        ﹳˊ0.FLD1309 = true;
        if(TextUtils.isEmpty(ⁱʾ0.MTH2191()) || !ⁱʾ0.MTH2191().equals("custom")) {
            CLS43.MTH1431(true, new CLS145[]{יﹳ1});
        }
        if(ⁱʾ0.MTH2191().equals("menu_header")) {
            CLS43.MTH1431(true, new CLS145[]{יᐧ0, ʻᵎ0, ﹳˊ0});
        }
        CLS344 ⁱˉ0 = new CLS344(activity0);
        ⁱˉ0.MTH2481(new Object[]{ʻᵎ1, יﹳ0, ˉᐧ0, יﹳ1});
        ⁱˉ0.MTH2475(linearLayout0, v);
        CLS341 ᵔˉ0 = new CLS341(activity0);
        ᵔˉ0.FLD1272.add(imageView0);
        ᵔˉ0.FLD1275 = true;
        CLS344 ⁱˉ1 = new CLS344(activity0);
        ⁱˉ1.MTH2481(new Object[]{יᐧ0, ᵔˉ0, ʻᵎ0, ﹳˊ0});
        ⁱˉ1.MTH2475(linearLayout0, v);
        ˊˏ0.MTH2169();
    }
}

