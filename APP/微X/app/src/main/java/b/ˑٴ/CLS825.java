// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS441;
import java.io.InputStream;

public final class CLS825 implements CLS39, CLS441 {
    public final CLS139 FLD1258;

    public CLS825(CLS139 ﹶʼ0) {
        this.FLD1258 = ﹶʼ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Activity activity0 = this.FLD1258.MTH3026();
        Activity activity1 = this.FLD1258.MTH3015();
        try {
            if(activity1 != null) {
                activity1.recreate();
                return;
            }
            if(activity0 != null) {
                activity0.recreate();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        CLS139 ﹶʼ0 = this.FLD1258;
        ﹶʼ0.getClass();
        if(inputStream0 != null) {
            try {
                if(ﹶʼ0.MTH3031(CLS31.MTH998(inputStream0))) {
                    CLS412.MTH6013(ﹶʼ0.MTH3026(), CLS27.MTH889("import_done"));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

