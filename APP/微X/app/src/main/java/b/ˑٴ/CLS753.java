// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import android.webkit.WebView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ⁱᵔ.CLS1468;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS432;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;

public final class CLS753 implements CLS12 {
    public final int FLD985;
    public final Object FLD986;
    public final ArrayList FLD987;
    public final ArrayList FLD988;
    public final Object FLD989;
    public final Object FLD990;
    public final Object FLD991;

    public CLS753(CLS718 ˎـ0, String s, ArrayList arrayList0, CLS3 ˆٴ0, ArrayList arrayList1, ArrayList arrayList2) {
        this.FLD985 = 0;
        super();
        this.FLD989 = ˎـ0;
        this.FLD986 = s;
        this.FLD988 = arrayList0;
        this.FLD990 = ˆٴ0;
        this.FLD987 = arrayList1;
        this.FLD991 = arrayList2;
    }

    public CLS753(String[] arr_s, CLS29 ˎᵢ0, ArrayList arrayList0, CLS1620 ˊˏ0, ArrayList arrayList1, WebView webView0) {
        this.FLD985 = 1;
        super();
        this.FLD989 = arr_s;
        this.FLD986 = ˎᵢ0;
        this.FLD988 = arrayList0;
        this.FLD991 = ˊˏ0;
        this.FLD987 = arrayList1;
        this.FLD990 = webView0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ArrayList arrayList0 = this.FLD987;
        ArrayList arrayList1 = this.FLD988;
        Object object1 = this.FLD991;
        Object object2 = this.FLD990;
        Object object3 = this.FLD986;
        Object object4 = this.FLD989;
        if(this.FLD985 == 0) {
            ((CLS718)object4).FLD860.FLD1147.MTH1646(((String)object3), arrayList1);
            ((CLS3)object2).MTH774();
            CLS404.MTH5896(((String)object3), arrayList0, ((ArrayList)object1));
            return;
        }
        if(!TextUtils.isEmpty(((String)object0))) {
            String s = ((String)object0).trim();
            ((String[])object4)[0] = s;
            CLS432.MTH6178(((CLS29)object3).MTH927(1, "web_img_search_src"), ((CLS12)new CLS1468(arrayList1, ((CLS1620)object1), arrayList0, ((WebView)object2))), s);
        }
    }
}

