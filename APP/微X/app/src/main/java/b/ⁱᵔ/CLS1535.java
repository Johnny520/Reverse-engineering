// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.webkit.WebView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1535 implements CLS3 {
    public final int[] FLD4753;
    public final WebView FLD4754;
    public final String[] FLD4755;
    public final CLS29 FLD4756;
    public final ArrayList FLD4757;
    public final HashSet FLD4758;
    public final CLS1620 FLD4759;
    public final HashSet FLD4760;
    public final ArrayList FLD4761;
    public final ArrayList FLD4762;

    public CLS1535(CLS29 ˎᵢ0, CLS1620 ˊˏ0, HashSet hashSet0, HashSet hashSet1, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, WebView webView0, String[] arr_s, int[] arr_v) {
        this.FLD4756 = ˎᵢ0;
        this.FLD4759 = ˊˏ0;
        this.FLD4758 = hashSet0;
        this.FLD4760 = hashSet1;
        this.FLD4757 = arrayList0;
        this.FLD4762 = arrayList1;
        this.FLD4761 = arrayList2;
        this.FLD4754 = webView0;
        this.FLD4755 = arr_s;
        this.FLD4753 = arr_v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        int v = this.FLD4756.MTH927(1, "web_img_search_src");
        CLS1399 ˈﾞ0 = new CLS1399(this.FLD4759, this.FLD4758, this.FLD4760, this.FLD4757, this.FLD4762, this.FLD4761, this.FLD4756, this.FLD4754);
        String s = this.FLD4755[0];
        int v1 = this.FLD4753[0] + 1;
        this.FLD4753[0] = v1;
        CLS432.MTH6183(v, ((CLS12)ˈﾞ0), s, v1);
    }
}

