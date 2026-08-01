// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1022 implements CLS2 {
    public final HashSet FLD2098;

    public CLS1022(HashSet hashSet0) {
        this.FLD2098 = hashSet0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s)));
        for(Object object0: this.FLD2098) {
            String s2 = (String)object0;
            if(!hashSet0.contains(s2)) {
                CLS79 ˎᵢ0 = CLS79.FLD292;
                ˎᵢ0.getClass();
                if(!TextUtils.isEmpty(s2)) {
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(s2);
                    ˎᵢ0.MTH1618("wx_chatroom_containers", arrayList1);
                }
                ˎᵢ0.MTH1657(s2);
                ˎᵢ0.MTH1633();
                ˎᵢ0.FLD300.remove(s2);
                ˎᵢ0.FLD300.remove("wx__MAIN_");
            }
        }
        for(Object object1: hashSet0) {
            String s3 = (String)object1;
            CLS79 ˎᵢ1 = CLS79.FLD292;
            if(!ˎᵢ1.MTH1658(s3)) {
                ˎᵢ1.MTH1638(s3);
            }
        }
    }
}

