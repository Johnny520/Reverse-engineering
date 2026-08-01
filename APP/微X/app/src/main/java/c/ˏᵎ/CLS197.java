// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.text.TextUtils;
import java.util.Collection;
import java.util.regex.Pattern;

public class CLS197 {
    public static boolean MTH2923(String s, Collection collection0) {
        if(collection0.isEmpty()) {
            return false;
        }
        for(Object object0: collection0) {
            if(s.contains(((String)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public static String[] MTH2924(String s) {
        if(TextUtils.isEmpty(s)) {
            return new String[0];
        }
        if(s.contains(",")) {
            return s.split(",");
        }
        if(s.contains(";")) {
            return s.split(";");
        }
        if(s.contains(":")) {
            return s.split(":");
        }
        return s.contains(" ") ? s.split(" ") : s.split(",");
    }

    public static boolean MTH2925(String s, CharSequence[] arr_charSequence) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s1 = s.toLowerCase();
        for(int v = 0; v < arr_charSequence.length; ++v) {
            CharSequence charSequence0 = arr_charSequence[v];
            if(!TextUtils.isEmpty(charSequence0) && s1.contains(charSequence0.toString().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static boolean MTH2926(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!TextUtils.isEmpty(s1) && s.contains(s1)) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2927(String s) {
        return TextUtils.isEmpty(s) ? false : Boolean.parseBoolean(s);
    }

    public static boolean MTH2928(Pattern pattern0, String s) {
        return pattern0 == null ? false : pattern0.matcher(s).find();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH2929(CharSequence charSequence0) {
        return TextUtils.isEmpty(charSequence0) ? "" : charSequence0.toString();
    }

    // 此方法包含解密的字符串
    public static String MTH2930(String s) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static boolean MTH2931(String s, String s1) {
        return TextUtils.isEmpty(s) ? false : CLS197.MTH2928(Pattern.compile(s, 2), s1);
    }

    // 此方法包含解密的字符串
    public static String MTH2932(String s) [...] // 潜在的解密器
}

