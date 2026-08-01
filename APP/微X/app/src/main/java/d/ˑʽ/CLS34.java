// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.ContentValues;
import android.os.Build.VERSION;
import d.יʻ.CLS69;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public final class CLS34 {
    // 此方法包含解密的字符串
    public static ContentValues MTH571(long v) {
        long v1 = v - ((long)(((int)(v / 3600000L)))) * 3600000L;
        long v2 = v1 - ((long)(((int)(v1 / 60000L)))) * 60000L;
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("hours", ((int)(v / 3600000L)));
        contentValues0.put("minutes", ((int)(v1 / 60000L)));
        contentValues0.put("seconds", ((int)(v2 / 1000L)));
        contentValues0.put("milliseconds", ((int)(v2 - ((long)(((int)(v2 / 1000L)))) * 1000L)));
        return contentValues0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH572(long v) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(v));
    }

    // 此方法包含解密的字符串
    public static String MTH573(long v) {
        long v1 = System.currentTimeMillis();
        if(v < v1) {
            return String.format(CLS69.MTH795("time_format"), 0, 0, 0);
        }
        long v2 = v - v1;
        if(Build.VERSION.SDK_INT >= 26) {
            Duration duration0 = Duration.ofMillis(v2);
            int v3 = (int)duration0.toDays();
            int v4 = (int)duration0.minusDays(((long)v3)).toHours();
            int v5 = (int)duration0.minusDays(((long)v3)).minusHours(((long)v4)).toMinutes();
            return String.format(CLS69.MTH795("time_format"), v3, v4, v5);
        }
        long v6 = v2 - ((long)(((int)(v2 / 86400000L)))) * 86400000L;
        return String.format(CLS69.MTH795("time_format"), ((int)(v2 / 86400000L)), ((int)(v6 / 3600000L)), ((int)(((int)(v6 - ((long)(((int)(v6 / 3600000L)))) * 3600000L)) / 60000)));
    }

    public static boolean MTH574(long v, long v1) {
        long v2 = System.currentTimeMillis();
        if((v2 == 0L ? 1 : ((int)Math.floor(Math.log10(Math.abs(v2)))) + 1) != (v == 0L ? 1 : ((int)Math.floor(Math.log10(Math.abs(v)))) + 1)) {
            v *= 1000L;
        }
        return Math.abs(System.currentTimeMillis() - v) > v1;
    }
}

