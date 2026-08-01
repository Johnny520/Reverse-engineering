// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS4;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS78;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class CLS637 implements CLS4 {
    public final CLS877 FLD586;
    public final int FLD587;
    public final long FLD588;
    public final List[] FLD589;
    public final Object FLD590;

    public CLS637(int v, long v1, CLS877 ﹶﾞ0, Object object0, List[] arr_list) {
        this.FLD586 = ﹶﾞ0;
        this.FLD589 = arr_list;
        this.FLD588 = v1;
        this.FLD590 = object0;
        this.FLD587 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS4
    public final void MTH776(String s) {
        try {
            List[] arr_list = this.FLD589;
            long v = this.FLD588;
            Object object0 = this.FLD590;
            int v1 = this.FLD587;
            CLS877 ﹶﾞ0 = this.FLD586;
            CLS29 ˎᵢ0 = ﹶﾞ0.FLD1445;
            HashSet hashSet0 = new HashSet();
            String[] arr_s = s.split(Pattern.quote("|"));
            if(!arr_list[0].isEmpty()) {
                for(Object object1: arr_list[0]) {
                    hashSet0.add(((String)CLS166.MTH3194(object1, CLS27.MTH897("snsFieldUsername"))));
                }
            }
            ArrayList arrayList0 = new ArrayList();
            boolean z = ˎᵢ0.MTH938("fakelikes_use_all_contacts", false);
            CLS371 ʻ0 = ﹶﾞ0.FLD1444;
            if(z) {
                ʻ0.MTH5348(arrayList0);
            }
            else {
                ʻ0.MTH5305(CLS27.MTH904(), arrayList0);
            }
            String s1 = ˎᵢ0.MTH925("fake_excl", "");
            if(!TextUtils.isEmpty(s1)) {
                Iterator iterator1 = arrayList0.iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                    if(CLS502.MTH6934(s1, new String[]{""})) {
                        iterator1.remove();
                    }
                }
            }
            if(ˎᵢ0.MTH938("fakelikes_random_sort", false)) {
                Collections.shuffle(arrayList0);
            }
            if(ˎᵢ0.MTH938("selflikes_autoselect_enable", false)) {
                int v3 = Math.min(arrayList0.size(), ˎᵢ0.MTH927(50, "fakelikes_autoselect_cnt"));
                for(int v2 = 0; hashSet0.size() < v3; ++v2) {
                    CLS78 ˊﾞ0 = (CLS78)arrayList0.get(v2);
                    if(!hashSet0.contains("")) {
                        hashSet0.add("");
                    }
                }
            }
            CLS387.MTH5585(false, ((CLS140)ﹶﾞ0).MTH3042(), arrayList0, ((CLS2)new CLS656(ﹶﾞ0, v, arr_list, object0, arr_s, v1)), TextUtils.join(",", hashSet0), -1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

