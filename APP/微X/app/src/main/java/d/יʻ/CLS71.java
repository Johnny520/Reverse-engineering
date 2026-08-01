// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import android.app.Activity;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.ٴˑ.CLS177;
import d.ᐧˈ.CLS107;
import d.ᐧˈ.CLS204;
import d.ᐧˏ.CLS108;
import java.util.LinkedHashMap;

public final class CLS71 {
    public static String MTH825(String s, int v, int v1, StringBuilder stringBuilder0, int v2, int v3) {
        stringBuilder0.append(s.substring(v, v1));
        stringBuilder0.append(s.substring(v2 + v3));
        return stringBuilder0.toString();
    }

    public static void MTH826(long v, CLS177 ʻﹶ0, long v1, CLS61 ˉᵢ0, boolean z, CLS204 ᵎᐧ0, int v2) {
        ʻﹶ0.MTH1181(CLS69.MTH795(CLS108.MTH1103(v)));
        ʻﹶ0.MTH854(ˉᵢ0.MTH748(CLS108.MTH1103(v1), z));
        ʻﹶ0.MTH851(new CLS107(ᵎᐧ0, v2));
    }

    public static boolean MTH827(long v) {
        return CLS1.MTH376(CLS69.MTH806(CLS108.MTH1103(v)));
    }

    public static int MTH828(String s, LinkedHashMap linkedHashMap0, String s1, int v, int v1) {
        linkedHashMap0.put(s1, s.trim());
        return v + v1;
    }

    public static void MTH829(long v, Activity activity0) {
        CLS1.MTH363(activity0, CLS69.MTH806(CLS108.MTH1103(v)));
    }

    public static StringBuilder MTH830(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        return stringBuilder0;
    }

    public static boolean MTH831(long v) {
        return TextUtils.isEmpty(CLS69.MTH806(CLS108.MTH1103(v)));
    }
}

