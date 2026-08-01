// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS79;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import java.util.ArrayList;

public class CLS1642 extends CLS595 {
    public final int FLD475;

    public CLS1642(int v) {
        this.FLD475 = v;
        if(v != 1) {
            super();
            this.FLD501 = 8;
            return;
        }
        super();
        this.FLD501 = 11;
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS595
    public String MTH1934() {
        return this.FLD475 == 0 ? CLS27.MTH889("mass_delete_conversation") : CLS27.MTH889("mass_mute");
    }

    @Override  // b.ˈˊ.CLS595
    public void MTH1936() {
        ArrayList arrayList0 = this.FLD449;
        if(this.FLD475 == 0) {
            if(!arrayList0.isEmpty()) {
                if(CLS182.MTH3470(4101561723930858293L)) {
                    for(Object object0: arrayList0) {
                        CLS371.FLD3470.MTH5370(((String)object0));
                    }
                }
                else {
                    CLS371.FLD3470.MTH5326(arrayList0);
                }
                CLS79.FLD292.MTH1633();
            }
            return;
        }
        if(!arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                CLS372.MTH5412(((String)object1), true);
            }
        }
    }
}

