// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS566;
import b.ʾᵢ.CLS568;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1509 implements CLS2 {
    public final Activity FLD4595;
    public final CLS425 FLD4596;
    public final ArrayList FLD4597;

    public CLS1509(CLS425 ˊﹳ0, Activity activity0, ArrayList arrayList0) {
        this.FLD4596 = ˊﹳ0;
        this.FLD4595 = activity0;
        this.FLD4597 = arrayList0;
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
        CLS425 ˊﹳ0 = this.FLD4596;
        Activity activity0 = this.FLD4595;
        if(ˊﹳ0.FLD4088.startsWith("wx__c_")) {
            CLS566 ˈˊ0 = new CLS566(this, arrayList1, this.FLD4597, arrayList0, 8);
            CLS403.MTH5870(activity0, arrayList1, ˊﹳ0.FLD4088, ((CLS12)ˈˊ0), false);
            return;
        }
        if(!ˊﹳ0.FLD4088.startsWith("wx__c_") && ˊﹳ0.FLD4104.MTH6895("chatroom_container_tags")) {
            CLS403.MTH5872(false, activity0, arrayList1, ((CLS12)new CLS568(this, arrayList1, 21)));
        }
    }
}

