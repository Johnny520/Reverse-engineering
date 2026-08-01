// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import t.ʻˑ.CLS3;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137;

public final class CLS46 {
    public static final HashMap FLD496;
    public static final HashMap FLD497;

    static {
        CLS46.FLD496 = new HashMap();
        CLS46.FLD497 = new HashMap();
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH1444() {
        return CLS46.MTH1455() ? Color.parseColor("#616161") : Color.parseColor("#B6B6B6");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static int MTH1445() {
        return Color.parseColor("#FFC300");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static int MTH1446() {
        return CLS46.MTH1455() ? Color.parseColor("#232323") : -1;
    }

    // 此方法包含解密的字符串
    public static int MTH1447(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return 0;
            }
            s = s.trim();
            String s1 = s.startsWith("#") ? s : "#" + s;
            HashMap hashMap0 = CLS46.FLD496;
            if(hashMap0.containsKey(s1)) {
                return (int)(((Integer)hashMap0.get(s1)));
            }
            int v = Color.parseColor(s1);
            hashMap0.put(s1, v);
            return v;
        }
        catch(Throwable throwable0) {
            CLS133.MTH2109(s);
            CLS133.MTH2113(throwable0);
            return 0;
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH1448() {
        return CLS46.MTH1455() ? Color.parseColor("#191919") : Color.parseColor("#EDEDED");
    }

    public static int MTH1449(int v) {
        float[] arr_f = new float[3];
        Color.colorToHSV(v, arr_f);
        arr_f[2] *= 0.95f;
        return Color.HSVToColor(arr_f);
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public static int MTH1450() {
        return CLS46.MTH1455() ? CLS46.MTH1452() : CLS46.MTH1447(CLS133.MTH2103().MTH2134("toolbar_text_color", "000000"));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1451(int v) {
        return String.format("#%06X", v);
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH1452() {
        return CLS46.MTH1455() ? Color.parseColor("#C6C6C6") : Color.parseColor("#1A1A1A");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1453(int v) {
        return String.format("#%06X", ((int)(v & 0xFFFFFF)));
    }

    public static int MTH1454(int v) {
        return Color.argb(Math.round(((float)Color.alpha(v)) * 0.5f), Color.red(v), Color.green(v), Color.blue(v));
    }

    // 此方法包含解密的字符串
    public static boolean MTH1455() {
        Boolean boolean0;
        CLS137 ⁱᵔ0;
        boolean z1;
        boolean z = false;
        if(CLS133.MTH2103().MTH2131("disable_darkmode_check", false)) {
            return false;
        }
        Object object0 = CLS137.FLD972.FLD970.MTH1896("darkmode");
        if(object0 != null) {
            return ((Boolean)object0).booleanValue();
        }
        try {
            Class class0 = CLS133.MTH2111("UIUtilsClass");
            if(class0 == null) {
                z1 = false;
            }
            else if(!((Boolean)CLS3.MTH996(class0, CLS133.MTH2115("UIUtilsIsDarkMethod1"), new Object[0])).booleanValue()) {
                Activity activity0 = (Activity)CLS123.FLD912.MTH2003("getLauncherUI_themes", new Object[0]);
                z1 = activity0 == null || !((Boolean)CLS3.MTH996(class0, CLS133.MTH2115("UIUtilsIsDarkMethod2"), new Object[]{activity0.getResources()})).booleanValue() ? false : true;
            }
            else {
                z1 = true;
            }
        }
        catch(Throwable unused_ex) {
            z1 = false;
        }
        if(z1) {
            CLS137.FLD972.MTH2144("darkmode", Boolean.TRUE);
            return true;
        }
        if(!CLS133.MTH2103().MTH2131("force_darkmode", false) || !CLS133.MTH2103().MTH2131("darkmode_follow_time", false)) {
            ⁱᵔ0 = CLS137.FLD972;
            boolean0 = Boolean.FALSE;
        }
        else {
            String s = CLS133.MTH2103().MTH2134("darkmode_timeframe", "");
            try {
                if(!TextUtils.isEmpty(s)) {
                    String[] arr_s = s.split(";");
                    String[] arr_s1 = arr_s[0].split(":");
                    String[] arr_s2 = arr_s[1].split(":");
                    int v = Integer.parseInt(arr_s1[0]);
                    int v1 = Integer.parseInt(arr_s1[1]);
                    int v2 = Integer.parseInt(arr_s2[0]);
                    int v3 = Integer.parseInt(arr_s2[1]);
                    z = CLS33.MTH1353(String.format("%02d:%02d", v, v1), String.format("%02d:%02d", v2, v3));
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            ⁱᵔ0 = CLS137.FLD972;
            boolean0 = Boolean.valueOf(z);
        }
        ⁱᵔ0.MTH2144("darkmode", boolean0);
        return z;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH1456() {
        return CLS46.MTH1455() ? Color.parseColor("#2D2D2D") : Color.parseColor("#F7F7F7");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH1457() {
        return CLS46.MTH1455() ? Color.parseColor("#656565") : Color.parseColor("#BBBBBB");
    }
}

