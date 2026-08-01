// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.os.Build.VERSION;
import android.text.TextUtils;
import c.ˉˆ.CLS59;
import c.ˊﹶ.CLS98;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class CLS205 {
    // 此方法包含解密的字符串
    public static boolean MTH2971() {
        CLS59 ʼˊ0 = CLS98.MTH1297();
        if(!ʼˊ0.MTH994("temp_disable_menu", false)) {
            return false;
        }
        String s = ʼˊ0.MTH1015("temp_disable_menu_start_time", "");
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        int v = ʼˊ0.MTH1007("temp_disable_menu_time", 300000);
        return !CLS205.MTH2978(Long.parseLong(s, 16), v);
    }

    // 此方法包含解密的字符串
    public static String MTH2972(long v) {
        long v1 = System.currentTimeMillis();
        if(v < v1) {
            return "";
        }
        long v2 = v - v1;
        if(Build.VERSION.SDK_INT >= 26) {
            Duration duration0 = Duration.ofMillis(v2);
            int v3 = (int)duration0.toDays();
            int v4 = (int)duration0.minusDays(((long)v3)).toHours();
            return String.format("", v3, v4, ((int)duration0.minusDays(((long)v3)).minusHours(((long)v4)).toMinutes()));
        }
        long v5 = v2 - ((long)(((int)(v2 / 86400000L)))) * 86400000L;
        return String.format("", ((int)(v2 / 86400000L)), ((int)(v5 / 3600000L)), ((int)(((int)(v5 - ((long)(((int)(v5 / 3600000L)))) * 3600000L)) / 60000)));
    }

    // 此方法包含解密的字符串
    public static boolean MTH2973(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            String[] arr_s = s.split(";");
            String[] arr_s1 = arr_s[0].split(":");
            String[] arr_s2 = arr_s[1].split(":");
            int v = Integer.parseInt(arr_s1[0]);
            int v1 = Integer.parseInt(arr_s1[1]);
            int v2 = Integer.parseInt(arr_s2[0]);
            int v3 = Integer.parseInt(arr_s2[1]);
            return CLS205.MTH2975(String.format("%02d:%02d", v, v1), String.format("%02d:%02d", v2, v3));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public static boolean MTH2974(String s, String s1, String s2) {
        int v = s.compareTo(s1);
        if(s1.compareTo(s2) < 0) {
            return v >= 0 && s.compareTo(s2) <= 0;
        }
        int v1 = s.compareTo(s2);
        return v > 0 ? v1 >= 0 : v1 <= 0;
    }

    public static boolean MTH2975(String s, String s1) {
        return CLS205.MTH2974(CLS205.MTH2979(), s, s1);
    }

    public static int MTH2976(long v) {
        return v == 0L ? 1 : 1 + ((int)Math.floor(Math.log10(Math.abs(v))));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH2977(long v) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(v));
    }

    public static boolean MTH2978(long v, long v1) {
        if(CLS205.MTH2976(System.currentTimeMillis()) != CLS205.MTH2976(v)) {
            v *= 1000L;
        }
        return Math.abs(System.currentTimeMillis() - v) > v1;
    }

    // 此方法包含解密的字符串
    public static String MTH2979() {
        Calendar calendar0 = Calendar.getInstance();
        return new SimpleDateFormat("HH:mm").format(calendar0.getTime());
    }
}

