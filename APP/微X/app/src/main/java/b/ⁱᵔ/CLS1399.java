// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import android.webkit.WebView;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS29;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1399 implements CLS12 {
    public final CLS29 FLD3970;
    public final WebView FLD3971;
    public final int FLD3972;
    public final ArrayList FLD3973;
    public final HashSet FLD3974;
    public final HashSet FLD3975;
    public final CLS1620 FLD3976;
    public final ArrayList FLD3977;
    public final ArrayList FLD3978;

    public CLS1399(CLS1620 ˊˏ0, HashSet hashSet0, HashSet hashSet1, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS29 ˎᵢ0, WebView webView0) {
        this.FLD3972 = 0;
        super();
        this.FLD3976 = ˊˏ0;
        this.FLD3975 = hashSet0;
        this.FLD3974 = hashSet1;
        this.FLD3973 = arrayList0;
        this.FLD3978 = arrayList1;
        this.FLD3977 = arrayList2;
        this.FLD3970 = ˎᵢ0;
        this.FLD3971 = webView0;
    }

    public CLS1399(HashSet hashSet0, HashSet hashSet1, CLS1620 ˊˏ0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, CLS29 ˎᵢ0, WebView webView0) {
        this.FLD3972 = 1;
        super();
        this.FLD3975 = hashSet0;
        this.FLD3974 = hashSet1;
        this.FLD3976 = ˊˏ0;
        this.FLD3973 = arrayList0;
        this.FLD3978 = arrayList1;
        this.FLD3977 = arrayList2;
        this.FLD3970 = ˎᵢ0;
        this.FLD3971 = webView0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        HashSet hashSet0 = this.FLD3974;
        HashSet hashSet1 = this.FLD3975;
        WebView webView0 = this.FLD3971;
        CLS29 ˎᵢ0 = this.FLD3970;
        ArrayList arrayList0 = this.FLD3977;
        ArrayList arrayList1 = this.FLD3978;
        ArrayList arrayList2 = this.FLD3973;
        CLS1620 ˊˏ0 = this.FLD3976;
        if(this.FLD3972 == 0) {
            if(object0 != null && !((ArrayList)object0).isEmpty()) {
                ˊˏ0.MTH801(0);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for(Object object1: ((ArrayList)object0)) {
                    String s = (String)object1;
                    if(!s.endsWith("jpg") && !s.endsWith("png")) {
                        if(!s.endsWith("gif") || hashSet0.contains(s)) {
                            continue;
                        }
                        hashSet0.add(s);
                        arrayList4.add(s);
                    }
                    else if(!hashSet1.contains(s)) {
                        hashSet1.add(s);
                        arrayList3.add(s);
                    }
                }
                String s1 = CLS432.MTH6170(arrayList3);
                arrayList2.add(s1);
                String s2 = CLS432.MTH6170(arrayList4);
                arrayList1.add(s2);
                String s3 = CLS432.MTH6170(((ArrayList)object0));
                arrayList0.add(s3);
                ˊˏ0.MTH7254(String.valueOf(arrayList2.size()));
                int v = ˎᵢ0.MTH927(0, "web_img_search_type");
                if(v == 1) {
                    if(!TextUtils.isEmpty(s1)) {
                        webView0.loadData(s1, "text/html", "UTF-8");
                        return;
                    }
                }
                else if(v == 2) {
                    if(!TextUtils.isEmpty(s2)) {
                        webView0.loadData(s2, "text/html", "UTF-8");
                        return;
                    }
                }
                else if(!TextUtils.isEmpty(s3)) {
                    webView0.loadData(s3, "text/html", "UTF-8");
                }
            }
            return;
        }
        if(object0 != null && !((ArrayList)object0).isEmpty()) {
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            hashSet1.clear();
            hashSet0.clear();
            ˊˏ0.MTH801(8);
            for(Object object2: ((ArrayList)object0)) {
                String s4 = (String)object2;
                if(s4.endsWith("jpg") || s4.endsWith("png")) {
                    hashSet1.add(s4);
                    arrayList5.add(s4);
                }
                else if(s4.endsWith("gif")) {
                    hashSet0.add(s4);
                    arrayList6.add(s4);
                }
            }
            arrayList2.clear();
            String s5 = CLS432.MTH6170(arrayList5);
            arrayList2.add(s5);
            arrayList1.clear();
            String s6 = CLS432.MTH6170(arrayList6);
            arrayList1.add(s6);
            arrayList0.clear();
            String s7 = CLS432.MTH6170(((ArrayList)object0));
            arrayList0.add(s7);
            int v1 = ˎᵢ0.MTH927(0, "web_img_search_type");
            if(v1 == 1) {
                if(!TextUtils.isEmpty(s5)) {
                    webView0.loadData(s5, "text/html", "UTF-8");
                }
            }
            else if(v1 == 2) {
                if(!TextUtils.isEmpty(s6)) {
                    webView0.loadData(s6, "text/html", "UTF-8");
                }
            }
            else if(!TextUtils.isEmpty(s7)) {
                webView0.loadData(s7, "text/html", "UTF-8");
            }
        }
    }
}

