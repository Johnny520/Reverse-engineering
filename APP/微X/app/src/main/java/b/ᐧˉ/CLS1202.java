// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS31;
import b.ˊﾞ.CLS613;
import b.ⁱᵔ.CLS466;
import java.io.File;

public final class CLS1202 implements CLS3 {
    public final int FLD2812;
    public final File FLD2813;
    public final Activity FLD2814;

    public CLS1202(int v, Activity activity0, File file0) {
        this.FLD2812 = v;
        this.FLD2814 = activity0;
        this.FLD2813 = file0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        File file0 = this.FLD2813;
        Activity activity0 = this.FLD2814;
        if(this.FLD2812 == 0) {
            File file1 = new File(activity0.getCacheDir(), "sounds.zip");
            CLS31.MTH1011(file1);
            if(CLS613.MTH1976(file0, file1)) {
                CLS31.MTH996(file1.getAbsolutePath());
                CLS466.MTH6506(file1);
                CLS31.MTH1035(file0);
            }
            return;
        }
        File file2 = new File(activity0.getCacheDir(), "voices.zip");
        CLS31.MTH1011(file2);
        if(CLS613.MTH1976(file0, file2)) {
            CLS31.MTH996(file2.getAbsolutePath());
            CLS466.MTH6506(file2);
            CLS31.MTH1035(file0);
        }
    }
}

