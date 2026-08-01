// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.widget.ImageView;
import java.io.File;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;

public final class CLS316 implements CLS141 {
    public final ImageView FLD1044;
    public final CLS331 FLD1045;

    public CLS316(CLS331 ﾞᐧ0, ImageView imageView0) {
        this.FLD1045 = ﾞᐧ0;
        this.FLD1044 = imageView0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        try {
            this.FLD1045.FLD1086.MTH2388("");
            CLS125.MTH2041(new File(this.FLD1045.FLD1088));
            this.FLD1044.setImageResource(0x106000D);
            this.FLD1045.FLD1088 = "";
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

