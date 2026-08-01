// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import android.webkit.WebView;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;
import java.util.Arrays;

public final class CLS1603 implements CLS3 {
    public final String[] FLD5073;
    public final WebView FLD5074;
    public final boolean FLD5075;
    public final CLS29 FLD5076;
    public final int FLD5077;

    public CLS1603(String[] arr_s, CLS29 ˎᵢ0, boolean z, int v, WebView webView0) {
        this.FLD5073 = arr_s;
        this.FLD5076 = ˎᵢ0;
        this.FLD5075 = z;
        this.FLD5077 = v;
        this.FLD5074 = webView0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD5073[0];
        if(!TextUtils.isEmpty(s)) {
            String s1 = CLS182.MTH3484(4100830608827929397L, new StringBuilder(), s);
            ArrayList arrayList0 = new ArrayList(Arrays.asList(this.FLD5076.MTH925(s1, "").split(";")));
            ArrayList arrayList1 = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for(Object object0: arrayList0) {
                String s2 = (String)object0;
                if(s2.endsWith("jpg") || s2.endsWith("png")) {
                    arrayList1.add(s2);
                }
                else if(s2.endsWith("gif")) {
                    arrayList2.add(s2);
                }
            }
            String s3 = this.FLD5075 ? CLS432.MTH6170(arrayList1) : CLS432.MTH6172(arrayList1);
            String s4 = this.FLD5075 ? CLS432.MTH6170(arrayList2) : CLS432.MTH6172(arrayList2);
            String s5 = this.FLD5075 ? CLS432.MTH6170(arrayList0) : CLS432.MTH6172(arrayList0);
            int v = this.FLD5077;
            WebView webView0 = this.FLD5074;
            if(v == 1) {
                if(!TextUtils.isEmpty(s3)) {
                    webView0.loadData(s3, "text/html", "UTF-8");
                }
            }
            else if(v == 2) {
                if(!TextUtils.isEmpty(s4)) {
                    webView0.loadData(s4, "text/html", "UTF-8");
                }
            }
            else if(!TextUtils.isEmpty(s5)) {
                webView0.loadData(s5, "text/html", "UTF-8");
            }
        }
    }
}

