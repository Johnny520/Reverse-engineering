// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS8;
import b.ˈˈ.CLS69;
import java.util.ArrayList;

public final class CLS977 implements CLS8 {
    public final ArrayList FLD1931;
    public final CLS69 FLD1932;

    public CLS977(ArrayList arrayList0, CLS69 ʾᵢ0) {
        this.FLD1931 = arrayList0;
        this.FLD1932 = ʾᵢ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ArrayList arrayList0 = this.FLD1931;
        arrayList0.clear();
        for(Object object1: ((ArrayList)object0)) {
            arrayList0.add("#" + this.FLD1932.MTH1565(((String)object1)));
        }
    }
}

