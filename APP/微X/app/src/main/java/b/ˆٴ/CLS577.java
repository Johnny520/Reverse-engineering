// Decompiled by JEB v5.42.0.202606242140

package b.ˆٴ;

import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.יﹳ.CLS166;

public final class CLS577 implements CLS39 {
    public final int FLD197;
    public final Object FLD198;
    public final Object FLD199;

    public CLS577(Object object0, Object object1, int v) {
        this.FLD197 = v;
        this.FLD199 = object0;
        this.FLD198 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object0 = this.FLD199;
        Object object1 = this.FLD198;
        if(this.FLD197 == 0) {
            CLS166.MTH3195(object0, CLS27.MTH897("translateMethod2d"), new Object[]{object1, 0, Boolean.FALSE});
            return;
        }
        CLS166.MTH3195(object0, CLS27.MTH897("translateMethod2e"), new Object[]{object1, 0});
    }
}

