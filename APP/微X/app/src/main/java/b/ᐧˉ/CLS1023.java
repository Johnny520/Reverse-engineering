// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˊﾞ.CLS613;
import java.io.File;
import java.io.InputStream;

public final class CLS1023 implements CLS39 {
    public final int FLD2099;
    public final File FLD2100;
    public final InputStream FLD2101;
    public final CLS3 FLD2102;

    public CLS1023(InputStream inputStream0, File file0, CLS3 ˆٴ0, int v) {
        this.FLD2099 = v;
        this.FLD2101 = inputStream0;
        this.FLD2100 = file0;
        this.FLD2102 = ˆٴ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS3 ˆٴ0 = this.FLD2102;
        File file0 = this.FLD2100;
        InputStream inputStream0 = this.FLD2101;
        if(this.FLD2099 == 0) {
            try {
                CLS613.MTH1974(inputStream0, file0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            ˆٴ0.MTH774();
            return;
        }
        try {
            CLS613.MTH1974(inputStream0, file0);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        ˆٴ0.MTH774();
    }
}

