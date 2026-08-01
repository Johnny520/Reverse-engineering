// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1323 implements CLS2 {
    public final ArrayList FLD3653;
    public final CLS425 FLD3654;

    public CLS1323(CLS425 ˊﹳ0, ArrayList arrayList0) {
        this.FLD3654 = ˊﹳ0;
        this.FLD3653 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS425 ˊﹳ0;
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            ˊﹳ0 = this.FLD3654;
            if(!z) {
                break;
            }
            iterator0.next();
            arrayList1.add("");
            ˊﹳ0.FLD4096.MTH5046("");
        }
        ˊﹳ0.FLD4096.notifyDataSetChanged();
        ˊﹳ0.FLD4091.MTH1646(ˊﹳ0.FLD4088, arrayList1);
        CLS404.MTH5896(ˊﹳ0.FLD4088, this.FLD3653, arrayList0);
    }
}

