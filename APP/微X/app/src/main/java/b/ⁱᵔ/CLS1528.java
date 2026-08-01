// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1528 implements CLS11 {
    public final ArrayList FLD4701;
    public final CLS369 FLD4702;

    public CLS1528(CLS369 ﾞᵎ0, ArrayList arrayList0) {
        this.FLD4701 = arrayList0;
        this.FLD4702 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD4701.clear();
        CLS27.MTH895().MTH932("hidden_chat_menu_items");
        this.FLD4702.notifyDataSetChanged();
    }
}

