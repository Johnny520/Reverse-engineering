// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1196 implements CLS2 {
    public final CLS1019 FLD2799;

    public CLS1196(CLS1019 ˎʻ0) {
        this.FLD2799 = ˎʻ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS1019 ˎʻ0 = this.FLD2799;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ˎʻ0.FLD2151.MTH922(s, "auto_accept_chatroom_invite_qr_excl");
            return;
        }
        ˎʻ0.FLD2151.MTH922("", "auto_accept_chatroom_invite_qr_excl");
    }
}

