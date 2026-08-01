// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;

public final class CLS1398 implements CLS11 {
    public final CLS29 FLD3966;
    public final ArrayList FLD3967;
    public final String FLD3968;
    public final CLS366 FLD3969;

    public CLS1398(CLS366 ﾞᐧ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD3966 = ˎᵢ0;
        this.FLD3968 = s;
        this.FLD3967 = arrayList0;
        this.FLD3969 = ﾞᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            this.FLD3966.MTH922("", "momentscontainer_" + this.FLD3968);
            this.FLD3967.clear();
            this.FLD3969.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

