// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import android.webkit.WebView;
import b.ʻˑ.CLS12;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;

public final class CLS1468 implements CLS12 {
    public final int FLD4370;
    public final WebView FLD4371;
    public final CLS1620 FLD4372;
    public final ArrayList FLD4373;
    public final ArrayList FLD4374;

    public CLS1468(CLS1620 ˊˏ0, ArrayList arrayList0, ArrayList arrayList1, WebView webView0) {
        this.FLD4370 = 0;
        super();
        this.FLD4372 = ˊˏ0;
        this.FLD4373 = arrayList0;
        this.FLD4374 = arrayList1;
        this.FLD4371 = webView0;
    }

    public CLS1468(ArrayList arrayList0, CLS1620 ˊˏ0, ArrayList arrayList1, WebView webView0) {
        this.FLD4370 = 1;
        super();
        this.FLD4373 = arrayList0;
        this.FLD4372 = ˊˏ0;
        this.FLD4374 = arrayList1;
        this.FLD4371 = webView0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ArrayList arrayList0 = this.FLD4373;
        WebView webView0 = this.FLD4371;
        ArrayList arrayList1 = this.FLD4374;
        CLS1620 ˊˏ0 = this.FLD4372;
        if(this.FLD4370 == 0) {
            if(object0 != null && !((ArrayList)object0).isEmpty()) {
                ˊˏ0.MTH801(0);
                ArrayList arrayList2 = new ArrayList();
                for(Object object1: ((ArrayList)object0)) {
                    String s = (String)object1;
                    if(s.endsWith("gif") && !arrayList0.contains(s)) {
                        arrayList0.add(s);
                        arrayList2.add(s);
                    }
                }
                String s1 = CLS432.MTH6172(arrayList2);
                arrayList1.add(s1);
                ˊˏ0.MTH7254(String.valueOf(arrayList1.size()));
                if(!TextUtils.isEmpty(s1)) {
                    webView0.loadData(s1, "text/html", "UTF-8");
                }
            }
            return;
        }
        if(object0 != null && !((ArrayList)object0).isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList0.clear();
            ˊˏ0.MTH801(8);
            for(Object object2: ((ArrayList)object0)) {
                String s2 = (String)object2;
                if(s2.endsWith("gif")) {
                    arrayList0.add(s2);
                    arrayList3.add(s2);
                }
            }
            arrayList1.clear();
            String s3 = CLS432.MTH6172(arrayList3);
            arrayList1.add(s3);
            if(!TextUtils.isEmpty(s3)) {
                webView0.loadData(s3, "text/html", "UTF-8");
            }
        }
    }
}

