// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.text.TextUtils;
import java.util.Collection;
import java.util.regex.Pattern;

public class CLS170 {
    // 此方法包含解密的字符串
    public static String MTH3002(String s) [...] // 潜在的解密器

    public static boolean MTH3003(String s, CharSequence[] arr_charSequence) {
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

    // 此方法包含解密的字符串
    public static String MTH3004(String s) [...] // 潜在的解密器

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static String[] MTH3005(String s) {
        if(TextUtils.isEmpty(s)) {
            return new String[0];
        }
        return s.contains("\uD8E3") ? s.split("\uD8E3") : s.split("\uD8E3");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH3006(CharSequence charSequence0) {
        return TextUtils.isEmpty(charSequence0) ? "" : charSequence0.toString();
    }

    public static boolean MTH3007(String s, Collection collection0) {
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

    // 去混淆评级： 低(20)
    public static boolean MTH3008(String s, String s1) {
        return TextUtils.isEmpty(s) ? false : CLS170.MTH3009(Pattern.compile(s, 2), s1);
    }

    public static boolean MTH3009(Pattern pattern0, String s) {
        return pattern0 == null ? false : pattern0.matcher(s).find();
    }

    // 去混淆评级： 低(20)
    public static boolean MTH3010(String s) {
        return TextUtils.isEmpty(s) ? false : Boolean.parseBoolean(s);
    }

    public static boolean MTH3011(String s, String[] arr_s) {
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
}

