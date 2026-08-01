// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.os.FileObserver;
import java.io.File;
import t.ᵔʾ.CLS132;

public final class CLS108 extends FileObserver {
    public final File FLD804;
    public final CLS102 FLD805;
    public final String FLD806;

    public CLS108(CLS102 יﹳ0, File file0, File file1, String s) {
        this.FLD805 = יﹳ0;
        this.FLD804 = file1;
        this.FLD806 = s;
        super(file0);
    }

    // 此方法包含解密的字符串
    @Override  // android.os.FileObserver
    public final void onEvent(int v, String s) {
        CLS102 יﹳ0 = this.FLD805;
        String s1 = this.FLD806;
        if(v == 2) {
            CLS132.MTH2092(this.FLD804, s1, new String[]{יﹳ0.FLD773, "images"});
            return;
        }
        if(v == 0x200) {
            CLS132.MTH2093(s1, new String[]{יﹳ0.FLD773, "images"});
        }
    }
}

