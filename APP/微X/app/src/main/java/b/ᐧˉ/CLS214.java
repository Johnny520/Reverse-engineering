// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import java.io.File;
import java.io.FileFilter;

public final class CLS214 implements FileFilter {
    public final int FLD2050;

    public CLS214(int v) {
        this.FLD2050 = v;
        super();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    @Override
    public final boolean accept(File file0) {
        return file0.getName().endsWith(".json");
    }
}

