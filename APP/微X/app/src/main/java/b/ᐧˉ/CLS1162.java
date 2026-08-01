// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.net.Uri;
import b.ʻˑ.CLS12;
import java.io.File;

public final class CLS1162 implements CLS12 {
    public final int FLD2683;
    public final CLS244 FLD2684;

    public CLS1162(CLS244 ᴵʻ0, int v) {
        this.FLD2683 = v;
        this.FLD2684 = ᴵʻ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS244 ᴵʻ0 = this.FLD2684;
        if(this.FLD2683 == 0) {
            ᴵʻ0.getClass();
            ᴵʻ0.FLD2540.MTH7277("#file " + ((File)object0).getAbsolutePath());
            return;
        }
        ᴵʻ0.getClass();
        ᴵʻ0.FLD2540.MTH7277("#uri_file " + ((Uri)object0).toString());
    }
}

