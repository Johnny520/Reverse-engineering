// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ᵔʾ.CLS1255;
import java.io.File;

public final class CLS97 {
    public final CLS3 FLD411;
    public final CLS12 FLD412;
    public boolean FLD413;

    public CLS97(CLS3 ˆٴ0) {
        this.FLD413 = false;
        this.FLD411 = ˆٴ0;
    }

    public CLS97(CLS12 ᵔʾ0) {
        this.FLD413 = false;
        this.FLD412 = ᵔʾ0;
    }

    public final void MTH1768(File file0) {
        if(!this.FLD413 && this.FLD412 != null) {
            this.FLD413 = true;
            CLS1255 ᵢﹶ0 = new CLS1255(this, file0, 7);
            CLS40.FLD157.MTH1123(((CLS39)ᵢﹶ0), 2000L);
        }
    }
}

