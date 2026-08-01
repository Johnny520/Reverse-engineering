// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Environment;
import android.widget.ImageView;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS442;
import java.io.File;

public final class CLS653 implements CLS3 {
    public final int FLD649;
    public final File FLD650;
    public final CLS881 FLD651;
    public final ImageView FLD652;

    public CLS653(CLS881 ﾞˏ0, ImageView imageView0, File file0, int v) {
        this.FLD649 = v;
        this.FLD651 = ﾞˏ0;
        this.FLD652 = imageView0;
        this.FLD650 = file0;
        super();
    }

    public CLS653(CLS881 ﾞˏ0, File file0, ImageView imageView0, int v) {
        this.FLD649 = v;
        this.FLD651 = ﾞˏ0;
        this.FLD650 = file0;
        this.FLD652 = imageView0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        ImageView imageView0 = this.FLD652;
        File file0 = this.FLD650;
        CLS881 ﾞˏ0 = this.FLD651;
        switch(this.FLD649) {
            case 0: {
                ﾞˏ0.getClass();
                if(CLS31.MTH1024(file0.getAbsolutePath())) {
                    ﾞˏ0.MTH3110(imageView0, file0.getAbsolutePath());
                }
                return;
            }
            case 1: {
                ﾞˏ0.getClass();
                ﾞˏ0.MTH3114(imageView0, file0.getAbsolutePath());
                return;
            }
            case 2: {
                CLS442 ˎᵢ0 = new CLS442(((CLS140)ﾞˏ0).MTH3042());
                ˎᵢ0.MTH6224("jpg,jpeg,png");
                ˎᵢ0.MTH6226(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                ˎᵢ0.MTH6228(((CLS440)new CLS638(ﾞˏ0, imageView0, file0, 1)));
                return;
            }
            case 3: {
                ﾞˏ0.getClass();
                String s1 = file0.getAbsolutePath();
                try {
                    ﾞˏ0.FLD1494 = s1;
                    ﾞˏ0.FLD1517 = imageView0;
                    ﾞˏ0.MTH3111(5005, 1, 1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 4: {
                ﾞˏ0.getClass();
                if(CLS31.MTH1024(file0.getAbsolutePath())) {
                    ﾞˏ0.MTH3110(imageView0, file0.getAbsolutePath());
                }
                return;
            }
            case 5: {
                ﾞˏ0.getClass();
                ﾞˏ0.MTH3114(imageView0, file0.getAbsolutePath());
                return;
            }
            case 6: {
                CLS442 ˎᵢ1 = new CLS442(((CLS140)ﾞˏ0).MTH3042());
                ˎᵢ1.MTH6224("jpg,jpeg,png,gif");
                ˎᵢ1.MTH6226(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                ˎᵢ1.MTH6228(((CLS440)new CLS638(ﾞˏ0, imageView0, file0, 0)));
                return;
            }
            default: {
                ﾞˏ0.getClass();
                String s = file0.getAbsolutePath();
                try {
                    ﾞˏ0.FLD1494 = s;
                    ﾞˏ0.FLD1517 = imageView0;
                    ﾞˏ0.MTH3111(5005, 1, 1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

