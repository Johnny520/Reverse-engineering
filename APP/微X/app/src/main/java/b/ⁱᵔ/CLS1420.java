// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ᐧˉ.CLS1156;
import b.ᵔʾ.CLS314;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS1420 implements CLS2 {
    public final HashSet FLD4144;
    public final CLS1573 FLD4145;

    public CLS1420(CLS1573 ᵢﹳ0, HashSet hashSet0) {
        this.FLD4145 = ᵢﹳ0;
        this.FLD4144 = hashSet0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return;
        }
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            HashSet hashSet0 = new HashSet(this.FLD4144);
            Iterator iterator1 = hashSet0.iterator();
            while(iterator1.hasNext()) {
                String[] arr_s = new String[1];
                Object object1 = iterator1.next();
                arr_s[0] = (String)object1;
                if(CLS502.MTH6934("", arr_s)) {
                    iterator1.remove();
                }
            }
            if(CLS66.MTH1455("")) {
                String s2 = CLS27.MTH889("reason");
                CLS1156 ᵔᵎ0 = new CLS1156(ˊﾞ0, hashSet0, 28);
                CLS523.MTH7165(this.FLD4145.FLD4922, "", s2, "", 1, ((CLS16)ᵔᵎ0));
            }
            else {
                ArrayList arrayList1 = new ArrayList(hashSet0);
                CLS314.FLD3231.MTH5003("", null, arrayList1);
            }
        }
        CLS314.FLD3231.MTH5002();
    }
}

