// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.FileObserver;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS31;
import b.ⁱᵔ.CLS518;
import java.io.File;

public final class CLS141 extends FileObserver {
    public final String FLD1468;
    public final File FLD1469;

    public CLS141(File file0, String s, File file1) {
        this.FLD1468 = s;
        this.FLD1469 = file1;
        super(file0);
    }

    // 此方法包含解密的字符串
    @Override  // android.os.FileObserver
    public final void onEvent(int v, String s) {
        if(v == 2) {
            CLS518.MTH7051(CLS25.MTH865(2, CLS31.MTH979(this.FLD1468, "png"), "image/png"), CLS518.MTH7060(this.FLD1469.getAbsolutePath()));
        }
    }
}

