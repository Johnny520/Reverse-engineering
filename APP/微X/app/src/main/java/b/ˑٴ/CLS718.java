// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ⁱᵔ.CLS403;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS718 implements CLS2 {
    public final String FLD855;
    public final String FLD856;
    public final CLS3 FLD857;
    public final Activity FLD858;
    public final ArrayList FLD859;
    public final CLS794 FLD860;

    public CLS718(CLS794 ᴵʽ0, String s, Activity activity0, CLS3 ˆٴ0, ArrayList arrayList0, String s1) {
        this.FLD860 = ᴵʽ0;
        this.FLD855 = s;
        this.FLD858 = activity0;
        this.FLD857 = ˆٴ0;
        this.FLD859 = arrayList0;
        this.FLD856 = s1;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            arrayList1.add("");
        }
        String s2 = this.FLD855;
        Activity activity0 = this.FLD858;
        if(s2.startsWith("wx__c_")) {
            CLS753 יﾞ0 = new CLS753(this, this.FLD855, arrayList1, this.FLD857, this.FLD859, arrayList0);
            CLS403.MTH5870(activity0, arrayList1, this.FLD855, ((CLS12)יﾞ0), false);
            return;
        }
        if(!s2.startsWith("wx__c_") && this.FLD860.FLD1447.FLD1438.MTH6895("chatroom_container_tags")) {
            CLS403.MTH5872(false, activity0, arrayList1, ((CLS12)new CLS757(this, this.FLD856, arrayList1, this.FLD857, this.FLD855)));
        }
    }
}

