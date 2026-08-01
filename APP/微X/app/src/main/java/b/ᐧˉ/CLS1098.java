// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.webkit.WebView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS69;
import b.ⁱʾ.CLS350;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1284;
import b.ⁱᵔ.CLS1468;
import b.ⁱᵔ.CLS1491;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403.CLS1376;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1098 implements CLS3 {
    public final Object FLD2385;
    public final int FLD2386;
    public final Serializable FLD2387;
    public final ArrayList FLD2388;
    public final Object FLD2389;
    public final Object FLD2390;
    public final Object FLD2391;
    public final Object FLD2392;

    public CLS1098(Activity activity0, CLS29 ˎᵢ0, String s, String s1, ArrayList arrayList0, String s2, CLS369 ﾞᵎ0) {
        this.FLD2386 = 3;
        super();
        this.FLD2389 = activity0;
        this.FLD2392 = ˎᵢ0;
        this.FLD2391 = s;
        this.FLD2390 = s1;
        this.FLD2388 = arrayList0;
        this.FLD2387 = s2;
        this.FLD2385 = ﾞᵎ0;
    }

    public CLS1098(Activity activity0, CLS29 ˎᵢ0, ArrayList arrayList0, CLS1620 ˊˏ0, WebView webView0, ArrayList arrayList1, ArrayList arrayList2) {
        this.FLD2386 = 1;
        super();
        this.FLD2389 = activity0;
        this.FLD2392 = ˎᵢ0;
        this.FLD2388 = arrayList0;
        this.FLD2391 = ˊˏ0;
        this.FLD2385 = webView0;
        this.FLD2390 = arrayList1;
        this.FLD2387 = arrayList2;
    }

    public CLS1098(CLS29 ˎᵢ0, CLS1620 ˊˏ0, ArrayList arrayList0, ArrayList arrayList1, WebView webView0, String[] arr_s, int[] arr_v) {
        this.FLD2386 = 2;
        super();
        this.FLD2392 = ˎᵢ0;
        this.FLD2389 = ˊˏ0;
        this.FLD2388 = arrayList0;
        this.FLD2390 = arrayList1;
        this.FLD2391 = webView0;
        this.FLD2387 = arr_s;
        this.FLD2385 = arr_v;
    }

    public CLS1098(CLS1019 ˎʻ0, Activity activity0, HashSet hashSet0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS350 ᐧⁱ0) {
        this.FLD2386 = 0;
        super();
        this.FLD2392 = ˎʻ0;
        this.FLD2389 = activity0;
        this.FLD2391 = hashSet0;
        this.FLD2388 = arrayList0;
        this.FLD2390 = arrayList1;
        this.FLD2387 = arrayList2;
        this.FLD2385 = ᐧⁱ0;
    }

    public CLS1098(CLS371 ʻ0, String s, Activity activity0, ArrayList arrayList0, CLS29 ˎᵢ0, String s1, CLS366 ﾞᐧ0) {
        this.FLD2386 = 4;
        super();
        this.FLD2392 = ʻ0;
        this.FLD2391 = s;
        this.FLD2389 = activity0;
        this.FLD2388 = arrayList0;
        this.FLD2390 = ˎᵢ0;
        this.FLD2387 = s1;
        this.FLD2385 = ﾞᐧ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        ArrayList arrayList0 = this.FLD2388;
        Object object0 = this.FLD2385;
        Serializable serializable0 = this.FLD2387;
        Object object1 = this.FLD2390;
        Object object2 = this.FLD2391;
        Object object3 = this.FLD2389;
        Object object4 = this.FLD2392;
        switch(this.FLD2386) {
            case 0: {
                ((CLS1019)object4).getClass();
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1016(((CLS1019)object4), ((HashSet)object2), arrayList0, ((ArrayList)object1), ((ArrayList)serializable0), ((CLS350)object0))));
                return;
            }
            case 1: {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(CLS27.MTH889("radio_image"));
                arrayList2.add(CLS27.MTH889("radio_gif"));
                arrayList2.add(CLS27.MTH889("radio_all"));
                CLS69 ʾᵢ0 = new CLS69();
                CLS395.MTH5732(((Activity)object3), CLS182.MTH3497(0, ʾᵢ0, CLS182.MTH3497(2, ʾᵢ0, CLS182.MTH3497(1, ʾᵢ0, CLS27.MTH889("radio_image"), 4100832133541319477L), 4100832176490992437L), 4100832219440665397L), arrayList2, ((String)ʾᵢ0.MTH1559(((CLS29)object4).MTH927(0, "web_img_search_type"))), ((CLS12)new CLS1491(ʾᵢ0, arrayList0, ((CLS1620)object2), ((WebView)object0), ((ArrayList)object1), ((ArrayList)serializable0), ((CLS29)object4))));
                return;
            }
            case 2: {
                int v = ((CLS29)object4).MTH927(1, "web_img_search_src");
                CLS1468 ˑˈ0 = new CLS1468(((CLS1620)object3), arrayList0, ((ArrayList)object1), ((WebView)object2));
                String s = ((String[])serializable0)[0];
                int v1 = ((int[])object0)[0] + 1;
                ((int[])object0)[0] = v1;
                CLS432.MTH6183(v, ((CLS12)ˑˈ0), s, v1);
                return;
            }
            case 3: {
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1376(((CLS29)object4), ((String)object2), ((String)object1), arrayList0, ((String)serializable0), ((CLS369)object0))));
                return;
            }
            default: {
                ArrayList arrayList1 = new ArrayList();
                ((CLS371)object4).MTH5381(((String)object2), arrayList1);
                CLS387.MTH5585(false, ((Activity)object3), arrayList1, ((CLS2)new CLS1284(((CLS366)object0), ((CLS29)object1), ((String)serializable0), arrayList0)), ((CLS29)object1).MTH925(CLS182.MTH3484(0x38EA8D602B3CD335L, new StringBuilder(), ((String)serializable0)), ""), -1);
            }
        }
    }
}

