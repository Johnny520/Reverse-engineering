// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS283;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1625;
import java.util.ArrayList;

public final class CLS1082 implements CLS2 {
    public final CLS1625 FLD2332;
    public final CLS899 FLD2333;

    public CLS1082(CLS899 ʻʼ0, CLS1625 ـˏ0) {
        this.FLD2333 = ʻʼ0;
        this.FLD2332 = ـˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        this.FLD2333.FLD2151.MTH922(s, "zombie_search_contacts");
        String s2 = CLS27.MTH889(CLS370.MTH5289((CLS283.FLD2946.FLD2943 ? 4101079253074629429L : 4101079326089073461L)));
        this.FLD2332.MTH800(s2);
        CLS283.FLD2946.MTH4689();
    }
}

