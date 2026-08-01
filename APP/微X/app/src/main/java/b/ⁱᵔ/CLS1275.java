// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS363;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS1275 implements CLS11 {
    public final CLS363 FLD3472;
    public final Activity FLD3473;
    public final CLS61 FLD3474;

    public CLS1275(CLS363 ﾞٴ0, CLS61 ﾞٴ1, Activity activity0) {
        this.FLD3472 = ﾞٴ0;
        this.FLD3474 = ﾞٴ1;
        this.FLD3473 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.FLD3472.MTH5261()) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            String[] arr_s = CLS502.MTH6941("");
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if((!CLS27.MTH895().MTH938("dup_members_excl_owner", false) || !s.equals("")) && (!CLS27.MTH895().MTH938("dup_members_excl_mod", false) || !this.FLD3474.MTH1339("", s) && !CLS66.MTH1433("", s))) {
                    if(hashMap0.containsKey(s)) {
                        HashSet hashSet0 = (HashSet)hashMap0.get(s);
                        if(hashSet0 != null) {
                            hashSet0.add("");
                        }
                    }
                    else {
                        HashSet hashSet1 = new HashSet();
                        hashSet1.add("");
                        hashMap0.put(s, hashSet1);
                    }
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hashMap0.keySet()) {
            String s1 = (String)object1;
            HashSet hashSet2 = (HashSet)hashMap0.get(s1);
            if(hashSet2 != null && hashSet2.size() != 1) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put(CLS182.MTH3496(0x38EAE76B2B3CD335L, contentValues0, s1, 0x38EAE7702B3CD335L), TextUtils.join(",", hashSet2));
                StringBuilder stringBuilder0 = new StringBuilder("<b>" + CLS371.FLD3470.MTH5311(s1) + "</b>");
                for(Object object2: hashSet2) {
                    stringBuilder0.append("<br>");
                    stringBuilder0.append(CLS371.FLD3470.MTH5316(((String)object2)));
                }
                contentValues0.put("desc", stringBuilder0.toString());
                arrayList0.add(contentValues0);
            }
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        String s2 = CLS27.MTH889("duplicate_members_list");
        CLS1562 ᵔᵎ0 = new CLS1562(this.FLD3473, arrayList0, 3);
        CLS1562 ᵔᵎ1 = new CLS1562(this.FLD3473, arrayList0, 4);
        CLS523.MTH7143(this.FLD3473, s2, ((CLS379)ᵔᵎ0), ((CLS378)ᵔᵎ1));
    }
}

