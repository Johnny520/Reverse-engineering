// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS466;
import java.io.File;

public final class CLS693 implements CLS3 {
    public final int FLD785;
    public final Object FLD786;
    public final Class FLD787;

    public CLS693(Class class0, Object object0, int v) {
        this.FLD785 = v;
        this.FLD787 = class0;
        this.FLD786 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Object object0 = this.FLD786;
        Class class0 = this.FLD787;
        if(this.FLD785 == 0) {
            try {
                CLS466.MTH6516(new File(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})))));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            CLS466.MTH6516(new File(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})))));
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

