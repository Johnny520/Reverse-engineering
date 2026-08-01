// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS1610 implements CLS3 {
    public final int FLD5108;
    public final CLS1626 FLD5109;
    public final CLS363 FLD5110;

    public CLS1610(CLS363 ﾞٴ0, CLS1626 ـﹳ0, int v) {
        this.FLD5108 = v;
        this.FLD5110 = ﾞٴ0;
        this.FLD5109 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS1626 ـﹳ0 = this.FLD5109;
        CLS363 ﾞٴ0 = this.FLD5110;
        switch(this.FLD5108) {
            case 0: {
                ﾞٴ0.MTH5263();
                ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                return;
            }
            case 1: {
                ArrayList arrayList2 = ﾞٴ0.MTH5261();
                HashSet hashSet1 = new HashSet();
                Iterator iterator2 = arrayList2.iterator();
                while(iterator2.hasNext()) {
                    iterator2.next();
                    hashSet1.add("");
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object1: ﾞٴ0.FLD3447) {
                    CLS78 ˊﾞ1 = (CLS78)object1;
                    if(!hashSet1.contains("")) {
                        arrayList3.add("");
                    }
                }
                ﾞٴ0.MTH5263();
                ﾞٴ0.MTH5259(arrayList3);
                ﾞٴ0.notifyDataSetChanged();
                ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                return;
            }
            case 2: {
                ﾞٴ0.MTH5263();
                ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                return;
            }
            default: {
                ArrayList arrayList0 = ﾞٴ0.MTH5261();
                HashSet hashSet0 = new HashSet();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    hashSet0.add("");
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: ﾞٴ0.FLD3447) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!hashSet0.contains("")) {
                        arrayList1.add("");
                    }
                }
                ﾞٴ0.MTH5263();
                ﾞٴ0.MTH5259(arrayList1);
                ﾞٴ0.notifyDataSetChanged();
                ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
            }
        }
    }
}

