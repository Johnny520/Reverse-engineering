// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS440;
import java.io.File;

public final class CLS572 implements CLS440 {
    public final int FLD136;
    public final CLS3 FLD137;
    public final CLS12 FLD138;

    public CLS572(CLS12 ᵔʾ0, CLS3 ˆٴ0, int v) {
        this.FLD136 = v;
        this.FLD138 = ᵔʾ0;
        this.FLD137 = ˆٴ0;
        super();
    }

    @Override  // b.ⁱᵔ.CLS442$CLS440
    public final void MTH6221(File file0) {
        CLS3 ˆٴ0 = this.FLD137;
        CLS12 ᵔʾ0 = this.FLD138;
        if(this.FLD136 == 0) {
            if(!file0.isDirectory()) {
                file0 = file0.getParentFile();
            }
            CLS1259 ⁱᵔ0 = new CLS1259(file0, ᵔʾ0, ˆٴ0, 2);
            CLS40.FLD157.MTH1124(((CLS39)ⁱᵔ0));
            return;
        }
        if(!file0.isDirectory()) {
            file0 = file0.getParentFile();
        }
        if(file0 != null && file0.canWrite()) {
            if(ᵔʾ0 != null) {
                try {
                    ᵔʾ0.MTH791(file0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        else if(ˆٴ0 != null) {
            CLS412.MTH5998(ˆٴ0);
        }
    }
}

