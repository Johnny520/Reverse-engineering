// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS12;
import b.ﾞˎ.CLS1626;
import java.io.File;

public final class CLS1117 implements CLS12 {
    public final int FLD2497;
    public final CLS1626 FLD2498;
    public final CLS997 FLD2499;

    public CLS1117(CLS997 ˋ0, CLS1626 ـﹳ0, int v) {
        this.FLD2497 = v;
        this.FLD2499 = ˋ0;
        this.FLD2498 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS1626 ـﹳ0 = this.FLD2498;
        CLS997 ˋ0 = this.FLD2499;
        switch(this.FLD2497) {
            case 0: {
                ˋ0.getClass();
                String s1 = ((File)object0).getAbsolutePath();
                ˋ0.FLD2151.MTH922(s1, "moment_export_path");
                ـﹳ0.MTH798(s1);
                return;
            }
            case 1: {
                ˋ0.getClass();
                String s2 = ((File)object0).getAbsolutePath();
                ˋ0.FLD2151.MTH922(s2, "moment_auto_export_path");
                ـﹳ0.MTH798(s2);
                return;
            }
            default: {
                ˋ0.getClass();
                String s = ((File)object0).getAbsolutePath();
                ˋ0.FLD2151.MTH922(s, "sns_save_path");
                ـﹳ0.MTH798(s);
            }
        }
    }
}

