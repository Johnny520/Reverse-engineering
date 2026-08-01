// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.יﹳ.CLS166;
import java.util.HashMap;

public final class CLS522 {
    public static final HashMap FLD5107;

    static {
        CLS522.FLD5107 = new HashMap();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH7107() {
        return CLS522.MTH7114() ? CLS522.MTH7111() : CLS522.MTH7115("toolbar_overflowicon_color", "000000");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH7108() {
        return CLS522.MTH7114() ? Color.parseColor("#191919") : Color.parseColor("#EDEDED");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH7109() {
        return CLS522.MTH7114() ? Color.parseColor("#C6C6C6") : Color.parseColor("#1A1A1A");
    }

    // 此方法包含解密的字符串
    public static int MTH7110(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return 0;
            }
            s = s.trim();
            String s1 = s.startsWith("#") ? s : "#" + s;
            HashMap hashMap0 = CLS522.FLD5107;
            if(hashMap0.containsKey(s1)) {
                return (int)(((Integer)hashMap0.get(s1)));
            }
            int v = Color.parseColor(s1);
            hashMap0.put(s1, v);
            return v;
        }
        catch(Throwable throwable0) {
            CLS27.MTH906(s);
            CLS27.MTH893(throwable0);
            return 0;
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH7111() {
        return CLS522.MTH7114() ? CLS522.MTH7109() : CLS522.MTH7115("toolbar_text_color", "000000");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static int MTH7112() {
        return Color.parseColor("#FFC300");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH7113(int v) {
        return String.format("#%06X", v);
    }

    // 此方法包含解密的字符串
    public static boolean MTH7114() {
        boolean z;
        if(CLS27.MTH895().MTH938("disable_darkmode_check", false)) {
            return false;
        }
        Object object0 = CLS40.FLD157.FLD155.MTH1744("darkmode");
        if(object0 != null) {
            return ((Boolean)object0).booleanValue();
        }
        try {
            Class class0 = CLS27.MTH894("UIUtilsClass");
            if(class0 == null) {
                z = false;
            }
            else if(!((Boolean)CLS166.MTH3192(class0, CLS27.MTH897("UIUtilsIsDarkMethod1"), new Object[0])).booleanValue()) {
                Activity activity0 = CLS404.MTH5893();
                z = activity0 == null || !((Boolean)CLS166.MTH3192(class0, CLS27.MTH897("UIUtilsIsDarkMethod2"), new Object[]{activity0.getResources()})).booleanValue() ? false : true;
            }
            else {
                z = true;
            }
        }
        catch(Throwable unused_ex) {
            z = false;
        }
        if(z) {
            CLS40.FLD157.MTH1119(5000L, Boolean.TRUE, "darkmode");
            return true;
        }
        if(CLS27.MTH895().MTH938("force_darkmode", false) && CLS27.MTH895().MTH938("darkmode_follow_time", false)) {
            boolean z1 = CLS481.MTH6697(CLS27.MTH895().MTH925("darkmode_timeframe", ""));
            CLS40.FLD157.MTH1119(5000L, Boolean.valueOf(z1), "darkmode");
            return z1;
        }
        try {
            Activity activity1 = CLS404.MTH5893();
            if(activity1 == null) {
                CLS40.FLD157.MTH1119(5000L, Boolean.FALSE, "darkmode");
                return false;
            }
            if(new TextView(activity1).getCurrentTextColor() == 0xB3FFFFFF) {
                CLS40.FLD157.MTH1119(5000L, Boolean.TRUE, "darkmode");
                return true;
            }
            goto label_29;
        }
        catch(Throwable unused_ex) {
        label_29:
            CLS40.FLD157.MTH1119(5000L, Boolean.FALSE, "darkmode");
            return false;
        }
    }

    public static int MTH7115(String s, String s1) {
        return CLS522.MTH7110(CLS27.MTH895().MTH925(s, s1));
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH7116() {
        return CLS522.MTH7114() ? Color.parseColor("#656565") : Color.parseColor("#BBBBBB");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH7117() {
        return CLS522.MTH7114() ? Color.parseColor("#616161") : Color.parseColor("#B6B6B6");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static int MTH7118() {
        return CLS522.MTH7114() ? Color.parseColor("#232323") : -1;
    }
}

