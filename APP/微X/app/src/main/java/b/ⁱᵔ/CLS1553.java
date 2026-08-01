// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1553 implements CLS3 {
    public final int FLD4830;
    public final CLS363 FLD4831;
    public final ArrayList FLD4832;
    public final CLS1626 FLD4833;

    public CLS1553(ArrayList arrayList0, CLS363 ﾞٴ0, CLS1626 ـﹳ0, int v) {
        this.FLD4830 = v;
        this.FLD4832 = arrayList0;
        this.FLD4831 = ﾞٴ0;
        this.FLD4833 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS1626 ـﹳ0 = this.FLD4833;
        CLS363 ﾞٴ0 = this.FLD4831;
        ArrayList arrayList0 = this.FLD4832;
        if(this.FLD4830 == 0) {
            ArrayList arrayList1 = CLS372.MTH5415(2, arrayList0);
            ArrayList arrayList2 = new ArrayList();
            Iterator iterator0 = arrayList1.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                arrayList2.add("");
            }
            ﾞٴ0.MTH5259(arrayList2);
            ﾞٴ0.notifyDataSetChanged();
            ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
            return;
        }
        ArrayList arrayList3 = CLS372.MTH5415(1, arrayList0);
        ArrayList arrayList4 = new ArrayList();
        Iterator iterator1 = arrayList3.iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
            arrayList4.add("");
        }
        ﾞٴ0.MTH5259(arrayList4);
        ﾞٴ0.notifyDataSetChanged();
        ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
    }
}

