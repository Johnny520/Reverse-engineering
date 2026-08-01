// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.os.Build;
import d.יʻ.CLS68;
import d.יʻ.CLS69;

public final class CLS25 {
    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH489() {
        return System.getProperties().stringPropertyNames().contains("exp") && !CLS69.FLD336.contains("io.va.exposed");
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public static boolean MTH490() {
        CLS36 יʻ0 = (CLS36)CLS68.FLD326.MTH786(CLS36.class);
        יʻ0.getClass();
        return יʻ0.FLD191.containsKey("isARM64") ? יʻ0.FLD191.getAsBoolean("isARM64").booleanValue() : Build.CPU_ABI.toLowerCase().contains("arm64");
    }
}

