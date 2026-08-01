// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ᵎʾ.CLS299;
import java.util.HashMap;

public class CLS226 {
    public static final HashMap FLD910;

    static {
        CLS226.FLD910 = new HashMap();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3098() {
        return CLS226.MTH3102() ? Color.parseColor("#656565") : Color.parseColor("#BBBBBB");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3099() {
        return CLS226.MTH3102() ? Color.parseColor("#C6C6C6") : Color.parseColor("#1A1A1A");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3100() {
        return CLS226.MTH3102() ? CLS226.MTH3099() : CLS226.MTH3111("toolbar_text_color", "000000");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3101() {
        return CLS226.MTH3102() ? Color.parseColor("#666666") : Color.parseColor("#7D7D7D");
    }

    // 此方法包含解密的字符串
    public static boolean MTH3102() {
        try {
            if(CLS98.MTH1297().MTH994("disable_darkmode_check", false)) {
                return false;
            }
            goto label_4;
        }
        catch(Throwable throwable0) {
            try {
                CLS185.MTH2708(throwable0);
            label_4:
                Object object0 = CLS70.MTH1131().MTH1148("darkmode");
                if(object0 != null) {
                    return ((Boolean)object0).booleanValue();
                }
                if(CLS299.MTH4272()) {
                    CLS70.MTH1131().MTH1140("darkmode", Boolean.TRUE, 5000L);
                    return true;
                }
                try {
                    if(CLS98.MTH1297().MTH994("force_darkmode", false) && CLS98.MTH1297().MTH994("darkmode_follow_time", false)) {
                        boolean z = CLS205.MTH2973(CLS98.MTH1297().MTH1015("darkmode_timeframe", ""));
                        CLS70.MTH1131().MTH1140("darkmode", Boolean.valueOf(z), 5000L);
                        return z;
                    }
                }
                catch(Throwable throwable2) {
                    CLS185.MTH2708(throwable2);
                }
                try {
                    Activity activity0 = (Activity)CLS194.MTH2881().MTH2878("getLauncherUI", new Object[0]);
                    if(activity0 == null) {
                        CLS70.MTH1131().MTH1140("darkmode", Boolean.FALSE, 5000L);
                        return false;
                    }
                    if(new TextView(activity0).getCurrentTextColor() == 0xB3FFFFFF) {
                        CLS70.MTH1131().MTH1140("darkmode", Boolean.TRUE, 5000L);
                        return true;
                    }
                }
                catch(Throwable unused_ex) {
                }
                CLS70.MTH1131().MTH1140("darkmode", Boolean.FALSE, 5000L);
                return false;
            }
            catch(Throwable throwable1) {
            }
        }
        CLS185.MTH2708(throwable1);
        return false;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3103() {
        return CLS226.MTH3102() ? Color.parseColor("#2D2D2D") : Color.parseColor("#F7F7F7");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3104() {
        return CLS226.MTH3102() ? CLS226.MTH3100() : CLS226.MTH3111("toolbar_overflowicon_color", "000000");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static int MTH3105() {
        return CLS226.MTH3102() ? Color.parseColor("#232323") : -1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH3106() {
        if(CLS98.MTH1297().MTH994("darkmode_follow_system", false)) {
            try {
                Activity activity0 = (Activity)CLS194.MTH2881().MTH2876("getLauncherUI", new Object[0]);
                if(activity0 == null) {
                    activity0 = (Activity)CLS194.MTH2881().MTH2876("getCurrentActivity", new Object[0]);
                }
                if(activity0 == null) {
                    return CLS180.MTH2652(((Context)CLS194.MTH2881().MTH2876("getContext", new Object[0])));
                }
                if(new TextView(activity0).getCurrentTextColor() == 0xB3FFFFFF) {
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3107() {
        return CLS226.MTH3102() ? Color.parseColor("#191919") : Color.parseColor("#EDEDED");
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public static int MTH3108() {
        return CLS226.MTH3102() ? Color.parseColor("#232323") : CLS226.MTH3111("toolbar_color", "EDEDED");
    }

    // 此方法包含解密的字符串
    public static int MTH3109(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return 0;
            }
            s = s.trim();
            String s1 = s.startsWith("#") ? s : "#" + s;
            HashMap hashMap0 = CLS226.FLD910;
            if(hashMap0.containsKey(s1)) {
                return (int)(((Integer)hashMap0.get(s1)));
            }
            int v = Color.parseColor(s1);
            hashMap0.put(s1, v);
            return v;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2711(s);
            CLS185.MTH2708(throwable0);
            return 0;
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3110() {
        return CLS226.MTH3102() ? Color.parseColor("#616161") : Color.parseColor("#B6B6B6");
    }

    public static int MTH3111(String s, String s1) {
        return CLS226.MTH3109(CLS98.MTH1297().MTH1015(s, s1));
    }
}

