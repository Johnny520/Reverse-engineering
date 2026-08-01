// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;
import c.ˆˆ.CLS65;
import c.ˈⁱ.CLS95;
import c.יᴵ.CLS144;
import java.util.HashMap;

public class CLS172 {
    public static final HashMap FLD849;

    static {
        CLS172.FLD849 = new HashMap();
    }

    public static int MTH3027(String s, String s1) {
        return CLS172.MTH3030(CLS95.MTH2031().MTH2733(s, s1));
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3028() {
        return CLS172.MTH3035() ? CLS172.MTH3033() : CLS172.MTH3027("\uD8E3oolbar_text_color", "\uD8E300000");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3029() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E3666666") : Color.parseColor("\uD8E37D7D7D");
    }

    // 此方法包含解密的字符串
    public static int MTH3030(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return 0;
            }
            s = s.trim();
            String s1 = s.startsWith("\uD8E3") ? s : "\uD8E3" + s;
            HashMap hashMap0 = CLS172.FLD849;
            if(hashMap0.containsKey(s1)) {
                return (int)(((Integer)hashMap0.get(s1)));
            }
            int v = Color.parseColor(s1);
            hashMap0.put(s1, v);
            return v;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3252(s);
            CLS204.MTH3257(throwable0);
            return 0;
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3031() {
        return CLS172.MTH3035() ? CLS172.MTH3028() : CLS172.MTH3027("\uD8E3oolbar_overflowicon_color", "\uD8E300000");
    }

    // 此方法包含解密的字符串
    public static boolean MTH3032() {
        if(CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_system", false)) {
            try {
                Activity activity0 = (Activity)CLS213.MTH3304().MTH3298("\uD8E3etLauncherUI", new Object[0]);
                if(activity0 == null) {
                    activity0 = (Activity)CLS213.MTH3304().MTH3298("\uD8E3etCurrentActivity", new Object[0]);
                }
                if(activity0 == null) {
                    return CLS257.MTH3726(((Context)CLS213.MTH3304().MTH3298("\uD8E3etContext", new Object[0])));
                }
                if(new TextView(activity0).getCurrentTextColor() == 0xB3FFFFFF) {
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3033() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E3C6C6C6") : Color.parseColor("\uD8E31A1A1A");
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public static int MTH3034() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E3232323") : CLS172.MTH3027("\uD8E3oolbar_color", "\uD8E3DEDED");
    }

    // 此方法包含解密的字符串
    public static boolean MTH3035() {
        try {
            if(CLS95.MTH2031().MTH2725("\uD8E3isable_darkmode_check", false)) {
                return false;
            }
            goto label_4;
        }
        catch(Throwable throwable0) {
            try {
                CLS204.MTH3257(throwable0);
            label_4:
                Object object0 = CLS144.MTH2583().MTH2596("\uD8E3arkmode");
                if(object0 != null) {
                    return ((Boolean)object0).booleanValue();
                }
                if(CLS65.MTH1214()) {
                    CLS144.MTH2583().MTH2598("\uD8E3arkmode", Boolean.TRUE, 5000L);
                    return true;
                }
                try {
                    if(CLS95.MTH2031().MTH2725("\uD8E3orce_darkmode", false) && CLS95.MTH2031().MTH2725("\uD8E3arkmode_follow_time", false)) {
                        boolean z = CLS259.MTH3819(CLS95.MTH2031().MTH2733("\uD8E3arkmode_timeframe", ""));
                        CLS144.MTH2583().MTH2598("\uD8E3arkmode", Boolean.valueOf(z), 5000L);
                        return z;
                    }
                }
                catch(Throwable throwable2) {
                    CLS204.MTH3257(throwable2);
                }
                try {
                    Activity activity0 = (Activity)CLS213.MTH3304().MTH3316("\uD8E3etLauncherUI", new Object[0]);
                    if(activity0 == null) {
                        CLS144.MTH2583().MTH2598("\uD8E3arkmode", Boolean.FALSE, 5000L);
                        return false;
                    }
                    if(new TextView(activity0).getCurrentTextColor() == 0xB3FFFFFF) {
                        CLS144.MTH2583().MTH2598("\uD8E3arkmode", Boolean.TRUE, 5000L);
                        return true;
                    }
                }
                catch(Throwable unused_ex) {
                }
                CLS144.MTH2583().MTH2598("\uD8E3arkmode", Boolean.FALSE, 5000L);
                return false;
            }
            catch(Throwable throwable1) {
            }
        }
        CLS204.MTH3257(throwable1);
        return false;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3036() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E3656565") : Color.parseColor("\uD8E3BBBBBB");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3037() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E3616161") : Color.parseColor("\uD8E3B6B6B6");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3038() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E3191919") : Color.parseColor("\uD8E3EDEDED");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static int MTH3039() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E3232323") : -1;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH3040() {
        return CLS172.MTH3035() ? Color.parseColor("\uD8E32D2D2D") : Color.parseColor("\uD8E3F7F7F7");
    }
}

