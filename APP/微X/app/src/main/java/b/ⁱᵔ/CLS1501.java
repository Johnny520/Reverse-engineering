// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ᵔʾ.CLS1248;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1501 implements CLS3 {
    public final CLS369 FLD4541;
    public final Activity FLD4542;
    public final ArrayList FLD4543;
    public final CLS29 FLD4544;
    public final String FLD4545;
    public final String FLD4546;
    public final String FLD4547;
    public final int FLD4548;

    public CLS1501(Activity activity0, String s, CLS29 ˎᵢ0, String s1, ArrayList arrayList0, int v, String s2, CLS369 ﾞᵎ0) {
        this.FLD4542 = activity0;
        this.FLD4545 = s;
        this.FLD4544 = ˎᵢ0;
        this.FLD4546 = s1;
        this.FLD4543 = arrayList0;
        this.FLD4548 = v;
        this.FLD4547 = s2;
        this.FLD4541 = ﾞᵎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = CLS27.MTH889("modify");
        CLS1248 ـﹳ0 = new CLS1248(this.FLD4544, this.FLD4546, this.FLD4545, this.FLD4543, this.FLD4548, this.FLD4547, this.FLD4541);
        CLS523.MTH7165(this.FLD4542, s, "", this.FLD4545, 1, ((CLS16)ـﹳ0));
    }
}

