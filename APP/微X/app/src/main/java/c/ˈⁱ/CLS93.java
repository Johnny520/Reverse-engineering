// Decompiled by JEB v5.42.0.202606242140

package c.ˈⁱ;

import android.os.Build;
import c.ـˉ.CLS257;

public class CLS93 {
    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1965() {
        return "\uD8E3.der";
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1966() {
        return CLS93.MTH1973() + "\uD8E3t";
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static int MTH1967() {
        String s = CLS257.MTH3723();
        if(CLS257.MTH3728(Build.CPU_ABI).equals("\uD8E3rm64")) {
            if(s.contains("\uD8E3rm")) {
                return 1;
            }
            return s.contains("\uD8E386") ? 2 : 0;
        }
        if(s.contains("\uD8E3rm")) {
            return 0;
        }
        return s.contains("\uD8E386") ? 3 : 0;
    }

    public static boolean MTH1968() [...] // Inlined contents

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1969() {
        return "\uD8E3isable";
    }

    public static int MTH1970() {
        return 209;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1971() {
        return "\uD8E32";
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1972() {
        return "\uD8E3";
    }

    // 此方法包含解密的字符串
    public static String MTH1973() {
        switch(CLS93.MTH1967()) {
            case 0: {
                return "\uD8E3";
            }
            case 1: {
                return "\uD8E364";
            }
            case 2: {
                return "\uD8E3_x86_64";
            }
            case 3: {
                return "\uD8E3_x86";
            }
            default: {
                return "";
            }
        }
    }
}

