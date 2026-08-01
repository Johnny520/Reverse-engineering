// Decompiled by JEB v5.42.0.202606242140

package p.pkg1;

import p.pkg9.CLS192;
import p.pkg9.CLS57;

public final class CLS77 implements CLS2 {
    public final CLS4 FLD15;
    public final CLS3 FLD16;

    public CLS77(CLS192 יٴ0, CLS4 ﾞᵢ0, CLS3 ﹳˑ0) {
        this.FLD15 = ﾞᵢ0;
        this.FLD16 = ﹳˑ0;
    }

    @Override  // p.pkg1.CLS2
    public final void MTH404(CLS57 ʼˉ0, int v) {
        if(ʼˉ0 instanceof CLS192 && this.FLD16.MTH416(((CLS192)ʼˉ0))) {
            this.FLD15.add(((CLS192)ʼˉ0));
        }
    }

    @Override  // p.pkg1.CLS2
    public final void MTH405(CLS57 ʼˉ0, int v) {
    }
}

