// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1499 implements CLS11 {
    public final HashMap FLD4533;
    public final CLS1620 FLD4534;
    public final String FLD4535;
    public final String FLD4536;

    public CLS1499(HashMap hashMap0, String s, CLS1620 ˊˏ0, String s1) {
        this.FLD4533 = hashMap0;
        this.FLD4535 = s;
        this.FLD4534 = ˊˏ0;
        this.FLD4536 = s1;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = (String)this.FLD4533.get(this.FLD4535);
        this.FLD4533.remove(this.FLD4535);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(CLS27.MTH889("tags"));
        arrayList0.addAll(this.FLD4533.keySet());
        this.FLD4534.MTH7247(arrayList0);
        CLS27.MTH895().MTH932("at_multiple_tag_" + this.FLD4536 + "_" + s);
    }
}

