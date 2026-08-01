// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import android.webkit.WebView;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS69;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;

public final class CLS1491 implements CLS12 {
    public final CLS69 FLD4467;
    public final ArrayList FLD4468;
    public final CLS1620 FLD4469;
    public final ArrayList FLD4470;
    public final WebView FLD4471;
    public final CLS29 FLD4472;
    public final ArrayList FLD4473;

    public CLS1491(CLS69 ʾᵢ0, ArrayList arrayList0, CLS1620 ˊˏ0, WebView webView0, ArrayList arrayList1, ArrayList arrayList2, CLS29 ˎᵢ0) {
        this.FLD4467 = ʾᵢ0;
        this.FLD4470 = arrayList0;
        this.FLD4469 = ˊˏ0;
        this.FLD4471 = webView0;
        this.FLD4468 = arrayList1;
        this.FLD4473 = arrayList2;
        this.FLD4472 = ˎᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        String s1;
        String s;
        int v = (int)(((Integer)this.FLD4467.MTH1565(((String)object0))));
        CLS1620 ˊˏ0 = this.FLD4469;
        if(v == 1) {
            s = (String)this.FLD4470.get(ˊˏ0.FLD5219.FLD5194);
            if(!TextUtils.isEmpty(s)) {
                s1 = CLS370.MTH5289(4100832983944844085L);
                this.FLD4471.loadData(s, "text/html", s1);
            }
        }
        else if(v == 2) {
            s = (String)this.FLD4468.get(ˊˏ0.FLD5219.FLD5194);
            if(!TextUtils.isEmpty(s)) {
                s1 = CLS370.MTH5289(4100833052664320821L);
                this.FLD4471.loadData(s, "text/html", s1);
            }
        }
        else {
            s = (String)this.FLD4473.get(ˊˏ0.FLD5219.FLD5194);
            if(!TextUtils.isEmpty(s)) {
                s1 = CLS370.MTH5289(0x38E915FF2B3CD335L);
                this.FLD4471.loadData(s, "text/html", s1);
            }
        }
        this.FLD4472.MTH922(v, "web_img_search_type");
    }
}

