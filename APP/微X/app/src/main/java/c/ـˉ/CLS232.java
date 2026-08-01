// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.ʽـ.CLS49;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS102;
import c.ˋﹳ.CLS106;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS108;
import c.ˋﹳ.CLS109;
import c.ˋﹳ.CLS111;
import c.ˋﹳ.CLS112;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.ٴˈ.CLS291;
import c.ٴˈ.CLS790;
import c.ٴˈ.CLS797.CLS289;
import c.ٴˈ.CLS797;
import java.io.File;

public class CLS232 {
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH3537(CLS790 ʿˊ0, int v, int v1) [...]

    // 此方法包含解密的字符串
    public static void MTH3539(Activity activity0, CLS111 ᴵⁱ0, String s, String s1, int v) {
        if(TextUtils.isEmpty(s)) {
            if(ᴵⁱ0 != null) {
                ᴵⁱ0.MTH2286();
            }
            return;
        }
        AlertDialog[] arr_alertDialog = new AlertDialog[1];
        arr_alertDialog[0] = CLS258.MTH3793(activity0, "", ((CLS112)new CLS755(activity0, s, s1, arr_alertDialog, ᴵⁱ0, v)), ᴵⁱ0);
    }

    // 去混淆评级： 中等(93)
    // 此方法包含解密的字符串
    public static void MTH3540(Activity activity0, String s) {
        public class CLS747 implements CLS111 {
            public CLS747() {
                super();
            }

            // 此方法包含解密的字符串
            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                try {
                    CLS95.MTH2031().MTH2739("\uD8E3afe_mode");
                    CLS95.MTH2031().MTH2739("\uD8E3afe_mode_cnt");
                    CLS95.MTH2023();
                    CLS257.MTH3710();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }


        public class CLS748 implements CLS111 {
            public CLS748() {
                super();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                CLS95.MTH2023();
                CLS257.MTH3710();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        String s1 = "\uD8E3ore ver. \uD8E32\uD8E3(" + 209 + "\uD8E3 " + CLS102.MTH2175();
        CLS102.MTH2185(activity0, "\uD8E3odule load error", "重置模块\nReset module\uD8E3", s1, s, ((CLS111)new CLS748()), ((CLS106)new CLS705(activity0, s)), ((CLS109)new CLS708(activity0, s, s1)));
    }

    // 此方法包含解密的字符串
    public static void MTH3542(Activity activity0, String s, Object object0) {
        switch(((String)object0).hashCode()) {
            case -619200676: {
                if(((String)object0).equals("\uD8E3eset_module")) {
                    CLS258.MTH3764(activity0, "", "", "", ((CLS111)new CLS747()));
                    return;
                }
                break;
            }
            case 0x89A17E0: {
                if(((String)object0).equals("\uD8E3heck_update")) {
                    CLS261.MTH3881().MTH3898(true);
                    CLS261.MTH3881().MTH3858(true);
                    return;
                }
                break;
            }
            case 209506906: {
                if(((String)object0).equals("\uD8E3xport_err")) {
                    File file0 = new File(activity0.getCacheDir(), "\uD8E3exposed_settings_err.txt");
                    if(!TextUtils.isEmpty(CLS262.MTH4036(file0, s))) {
                        CLS262.MTH4066(file0);
                        return;
                    }
                    CLS224.MTH3482(activity0, "无法导出 (Unable to write to file)");
                    return;
                }
                break;
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH3543(Activity activity0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(s.startsWith("\uD8E3 ")) {
            String[] arr_s = s.split("\uD8E3");
            if(arr_s.length > 2) {
                CLS261.MTH3881().MTH3898(true);
                String s1 = arr_s[1];
                switch(s1.hashCode()) {
                    case 107141: {
                        if(s1.equals("\uD8E3ib")) {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadLib", new Object[0]);
                        }
                        else {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                        }
                        break;
                    }
                    case 0x2EAF9F: {
                        if(s1.equals("\uD8E3ore")) {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadCore", new Object[0]);
                        }
                        else {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                        }
                        break;
                    }
                    default: {
                        CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                    }
                }
                CLS224.MTH3482(activity0, "\uD8E3ownload " + arr_s[1]);
            }
        }
        else if(s.startsWith("\uD8E3xid")) {
            CLS224.MTH3482(activity0, "\uD8E3xid: " + CLS95.MTH2014());
        }
    }

    // 检测为 Lambda 实现
    public static void MTH3544(String s, AlertDialog[] arr_alertDialog, CLS111 ᴵⁱ0, View view0) [...]

    public static void MTH3546(CLS790 ʿˊ0, int v, int v1) {
        CLS144.MTH2583().MTH2604(((CLS142)() -> // 此方法包含解密的字符串
        ʿˊ0.MTH4210("" + (v - v1))));
    }

    // 此方法包含解密的字符串
    public static void MTH3547(Activity activity0, CLS111 ᴵⁱ0) {
        long v;
        if(CLS102.MTH2161()) {
            v = 0xFFFFD7A009FFCF7EL;
        }
        else if(CLS246.MTH3660()) {
            v = 0xFFFFD78709FFCF7EL;
        }
        else {
            v = CLS102.MTH2174() ? 0xFFFFD76A09FFCF7EL : 0xFFFFD75009FFCF7EL;
        }
        CLS232.MTH3539(activity0, ᴵⁱ0, CLS95.MTH2000(CLS49.MTH1006(v)), "\uD8E3isclaimer_disable", 30);
    }

    // 此方法包含解密的字符串
    public static void MTH3548(Activity activity0, String s, String s1, String s2) {
        if(s2.startsWith("\uD8E3 ")) {
            String[] arr_s = s2.split("\uD8E3");
            if(arr_s.length > 2) {
                CLS261.MTH3881().MTH3898(true);
                String s3 = arr_s[1];
                switch(s3.hashCode()) {
                    case 107141: {
                        if(s3.equals("\uD8E3ib")) {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadLib", new Object[0]);
                        }
                        else {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                        }
                        break;
                    }
                    case 0x2EAF9F: {
                        if(s3.equals("\uD8E3ore")) {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadCore", new Object[0]);
                        }
                        else {
                            CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                        }
                        break;
                    }
                    default: {
                        CLS213.MTH3304().MTH3330("\uD8E3ore", "\uD8E3ownloadFeaturePack", new Object[]{arr_s[1]});
                    }
                }
                s = "\uD8E3ownload " + arr_s[1];
                CLS224.MTH3482(activity0, s);
            }
        }
        else {
            boolean z = false;
            if(s2.startsWith("\uD8E3xid")) {
                z = true;
                s = "\uD8E3xid: " + CLS95.MTH2014();
            }
            else if(s2.startsWith("\uD8E3rr")) {
                z = true;
                File file0 = new File(activity0.getCacheDir(), "\uD8E3exposed_settings_err.txt");
                if(!TextUtils.isEmpty(CLS262.MTH4036(file0, s))) {
                    CLS262.MTH4066(file0);
                    return;
                }
            }
            if(z) {
                CLS224.MTH3482(activity0, s);
                return;
            }
            if(s2.startsWith("\uD8E3er")) {
                CLS224.MTH3482(activity0, s1);
            }
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH3549(CLS790 ʿˊ0) [...]

    // 此方法包含解密的字符串
    public static void MTH3552(Activity activity0, String s, String s1, AlertDialog[] arr_alertDialog, CLS111 ᴵⁱ0, int v, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS790 ʿˊ0 = new CLS790(activity0);
        ʿˊ0.MTH4208(s);
        ʿˊ0.MTH4209(linearLayout0, true);
        CLS790 ʿˊ1 = new CLS790(activity0);
        ʿˊ1.MTH4208("");
        ʿˊ1.MTH4211((View view0) -> {
            CLS95.MTH2031().MTH2749(s1, Boolean.TRUE);
            arr_alertDialog[0].dismiss();
            ᴵⁱ0.MTH2286();
        });
        ʿˊ1.MTH4209(linearLayout0, true);
        ʿˊ1.MTH4206();
        CLS224.MTH3465(1000L, v, ((CLS223)new CLS776(ʿˊ1, v)), ((CLS107)new CLS758(ʿˊ1)));
    }

    // 此方法包含解密的字符串
    public static void MTH3553() {
        CLS95.MTH2031().MTH2739("\uD8E3afe_mode");
        CLS95.MTH2031().MTH2739("\uD8E3afe_mode_cnt");
        CLS257.MTH3710();
    }

    public static void MTH3555() {
        CLS261.MTH3881().MTH3858(true);
    }

    public static void MTH3556(CLS790 ʿˊ0) {
        CLS144.MTH2583().MTH2604(((CLS142)() -> // 此方法包含解密的字符串
        {
            ʿˊ0.MTH4210("");
            ʿˊ0.MTH4212();
        }));
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static void MTH3558(Activity activity0) {
        CLS258.MTH3764(activity0, "", "", "", ((CLS111)new CLS749()));
    }

    public static AlertDialog MTH3562(Activity activity0, String s, String s1) {
        public class CLS749 implements CLS111 {
            public CLS749() {
                super();
            }

            // 此方法包含解密的字符串
            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                try {
                    CLS95.MTH2031().MTH2739("\uD8E3afe_mode");
                    CLS95.MTH2031().MTH2739("\uD8E3afe_mode_cnt");
                    CLS95.MTH2023();
                    CLS257.MTH3710();
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
            }
        }

        return CLS258.MTH3758(activity0, s, ((CLS112)new CLS781(activity0, s1)));
    }

    // 此方法包含解密的字符串
    public static void MTH3563(Activity activity0, String s, Object[] arr_object) {
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS291 ᵔﹶ0 = new CLS291(activity0, linearLayout0, menu0);
        ᵔﹶ0.MTH4331("\uD8E3heck_update", ((CLS107)new CLS734())).MTH4331("\uD8E3eset_module", ((CLS107)new CLS777(activity0))).MTH4331("\uD8E3estart_wechat", ((CLS107)new CLS745()));
        ᵔﹶ0.MTH4328();
        TextView textView0 = new TextView(activity0);
        textView0.setText(s);
        textView0.setTextSize(30.0f);
        textView0.setGravity(17);
        textView0.setTextColor(CLS172.MTH3033());
        CLS258.MTH3778(linearLayout0, textView0, true);
        CLS797 ٴˑ0 = new CLS797(activity0);
        ٴˑ0.MTH4306(1);
        ٴˑ0.MTH4302(((CLS289)new CLS759(activity0)));
        CLS258.MTH3813(linearLayout0, ((CLS108)ٴˑ0), true);
    }
}

