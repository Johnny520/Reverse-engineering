// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʾᵢ.CLS40.CLS39;
import java.io.File;

public final class CLS789 implements CLS39 {
    public final int FLD1135;
    public final File FLD1136;

    public CLS789(int v, File file0) {
        this.FLD1135 = v;
        this.FLD1136 = file0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        File file0 = this.FLD1136;
        if(this.FLD1135 == 0) {
            file0.delete();
            return;
        }
        file0.delete();
    }
}

