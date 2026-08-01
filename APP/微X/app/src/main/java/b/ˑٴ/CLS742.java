// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.graphics.Bitmap;
import android.widget.ScrollView;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.util.ArrayList;

public final class CLS742 implements CLS3 {
    public final int FLD944;
    public final ScrollView FLD945;
    public final CLS629 FLD946;

    public CLS742(CLS629 ʻˋ0, ScrollView scrollView0, int v) {
        this.FLD944 = v;
        this.FLD946 = ʻˋ0;
        this.FLD945 = scrollView0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        ScrollView scrollView0 = this.FLD945;
        CLS629 ʻˋ0 = this.FLD946;
        switch(this.FLD944) {
            case 0: {
                CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS834(ʻˋ0, scrollView0)), -1);
                return;
            }
            case 1: {
                ʻˋ0.getClass();
                Bitmap bitmap1 = CLS518.MTH7055(scrollView0);
                File file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "WechatXposed_moments_img_screenshot");
                CLS518.MTH7058(file1, bitmap1);
                if(CLS31.MTH1001(file1)) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(file1.getAbsolutePath());
                    CLS466.MTH6536(null, arrayList0);
                }
                return;
            }
            default: {
                ʻˋ0.getClass();
                Bitmap bitmap0 = CLS518.MTH7055(scrollView0);
                File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "WechatXposed_moments_img_screenshot");
                CLS518.MTH7058(file0, bitmap0);
                CLS466.MTH6503(file0.getAbsolutePath(), "image/png");
            }
        }
    }
}

