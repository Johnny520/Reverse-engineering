// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import java.io.File;
import java.io.FilenameFilter;

public final class CLS418 implements FilenameFilter {
    public final int FLD4042;

    public CLS418(int v) {
        this.FLD4042 = v;
        super();
    }

    // 去混淆评级： 中等(110)
    // 此方法包含解密的字符串
    @Override
    public final boolean accept(File file0, String s) {
        return this.FLD4042 == 0 ? s.endsWith(".gif") || s.endsWith(".jpg") || s.endsWith(".jpeg") || s.endsWith("png") : s.startsWith("WechatXposed_") || s.startsWith("WechatForwarder_");
    }
}

