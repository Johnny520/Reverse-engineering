// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;

public final class CLS1293 implements CLS3 {
    public final Activity FLD3576;
    public final boolean FLD3577;
    public final CLS29 FLD3578;

    public CLS1293(Activity activity0, CLS29 ˎᵢ0, boolean z) {
        this.FLD3576 = activity0;
        this.FLD3578 = ˎᵢ0;
        this.FLD3577 = z;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = CLS27.MTH889("add");
        CLS1394 ˈˏ0 = new CLS1394(this.FLD3578, this.FLD3577, this.FLD3576);
        CLS523.MTH7165(this.FLD3576, s, "", "", 1, ((CLS16)ˈˏ0));
    }
}

