// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ᐧˉ.CLS182;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS481 {
    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH6686(long v, ContentValues contentValues0) {
        return contentValues0.containsKey("createTime") && CLS481.MTH6688(((long)contentValues0.getAsLong("createTime")), v);
    }

    // 此方法包含解密的字符串
    public static boolean MTH6687(String s, String s1) {
        Calendar calendar0 = Calendar.getInstance();
        String s2 = new SimpleDateFormat("HH:mm").format(calendar0.getTime());
        int v = s2.compareTo(s);
        if(s.compareTo(s1) < 0) {
            return v >= 0 && s2.compareTo(s1) <= 0;
        }
        int v1 = s2.compareTo(s1);
        return v > 0 ? v1 >= 0 : v1 <= 0;
    }

    public static boolean MTH6688(long v, long v1) {
        if(CLS481.MTH6690(System.currentTimeMillis()) != CLS481.MTH6690(v)) {
            v *= 1000L;
        }
        return Math.abs(System.currentTimeMillis() - v) > v1;
    }

    public static Date MTH6689(Date date0) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTime(date0);
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        return calendar0.getTime();
    }

    public static int MTH6690(long v) {
        return v == 0L ? 1 : 1 + ((int)Math.floor(Math.log10(Math.abs(v))));
    }

    // 此方法包含解密的字符串
    public static int MTH6691(String s) {
        try {
            String s1 = CLS27.MTH895().MTH925(s, "");
            if(TextUtils.isEmpty(s1)) {
                return 0;
            }
            String[] arr_s = s1.split(",");
            int v = Integer.parseInt(arr_s[0]);
            long v1 = Long.parseLong(arr_s[1], 16);
            Calendar calendar0 = Calendar.getInstance();
            calendar0.setTimeInMillis(v1);
            int v2 = calendar0.get(6);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTimeInMillis(System.currentTimeMillis());
            if(v2 == calendar1.get(6)) {
                return v;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    public static long MTH6692(int v, int v1, int v2, int v3) [...] // Inlined contents

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH6693(long v) [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static void MTH6694(int v, String s) {
        CLS27.MTH895().MTH922(v + "," + Long.toHexString(System.currentTimeMillis()), s);
    }

    public static Date MTH6695(Date date0) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTime(date0);
        calendar0.set(11, 23);
        calendar0.set(12, 59);
        calendar0.set(13, 59);
        calendar0.set(14, 999);
        return calendar0.getTime();
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH6696(long v) {
        long v1 = v - ((long)(((int)(v / 3600000L)))) * 3600000L;
        long v2 = v1 - ((long)(((int)(v1 / 60000L)))) * 60000L;
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put(CLS182.MTH3479(((int)(v2 / 1000L)), contentValues0, CLS182.MTH3479(((int)(v1 / 60000L)), contentValues0, CLS182.MTH3479(((int)(v / 3600000L)), contentValues0, "hours", 0x38EAD23F2B3CD335L), 4101322163539989301L), 0x38EAD2CF2B3CD335L), ((int)(v2 - ((long)(((int)(v2 / 1000L)))) * 1000L)));
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH6697(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            if(s.startsWith("{")) {
                JSONArray jSONArray0 = new JSONObject(s).getJSONArray("timeframes");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    if(jSONObject0.optBoolean("enable") && CLS481.MTH6697(jSONObject0.getString("timeframe"))) {
                        return true;
                    }
                }
                return false;
            }
            String[] arr_s = s.split(";");
            String[] arr_s1 = arr_s[0].split(":");
            String[] arr_s2 = arr_s[1].split(":");
            int v1 = Integer.parseInt(arr_s1[0]);
            int v2 = Integer.parseInt(arr_s1[1]);
            int v3 = Integer.parseInt(arr_s2[0]);
            int v4 = Integer.parseInt(arr_s2[1]);
            return CLS481.MTH6687(String.format("%02d:%02d", v1, v2), String.format("%02d:%02d", v3, v4));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH6698() {
        if(CLS21.FLD76.MTH830("isHideWxMenu", new Object[0])) {
            return true;
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        if(!ˎᵢ0.MTH938("temp_disable_menu", false)) {
            return false;
        }
        String s = ˎᵢ0.MTH925("temp_disable_menu_start_time", "");
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        int v = ˎᵢ0.MTH927(300000, "temp_disable_menu_time");
        return !CLS481.MTH6688(Long.parseLong(s, 16), v);
    }
}

