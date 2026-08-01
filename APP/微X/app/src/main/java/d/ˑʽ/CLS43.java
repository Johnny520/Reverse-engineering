// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;
import d.ˎˏ.CLS4;
import d.יʻ.CLS62;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public final class CLS43 {
    public static final HashMap FLD228;

    static {
        CLS43.FLD228 = new HashMap();
    }

    // 此方法包含解密的字符串
    public static boolean MTH639() {
        Boolean boolean0;
        CLS68 ٴˆ0;
        String s3;
        String s2;
        boolean z1;
        boolean z = false;
        if(CLS69.MTH801().MTH748("disable_darkmode_check", false)) {
            return false;
        }
        Object object0 = CLS68.FLD326.FLD321.MTH1159("darkmode");
        if(object0 != null) {
            return ((Boolean)object0).booleanValue();
        }
        try {
            Class class0 = CLS69.MTH811("UIUtilsClass");
            if(class0 == null) {
                z1 = false;
            }
            else if(!((Boolean)CLS4.MTH385(class0, CLS69.MTH802("UIUtilsIsDarkMethod1"), new Object[0])).booleanValue()) {
                Activity activity0 = (Activity)CLS62.FLD317.MTH761("getLauncherUI", new Object[0]);
                z1 = activity0 == null || !((Boolean)CLS4.MTH385(class0, CLS69.MTH802("UIUtilsIsDarkMethod2"), new Object[]{activity0.getResources()})).booleanValue() ? false : true;
            }
            else {
                z1 = true;
            }
        }
        catch(Throwable unused_ex) {
            z1 = false;
        }
        if(z1) {
            CLS68.FLD326.MTH789("darkmode", Boolean.TRUE, 5000L);
            return true;
        }
        if(!CLS69.MTH801().MTH748("force_darkmode", false) || !CLS69.MTH801().MTH748("darkmode_follow_time", false)) {
            try {
                Activity activity1 = (Activity)CLS62.FLD317.MTH757("getLauncherUI", new Object[0]);
                if(activity1 == null) {
                    CLS68.FLD326.MTH789("darkmode", Boolean.FALSE, 5000L);
                    return false;
                }
                if(new TextView(activity1).getCurrentTextColor() == 0xB3FFFFFF) {
                    CLS68.FLD326.MTH789("darkmode", Boolean.TRUE, 5000L);
                    return true;
                }
            label_57:
                ٴˆ0 = CLS68.FLD326;
                boolean0 = Boolean.FALSE;
            }
            catch(Throwable unused_ex) {
                goto label_57;
            }
        }
        else {
            String s = CLS69.MTH801().MTH740("darkmode_timeframe", "");
            try {
                if(!TextUtils.isEmpty(s)) {
                    String[] arr_s = s.split(";");
                    String[] arr_s1 = arr_s[0].split(":");
                    String[] arr_s2 = arr_s[1].split(":");
                    int v = Integer.parseInt(arr_s1[0]);
                    int v1 = Integer.parseInt(arr_s1[1]);
                    int v2 = Integer.parseInt(arr_s2[0]);
                    int v3 = Integer.parseInt(arr_s2[1]);
                    String s1 = String.format("%02d:%02d", v, v1);
                    s2 = String.format("%02d:%02d", v2, v3);
                    Calendar calendar0 = Calendar.getInstance();
                    s3 = new SimpleDateFormat("HH:mm").format(calendar0.getTime());
                    int v4 = s3.compareTo(s1);
                    if(s1.compareTo(s2) >= 0) {
                        goto label_40;
                    }
                    else if(v4 >= 0 && s3.compareTo(s2) <= 0) {
                        goto label_43;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            ٴˆ0 = CLS68.FLD326;
            boolean0 = Boolean.valueOf(z);
            ٴˆ0.MTH789("darkmode", boolean0, 5000L);
            return z;
        label_40:
            int v5 = s3.compareTo(s2);
            if(v4 > 0) {
                if(v5 >= 0) {
                    z = true;
                }
            }
            else if(v5 <= 0) {
            label_43:
                z = true;
            }
            ٴˆ0 = CLS68.FLD326;
            boolean0 = Boolean.valueOf(z);
        }
        ٴˆ0.MTH789("darkmode", boolean0, 5000L);
        return z;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH640() {
        return CLS43.MTH639() ? Color.parseColor("#656565") : Color.parseColor("#BBBBBB");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH641() {
        return CLS43.MTH639() ? Color.parseColor("#616161") : Color.parseColor("#B6B6B6");
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public static int MTH642() {
        return CLS43.MTH639() ? CLS43.MTH646() : CLS43.MTH643(CLS69.MTH801().MTH740("toolbar_text_color", "000000"));
    }

    // 此方法包含解密的字符串
    public static int MTH643(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return 0;
            }
            s = s.trim();
            String s1 = s.startsWith("#") ? s : "#" + s;
            HashMap hashMap0 = CLS43.FLD228;
            if(hashMap0.containsKey(s1)) {
                return (int)(((Integer)hashMap0.get(s1)));
            }
            int v = Color.parseColor(s1);
            hashMap0.put(s1, v);
            return v;
        }
        catch(Throwable throwable0) {
            CLS69.MTH809(s);
            CLS69.MTH797(throwable0);
            return 0;
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static int MTH644() {
        return CLS43.MTH639() ? Color.parseColor("#232323") : -1;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static int MTH645() {
        return Color.parseColor("#FFC300");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH646() {
        return CLS43.MTH639() ? Color.parseColor("#C6C6C6") : Color.parseColor("#1A1A1A");
    }
}

