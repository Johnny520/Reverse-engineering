// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.graphics.Bitmap;
import android.widget.ScrollView;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ٴـ.CLS896.CLS170;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.util.ArrayList;

public final class CLS834 implements CLS2 {
    public final ScrollView FLD1285;
    public final CLS629 FLD1286;

    public CLS834(CLS629 ʻˋ0, ScrollView scrollView0) {
        this.FLD1286 = ʻˋ0;
        this.FLD1285 = scrollView0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        Bitmap bitmap0 = CLS518.MTH7055(this.FLD1285);
        this.FLD1286.getClass();
        File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "WechatXposed_moments_img_screenshot");
        CLS518.MTH7058(file0, bitmap0);
        CLS886 ʾᵢ0 = new CLS886(file0);
        this.FLD1286.FLD1447.getClass();
        CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)ʾᵢ0), 3, arrayList0);
        this.FLD1286.FLD1447.MTH3029(ˆٴ$ˆٴ0);
    }
}

