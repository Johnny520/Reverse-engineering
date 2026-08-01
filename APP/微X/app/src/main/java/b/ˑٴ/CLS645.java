// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.widget.ImageView;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import java.io.File;

public final class CLS645 implements CLS11 {
    public final ImageView FLD621;
    public final CLS881 FLD622;

    public CLS645(CLS881 ﾞˏ0, ImageView imageView0) {
        this.FLD622 = ﾞˏ0;
        this.FLD621 = imageView0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            this.FLD622.FLD1493.MTH798("");
            CLS31.MTH1011(new File(this.FLD622.FLD1501));
            this.FLD621.setImageResource(0x106000D);
            this.FLD622.FLD1501 = "";
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

