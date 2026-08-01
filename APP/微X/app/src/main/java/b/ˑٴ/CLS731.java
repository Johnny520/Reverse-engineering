// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.webkit.WebView;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1228;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import java.io.File;

public final class CLS731 implements CLS8 {
    public final CLS881 FLD901;

    public CLS731(CLS881 ﾞˏ0) {
        this.FLD901 = ﾞˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(CLS502.MTH6925(((String)object0)));
        String s = CLS182.MTH3475((((String)object0).endsWith("gif") ? 4101445901547787061L : 4101445923022623541L), stringBuilder0);
        File file0 = CLS25.MTH869(s, new String[0]);
        if(CLS31.MTH1001(file0)) {
            String s1 = file0.getAbsolutePath();
            CLS881 ﾞˏ0 = this.FLD901;
            ﾞˏ0.FLD1488 = s1;
            WebView webView0 = ﾞˏ0.FLD1515;
            if(webView0 != null) {
                webView0.loadUrl("file://" + ﾞˏ0.FLD1488);
            }
            Object object1 = ﾞˏ0.FLD1513;
            if(object1 != null) {
                CLS166.MTH3195(object1, CLS27.MTH897("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{ﾞˏ0.FLD1488});
            }
        }
        else {
            CLS518.MTH7066(((String)object0), new CLS1228(this, file0, s, 3));
        }
    }
}

