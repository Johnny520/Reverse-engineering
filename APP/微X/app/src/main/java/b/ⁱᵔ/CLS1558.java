// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import java.io.File;

public final class CLS1558 implements CLS3 {
    public final boolean FLD4849;
    public final String FLD4850;

    public CLS1558(String s, boolean z) {
        this.FLD4849 = z;
        this.FLD4850 = s;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD4850;
        if(!this.FLD4849) {
            CLS31.MTH996(s);
            CLS466.MTH6506(new File(s));
            return;
        }
        CLS412.MTH6013(CLS27.MTH900(), CLS27.MTH889("file_written_to") + s);
    }
}

