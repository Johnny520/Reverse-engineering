// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS372;
import java.util.ArrayList;

public final class CLS1653 extends CLS1642 {
    public CLS1653() {
        super(1);
        this.FLD501 = 12;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS1642
    public final String MTH1934() {
        return CLS27.MTH889("mass_unmute");
    }

    @Override  // b.ˈˊ.CLS1642
    public final void MTH1936() {
        ArrayList arrayList0 = this.FLD449;
        if(arrayList0.isEmpty()) {
            return;
        }
        for(Object object0: arrayList0) {
            CLS372.MTH5412(((String)object0), false);
        }
    }
}

