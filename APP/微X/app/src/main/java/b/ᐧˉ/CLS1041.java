// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1629;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1041 implements CLS2 {
    public final CLS1629 FLD2215;

    public CLS1041(CLS1629 ⁱˉ0) {
        this.FLD2215 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        int v;
        switch(this.FLD2215.MTH7373()) {
            case "radio_female": {
                v = 2;
                break;
            }
            case "radio_male": {
                v = 1;
                break;
            }
            default: {
                v = -1;
            }
        }
        CLS27.MTH895().MTH922("", "chatroom_friend_req_excl");
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            CLS21.FLD76.MTH818("chatroomFriendReq", new Object[]{-1, "", v});
        }
    }
}

