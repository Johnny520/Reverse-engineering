// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS164;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public final class CLS677 implements CLS8 {
    public final HashMap FLD732;
    public final Object FLD733;
    public final String FLD734;
    public final CLS770 FLD735;

    public CLS677(CLS770 ٴʿ0, HashMap hashMap0, String s, Object object0) {
        this.FLD735 = ٴʿ0;
        this.FLD732 = hashMap0;
        this.FLD734 = s;
        this.FLD733 = object0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        HashMap hashMap0 = this.FLD732;
        if(hashMap0.isEmpty()) {
            return;
        }
        HashSet hashSet0 = new HashSet();
        String s = ((ContentValues)object0).getAsString("excl_users");
        if(!TextUtils.isEmpty(s)) {
            hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s)));
        }
        int v = ((ContentValues)object0).containsKey("min_score") ? CLS182.MTH3474(0x38EB43D22B3CD335L, ((ContentValues)object0)) : 0;
        LinkedList linkedList0 = new LinkedList(hashMap0.entrySet());
        Collections.sort(linkedList0, new CLS110(0));
        for(Object object1: linkedList0) {
            String s1 = (String)((Map.Entry)object1).getKey();
            int v1 = (int)(((Integer)((Map.Entry)object1).getValue()));
            if(!hashSet0.contains(s1) && v1 > v) {
                CLS770 ٴʿ0 = this.FLD735;
                String s2 = this.FLD734;
                if(ٴʿ0.FLD1063 != null && (!CLS27.MTH890("SubCoreExDeviceClass") || !CLS27.MTH890("weRunLikeClass"))) {
                    Method method0 = ٴʿ0.FLD1063;
                    if(method0 == null) {
                        CLS66.MTH1467(s1, s2);
                    }
                    else {
                        CLS164.MTH3178(this.FLD733, method0, new Object[]{s1, 1});
                    }
                }
                else {
                    CLS66.MTH1422(s1, s2);
                }
            }
        }
    }
}

