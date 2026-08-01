// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS29;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS1284 implements CLS2 {
    public final ArrayList FLD3513;
    public final String FLD3514;
    public final CLS29 FLD3515;
    public final CLS366 FLD3516;

    public CLS1284(CLS366 ﾞᐧ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD3513 = arrayList0;
        this.FLD3515 = ˎᵢ0;
        this.FLD3514 = s;
        this.FLD3516 = ﾞᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.FLD3513.addAll(arrayList0);
            HashSet hashSet0 = new HashSet();
            Iterator iterator0 = this.FLD3513.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                hashSet0.add("");
            }
            String s2 = TextUtils.join(";", hashSet0);
            this.FLD3515.MTH922(s2, "momentscontainer_" + this.FLD3514);
            this.FLD3516.notifyDataSetChanged();
        }
    }
}

