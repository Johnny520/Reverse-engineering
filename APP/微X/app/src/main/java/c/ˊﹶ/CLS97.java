// Decompiled by JEB v5.42.0.202606242140

package c.ˊﹶ;

import android.os.Build;
import c.ˏᵎ.CLS180;

public class CLS97 {
    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1260() {
        return "disable";
    }

    public static boolean MTH1261() [...] // Inlined contents

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1262() {
        return CLS97.MTH1263() + "_t";
    }

    // 此方法包含解密的字符串
    public static String MTH1263() {
        switch(CLS97.MTH1266()) {
            case 0: {
                return "L";
            }
            case 1: {
                return "L64";
            }
            case 2: {
                return "L_x86_64";
            }
            case 3: {
                return "L_x86";
            }
            default: {
                return "";
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1264() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1265() {
        return "42";
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static int MTH1266() {
        String s = CLS180.MTH2623();
        if(CLS180.MTH2648(Build.CPU_ABI).equals("arm64")) {
            if(s.contains("arm")) {
                return 1;
            }
            return s.contains("x86") ? 2 : 0;
        }
        if(s.contains("arm")) {
            return 0;
        }
        return s.contains("x86") ? 3 : 0;
    }

    public static int MTH1267() {
        return 0xD4;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1268() {
        return "c.der";
    }
}

