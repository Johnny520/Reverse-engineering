// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Bundle;
import android.util.SparseArray;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ⁱʾ.CLS1274;
import java.io.File;

public final class CLS797 implements CLS12 {
    public final File FLD1169;
    public final Bundle FLD1170;
    public final SparseArray FLD1171;
    public final String FLD1172;
    public final int FLD1173;
    public final CLS3 FLD1174;

    public CLS797(int v, Bundle bundle0, SparseArray sparseArray0, CLS1274 ﾞˎ0, File file0, String s) {
        this.FLD1169 = file0;
        this.FLD1172 = s;
        this.FLD1171 = sparseArray0;
        this.FLD1173 = v;
        this.FLD1170 = bundle0;
        this.FLD1174 = ﾞˎ0;
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        if(CLS31.MTH1001(((File)object0))) {
            String s = CLS34.MTH1074(new StringBuilder(), this.FLD1172, 0x38EDCFAA2B3CD335L);
            if(CLS31.MTH1025(((File)object0), new File(this.FLD1169, s))) {
                this.FLD1171.put(this.FLD1173, this.FLD1170);
            }
        }
        CLS3 ˆٴ0 = this.FLD1174;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
    }
}

