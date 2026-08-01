// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS500;
import java.util.ArrayList;

public final class CLS1654 extends CLS1641 {
    public CLS1654() {
        this.FLD501 = 10;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS1641
    public final String MTH1934() {
        return CLS27.MTH889("chatroom_invite_allow_by_identity_disable");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS1641
    public final void MTH1936() {
        if(!CLS500.FLD4928.MTH6895("task_chatroom_invite_allow_by_identity")) {
            return;
        }
        ArrayList arrayList0 = this.FLD449;
        if(arrayList0.isEmpty()) {
            return;
        }
        for(Object object0: arrayList0) {
            CLS66.MTH1391(((String)object0), false);
        }
    }
}

