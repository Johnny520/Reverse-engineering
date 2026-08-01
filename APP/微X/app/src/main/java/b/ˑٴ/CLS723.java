// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ˆٴ.CLS66;
import b.ـˏ.CLS1645;
import b.ـˏ.CLS169;
import b.ٴـ.CLS896.CLS170;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS723 implements CLS2 {
    public final String FLD876;
    public final CLS818 FLD877;

    public CLS723(CLS818 ᵎⁱ0, String s) {
        this.FLD877 = ᵎⁱ0;
        this.FLD876 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS1645(CLS66.MTH1370(""))), this.FLD876);
            this.FLD877.FLD1447.MTH3029(ˆٴ$ˆٴ0);
        }
    }
}

