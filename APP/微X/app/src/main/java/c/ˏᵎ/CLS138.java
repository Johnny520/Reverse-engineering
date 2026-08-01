// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ʾˎ.CLS41;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS111;
import c.ᴵˉ.CLS283;
import c.ᴵˉ.CLS596;
import c.ᴵˉ.CLS604.CLS289;
import c.ᴵˉ.CLS604;
import c.ﹶˆ.CLS341;
import c.ﹶˆ.CLS342;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS345;
import c.ﹶˆ.CLS346;
import c.ﹶˆ.CLS347;
import java.io.File;

public class CLS138 {
    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static void MTH2069(Activity activity0) {
        CLS144.MTH2184(activity0, "", "", "", ((CLS343)new CLS490()));
    }

    public static void MTH2070() {
        CLS170.MTH2460().MTH2375(true);
    }

    public static AlertDialog MTH2073(Activity activity0, String s, String s1) {
        public class CLS490 implements CLS343 {
            public CLS490() {
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            // 此方法包含解密的字符串
            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                try {
                    CLS98.MTH1297().MTH986("safe_mode");
                    CLS98.MTH1297().MTH986("safe_mode_cnt");
                    CLS98.MTH1276();
                    CLS180.MTH2650();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        return CLS144.MTH2169(activity0, s, ((CLS342)new CLS522(activity0, s1)));
    }

    // 此方法包含解密的字符串
    public static void MTH2078(Activity activity0, String s, Object object0) {
        switch(((String)object0).hashCode()) {
            case -619200676: {
                if(((String)object0).equals("reset_module")) {
                    CLS144.MTH2184(activity0, "", "", "", ((CLS343)new CLS492()));
                    return;
                }
                break;
            }
            case 0x89A17E0: {
                if(((String)object0).equals("check_update")) {
                    CLS170.MTH2460().MTH2474(true);
                    CLS170.MTH2460().MTH2375(true);
                    return;
                }
                break;
            }
            case 209506906: {
                if(((String)object0).equals("export_err")) {
                    File file0 = new File(activity0.getCacheDir(), "wexposed_settings_err.txt");
                    if(!TextUtils.isEmpty(CLS176.MTH2599(file0, s))) {
                        CLS176.MTH2582(file0);
                        return;
                    }
                    CLS184.MTH2702(activity0, "无法导出 (Unable to write to file)");
                    return;
                }
                break;
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2081(Activity activity0, CLS343 ˋʼ0, String s, String s1, int v) {
        if(TextUtils.isEmpty(s)) {
            if(ˋʼ0 != null) {
                ˋʼ0.MTH4827();
            }
            return;
        }
        AlertDialog[] arr_alertDialog = new AlertDialog[1];
        arr_alertDialog[0] = CLS144.MTH2214(activity0, "", ((CLS342)new CLS533(activity0, s, s1, arr_alertDialog, ˋʼ0, v)), ˋʼ0);
    }

    // 检测为 Lambda 实现
    public static void MTH2082(String s, AlertDialog[] arr_alertDialog, CLS343 ˋʼ0, View view0) [...]

    // 此方法包含解密的字符串
    public static void MTH2083(Activity activity0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.startsWith("d ")) {
            String[] arr_s = s.split(" ");
            if(arr_s.length > 2) {
                CLS170.MTH2460().MTH2474(true);
                switch(arr_s[1]) {
                    case "core": {
                        CLS194.MTH2881().MTH2893("core", "downloadCore", new Object[0]);
                        break;
                    }
                    case "lib": {
                        CLS194.MTH2881().MTH2893("core", "downloadLib", new Object[0]);
                        break;
                    }
                    default: {
                        CLS194.MTH2881().MTH2893("core", "downloadFeaturePack", new Object[]{arr_s[1]});
                    }
                }
                CLS184.MTH2702(activity0, "download " + arr_s[1]);
            }
        }
        else if(s.startsWith("wxid")) {
            CLS184.MTH2702(activity0, "wxid: " + CLS98.MTH1305());
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2084(Activity activity0, String s, String s1, AlertDialog[] arr_alertDialog, CLS343 ˋʼ0, int v, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS596 ˈᴵ0 = new CLS596(activity0);
        ˈᴵ0.MTH3627(s);
        ˈᴵ0.MTH3626(linearLayout0, true);
        CLS596 ˈᴵ1 = new CLS596(activity0);
        ˈᴵ1.MTH3627("");
        ˈᴵ1.MTH3631((View view0) -> {
            CLS98.MTH1297().MTH984(s1, Boolean.TRUE);
            arr_alertDialog[0].dismiss();
            ˋʼ0.MTH4827();
        });
        ˈᴵ1.MTH3626(linearLayout0, true);
        ˈᴵ1.MTH3628();
        CLS184.MTH2697(1000L, v, ((CLS181)new CLS561(ˈᴵ1, v)), ((CLS345)new CLS538(ˈᴵ1)));
    }

    // 此方法包含解密的字符串
    public static void MTH2085() {
        CLS98.MTH1297().MTH986("safe_mode");
        CLS98.MTH1297().MTH986("safe_mode_cnt");
        CLS180.MTH2650();
    }

    // 去混淆评级： 中等(93)
    // 此方法包含解密的字符串
    public static void MTH2086(Activity activity0, String s) {
        public class CLS491 implements CLS343 {
            public CLS491() {
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                CLS98.MTH1276();
                CLS180.MTH2650();
            }
        }


        public class CLS492 implements CLS343 {
            public CLS492() {
                super();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
            }

            // 此方法包含解密的字符串
            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                try {
                    CLS98.MTH1297().MTH986("safe_mode");
                    CLS98.MTH1297().MTH986("safe_mode_cnt");
                    CLS98.MTH1276();
                    CLS180.MTH2650();
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }

        String s1 = "core ver. 42 (" + 0xD4 + ") " + CLS111.MTH1589();
        CLS111.MTH1577(activity0, "Module load error", "重置模块\nReset module?", s1, s, ((CLS343)new CLS491()), ((CLS347)new CLS485(activity0, s)), ((CLS346)new CLS526(activity0, s, s1)));
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH2087(CLS596 ˈᴵ0) [...]

    // 此方法包含解密的字符串
    public static void MTH2088(Activity activity0, CLS343 ˋʼ0) {
        long v;
        if(CLS111.MTH1565()) {
            v = -247200436550792L;
        }
        else if(CLS179.MTH2614()) {
            v = 0xFFFF1F0B29CA8378L;
        }
        else {
            v = CLS111.MTH1578() ? 0xFFFF1FE629CA8378L : 0xFFFF1FDC29CA8378L;
        }
        CLS138.MTH2081(activity0, ˋʼ0, CLS98.MTH1302(CLS41.MTH858(v)), "disclaimer_disable", 30);
    }

    // 此方法包含解密的字符串
    public static void MTH2089(Activity activity0, String s, Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS283 ˉˎ0 = new CLS283(activity0, linearLayout0, menu0);
        ˉˎ0.MTH3648("check_update", ((CLS345)new CLS547())).MTH3648("reset_module", ((CLS345)new CLS501(activity0))).MTH3648("restart_wechat", ((CLS345)new CLS493()));
        ˉˎ0.MTH3650();
        TextView textView0 = new TextView(activity0);
        textView0.setText(s);
        textView0.setTextSize(30.0f);
        textView0.setGravity(17);
        textView0.setTextColor(CLS226.MTH3099());
        CLS144.MTH2209(linearLayout0, textView0, true);
        CLS604 ﾞʿ0 = new CLS604(activity0);
        ﾞʿ0.MTH3732(1);
        ﾞʿ0.MTH3727(((CLS289)new CLS528(activity0)));
        CLS144.MTH2191(linearLayout0, ((CLS341)ﾞʿ0), true);
    }

    public static void MTH2090(CLS596 ˈᴵ0) {
        CLS70.MTH1131().MTH1127(((CLS69)() -> // 此方法包含解密的字符串
        {
            ˈᴵ0.MTH3633("");
            ˈᴵ0.MTH3630();
        }));
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH2091(CLS596 ˈᴵ0, int v, int v1) [...]

    public static void MTH2095(CLS596 ˈᴵ0, int v, int v1) {
        CLS70.MTH1131().MTH1127(((CLS69)() -> // 此方法包含解密的字符串
        ˈᴵ0.MTH3633("" + (v - v1))));
    }

    // 此方法包含解密的字符串
    public static void MTH2096(Activity activity0, String s, String s1, String s2) {
        if(s2.startsWith("d ")) {
            String[] arr_s = s2.split(" ");
            if(arr_s.length > 2) {
                CLS170.MTH2460().MTH2474(true);
                switch(arr_s[1]) {
                    case "core": {
                        CLS194.MTH2881().MTH2893("core", "downloadCore", new Object[0]);
                        break;
                    }
                    case "lib": {
                        CLS194.MTH2881().MTH2893("core", "downloadLib", new Object[0]);
                        break;
                    }
                    default: {
                        CLS194.MTH2881().MTH2893("core", "downloadFeaturePack", new Object[]{arr_s[1]});
                    }
                }
                s = "download " + arr_s[1];
                CLS184.MTH2702(activity0, s);
            }
        }
        else {
            boolean z = false;
            if(s2.startsWith("wxid")) {
                z = true;
                s = "wxid: " + CLS98.MTH1305();
            }
            else if(s2.startsWith("err")) {
                z = true;
                File file0 = new File(activity0.getCacheDir(), "wexposed_settings_err.txt");
                if(!TextUtils.isEmpty(CLS176.MTH2599(file0, s))) {
                    CLS176.MTH2582(file0);
                    return;
                }
            }
            if(z) {
                CLS184.MTH2702(activity0, s);
                return;
            }
            if(s2.startsWith("ver")) {
                CLS184.MTH2702(activity0, s1);
            }
        }
    }
}

