// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1277 implements CLS11 {
    public final ArrayList FLD3480;
    public final CLS369 FLD3481;
    public final int FLD3482;

    public CLS1277(int v, CLS369 ﾞᵎ0, ArrayList arrayList0) {
        this.FLD3480 = arrayList0;
        this.FLD3482 = v;
        this.FLD3481 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD3480.remove(this.FLD3482);
        this.FLD3481.notifyDataSetChanged();
        CLS27.MTH895().MTH922(TextUtils.join(",", this.FLD3480), "hidden_chat_menu_items");
    }
}

