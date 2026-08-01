// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.יᐧ.CLS145.CLS144;
import b.ᐧˉ.CLS182;

public final class CLS640 implements CLS7, CLS144 {
    public final long FLD600;

    public CLS640(long v) {
        this.FLD600 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        String s = CLS182.MTH3489(0x38EC1B662B3CD335L, new StringBuilder(), object0);
        CLS21.FLD76.MTH819("sns.menu.config", new Object[]{s, this.FLD600});
    }
}

