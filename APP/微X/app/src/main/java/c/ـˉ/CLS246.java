// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS102;
import c.ˋˑ.CLS104;
import c.יᴵ.CLS144;
import java.util.HashSet;

public class CLS246 {
    public static String FLD1066;

    // 去混淆评级： 中等(55)
    // 此方法包含解密的字符串
    public static String MTH3655() {
        try {
            boolean z = CLS224.MTH3441() || !CLS246.MTH3660() && CLS261.MTH3881().MTH4017() != 9005 && !CLS261.MTH3881().MTH3996();
            CLS200 ˈʽ0 = CLS200.MTH3224();
            if(ˈʽ0.MTH3240() || ˈʽ0.MTH3230("\uD8E3emove_notice")) {
                return "";
            }
            if(CLS102.MTH2161()) {
                return "\uD8E3b>\uD8E3/b>";
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return "";
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public static String MTH3656() {
        return CLS224.MTH3441() ? "" : CLS95.MTH2031().MTH2733("\uD8E3x_settings_name", "");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Activity MTH3657() {
        return (Activity)CLS213.MTH3304().MTH3316("\uD8E3etCurrentActivity", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static String MTH3658() {
        if(!TextUtils.isEmpty(CLS246.FLD1066)) {
            return CLS246.FLD1066;
        }
        String s = ((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3516() + "\uD8E3" + CLS95.MTH1982(90, new Object[0]) + "\uD8E3" + "\uD8E32";
        CLS246.FLD1066 = s;
        return s;
    }

    // 此方法包含解密的字符串
    public static boolean MTH3659() {
        if(CLS224.MTH3441()) {
            HashSet hashSet0 = new HashSet();
            for(int v = 0; v < 1; ++v) {
                hashSet0.add(new String[]{""}[v].trim().toLowerCase());
            }
            return hashSet0.contains(Build.MODEL.toLowerCase());
        }
        return false;
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public static boolean MTH3660() {
        return CLS102.MTH2153() && !CLS200.MTH3224().MTH3225() && (CLS170.MTH3010("") || CLS95.MTH2031().MTH2725("\uD8E3spatch_int_pay", false));
    }

    // 去混淆评级： 中等(70)
    // 此方法包含解密的字符串
    public static boolean MTH3661(String s) {
        return !TextUtils.isEmpty(s) && (s.endsWith("\uD8E3chatroom") || CLS213.MTH3304().MTH3319("\uD8E3sChatroom", new Object[]{s}));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3662() {
        return CLS246.MTH3658() + "\uD8E3" + CLS104.MTH2238().MTH2218();
    }
}

