// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Environment;
import android.widget.ImageView;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS442;

public final class CLS730 implements CLS3 {
    public final int FLD898;
    public final ImageView FLD899;
    public final CLS881 FLD900;

    public CLS730(CLS881 ﾞˏ0, ImageView imageView0, int v) {
        this.FLD898 = v;
        this.FLD900 = ﾞˏ0;
        this.FLD899 = imageView0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        ImageView imageView0 = this.FLD899;
        CLS881 ﾞˏ0 = this.FLD900;
        switch(this.FLD898) {
            case 0: {
                if(CLS31.MTH1024(ﾞˏ0.FLD1501)) {
                    ﾞˏ0.MTH3110(imageView0, ﾞˏ0.FLD1501);
                }
                return;
            }
            case 1: {
                ﾞˏ0.getClass();
                try {
                    ﾞˏ0.FLD1517 = imageView0;
                    CLS390.MTH5623(((CLS140)ﾞˏ0).MTH3042(), 5003);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 2: {
                CLS442 ˎᵢ0 = new CLS442(((CLS140)ﾞˏ0).MTH3042());
                ˎᵢ0.MTH6224("jpg,jpeg,png");
                ˎᵢ0.MTH6226(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                ˎᵢ0.MTH6228(((CLS440)new CLS1255(ﾞˏ0, imageView0, 23)));
                return;
            }
            default: {
                ﾞˏ0.getClass();
                try {
                    ﾞˏ0.FLD1517 = imageView0;
                    ﾞˏ0.MTH3111(5006, 1, 1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

