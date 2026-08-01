// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.os.Build.VERSION;
import android.text.TextUtils;
import c.ˈⁱ.CLS95;
import c.יᴵ.CLS156;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class CLS259 {
    // 此方法包含解密的字符串
    public static String MTH3818() {
        Calendar calendar0 = Calendar.getInstance();
        return new SimpleDateFormat("\uD8E3H:mm").format(calendar0.getTime());
    }

    // 此方法包含解密的字符串
    public static boolean MTH3819(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            String[] arr_s = s.split("\uD8E3");
            String[] arr_s1 = arr_s[0].split("\uD8E3");
            String[] arr_s2 = arr_s[1].split("\uD8E3");
            int v = Integer.parseInt(arr_s1[0]);
            int v1 = Integer.parseInt(arr_s1[1]);
            int v2 = Integer.parseInt(arr_s2[0]);
            int v3 = Integer.parseInt(arr_s2[1]);
            return CLS259.MTH3825(String.format("\uD8E302d:%02d", v, v1), String.format("\uD8E302d:%02d", v2, v3));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH3820(long v) {
        return new SimpleDateFormat("\uD8E3yyy-MM-dd HH:mm:ss").format(new Date(v));
    }

    // 此方法包含解密的字符串
    public static String MTH3821(long v) {
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
    public static boolean MTH3822() {
        CLS156 ٴʻ0 = CLS95.MTH2031();
        if(!ٴʻ0.MTH2725("\uD8E3emp_disable_menu", false)) {
            return false;
        }
        String s = ٴʻ0.MTH2733("\uD8E3emp_disable_menu_start_time", "");
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        int v = ٴʻ0.MTH2741("\uD8E3emp_disable_menu_time", 300000);
        return !CLS259.MTH3823(Long.parseLong(s, 16), v);
    }

    public static boolean MTH3823(long v, long v1) {
        if(CLS259.MTH3824(System.currentTimeMillis()) != CLS259.MTH3824(v)) {
            v *= 1000L;
        }
        return Math.abs(System.currentTimeMillis() - v) > v1;
    }

    public static int MTH3824(long v) {
        return v == 0L ? 1 : 1 + ((int)Math.floor(Math.log10(Math.abs(v))));
    }

    public static boolean MTH3825(String s, String s1) {
        return CLS259.MTH3826(CLS259.MTH3818(), s, s1);
    }

    public static boolean MTH3826(String s, String s1, String s2) {
        int v = s.compareTo(s1);
        if(s1.compareTo(s2) < 0) {
            return v >= 0 && s.compareTo(s2) <= 0;
        }
        int v1 = s.compareTo(s2);
        return v > 0 ? v1 >= 0 : v1 <= 0;
    }
}

