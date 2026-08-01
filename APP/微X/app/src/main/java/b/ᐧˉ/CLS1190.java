// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˊﾞ.CLS613;
import b.ⁱᵔ.CLS412;
import java.io.File;

public final class CLS1190 implements CLS12 {
    public final int FLD2785;
    public final Activity FLD2786;
    public final File FLD2787;

    public CLS1190(int v, Activity activity0, File file0) {
        this.FLD2785 = v;
        this.FLD2787 = file0;
        this.FLD2786 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        Activity activity0 = this.FLD2786;
        File file0 = this.FLD2787;
        switch(this.FLD2785) {
            case 0: {
                File file2 = new File(((File)object0), "sounds.zip");
                CLS31.MTH1011(file2);
                if(CLS613.MTH1976(file0, file2)) {
                    CLS412.MTH6013(activity0, CLS27.MTH889("export_") + ": " + file2.getAbsolutePath());
                    CLS31.MTH1035(file0);
                }
                return;
            }
            case 1: {
                File file3 = new File(((File)object0), file0.getName() + ".mp4");
                if(CLS31.MTH1025(file0, file3)) {
                    CLS412.MTH6013(activity0, CLS27.MTH889("file_written_to") + file3.getAbsolutePath());
                }
                return;
            }
            default: {
                File file1 = new File(((File)object0), "voices.zip");
                CLS31.MTH1011(file1);
                if(CLS613.MTH1976(file0, file1)) {
                    CLS412.MTH6013(activity0, CLS27.MTH889("export_") + ": " + file1.getAbsolutePath());
                    CLS31.MTH1035(file0);
                }
            }
        }
    }
}

