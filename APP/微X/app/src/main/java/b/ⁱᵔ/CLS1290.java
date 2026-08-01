// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS363;
import java.util.ArrayList;

public final class CLS1290 implements CLS12 {
    public final int FLD3546;
    public final ArrayList FLD3547;
    public final CLS363 FLD3548;

    public CLS1290(CLS363 ﾞٴ0, ArrayList arrayList0, int v) {
        this.FLD3546 = v;
        this.FLD3548 = ﾞٴ0;
        this.FLD3547 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ArrayList arrayList0 = this.FLD3547;
        if(this.FLD3546 == 0) {
            try {
                if(!arrayList0.contains("")) {
                    arrayList0.add("");
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            if(!arrayList0.contains("")) {
                arrayList0.add("");
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

