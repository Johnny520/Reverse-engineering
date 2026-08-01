// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˎﹳ.CLS107;
import c.ˏי.CLS111;
import java.util.HashSet;

public class CLS179 {
    public static String FLD752;

    // 此方法包含解密的字符串
    public static String MTH2610() {
        if(!TextUtils.isEmpty(CLS179.FLD752)) {
            return CLS179.FLD752;
        }
        String s = ((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2107() + "_" + CLS98.MTH1336(90, new Object[0]) + "." + "42";
        CLS179.FLD752 = s;
        return s;
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public static String MTH2611() {
        return CLS184.MTH2693() ? "" : CLS98.MTH1297().MTH1015("wx_settings_name", "");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH2612() {
        return CLS179.MTH2610() + " " + CLS107.MTH1479().MTH1463();
    }

    // 去混淆评级： 中等(70)
    // 此方法包含解密的字符串
    public static boolean MTH2613(String s) {
        return !TextUtils.isEmpty(s) && (s.endsWith("@chatroom") || CLS194.MTH2881().MTH2873("isChatroom", new Object[]{s}));
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public static boolean MTH2614() {
        return CLS111.MTH1580() && !CLS191.MTH2830().MTH2841() && (CLS197.MTH2927("") || CLS98.MTH1297().MTH994("lspatch_int_pay", false));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Activity MTH2615() {
        return (Activity)CLS194.MTH2881().MTH2878("getCurrentActivity", new Object[0]);
    }

    // 此方法包含解密的字符串
    public static boolean MTH2616() {
        if(CLS184.MTH2693()) {
            HashSet hashSet0 = new HashSet();
            for(int v = 0; v < 1; ++v) {
                hashSet0.add(new String[]{""}[v].trim().toLowerCase());
            }
            return hashSet0.contains(Build.MODEL.toLowerCase());
        }
        return false;
    }

    // 去混淆评级： 中等(55)
    // 此方法包含解密的字符串
    public static String MTH2617() {
        try {
            boolean z = CLS184.MTH2693() || !CLS179.MTH2614() && CLS170.MTH2460().MTH2438() != 9005 && !CLS170.MTH2460().MTH2354();
            CLS191 ـʼ0 = CLS191.MTH2830();
            if(ـʼ0.MTH2842() || ـʼ0.MTH2828("remove_notice")) {
                return "";
            }
            if(CLS111.MTH1565()) {
                return "<b></b>";
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return "";
    }
}

