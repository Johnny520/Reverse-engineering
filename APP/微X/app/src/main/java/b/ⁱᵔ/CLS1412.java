// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS279;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class CLS1412 implements CLS2 {
    public final HashMap FLD4052;
    public final String FLD4053;

    public CLS1412(String s, HashMap hashMap0) {
        this.FLD4052 = hashMap0;
        this.FLD4053 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        HashSet hashSet0 = new HashSet(this.FLD4052.values());
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            boolean z = hashSet0.contains("");
            hashSet0.remove("");
            if(!z) {
                arrayList1.add("");
            }
        }
        String s2 = this.FLD4053;
        CLS279.FLD2908.MTH4654(s2, arrayList1);
        ArrayList arrayList2 = new ArrayList(hashSet0);
        if(!TextUtils.isEmpty(s2) && !arrayList2.isEmpty()) {
            int v = CLS371.FLD3470.MTH5297(s2);
            LinkedList linkedList0 = new LinkedList();
            for(Object object0: arrayList2) {
                linkedList0.add(CLS279.MTH4655(v, ((String)object0)));
            }
            CLS66.MTH1379(linkedList0);
        }
    }
}

