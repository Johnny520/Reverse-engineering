// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import b.ʻˑ.CLS17;
import b.ⁱᵔ.CLS442.CLS441;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class CLS567 implements CLS17 {
    public final int FLD125;
    public final CLS441 FLD126;

    public CLS567(CLS441 ˎᵢ$ᵔʾ0, int v) {
        this.FLD125 = v;
        this.FLD126 = ˎᵢ$ᵔʾ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS441 ˎᵢ$ᵔʾ0 = this.FLD126;
        switch(this.FLD125) {
            case 0: {
                ˎᵢ$ᵔʾ0.MTH6222(((InputStream)arr_object[0]));
                return;
            }
            case 1: {
                File file0 = (File)arr_object[0];
                CLS27.MTH895().MTH922(file0.getParent(), "settings_save_dir");
                try {
                    ˎᵢ$ᵔʾ0.MTH6222(new FileInputStream(file0));
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 2: {
                ˎᵢ$ᵔʾ0.MTH6222(((InputStream)arr_object[0]));
                return;
            }
            default: {
                try {
                    ˎᵢ$ᵔʾ0.MTH6222(new FileInputStream(((File)arr_object[0])));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

