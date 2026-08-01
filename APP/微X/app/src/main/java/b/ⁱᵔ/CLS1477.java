// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS363;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS1477 implements CLS3 {
    public final int FLD4414;
    public final CLS363 FLD4415;

    public CLS1477(CLS363 ﾞٴ0, int v) {
        this.FLD4414 = v;
        this.FLD4415 = ﾞٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS363 ﾞٴ0 = this.FLD4415;
        switch(this.FLD4414) {
            case 0: {
                ﾞٴ0.MTH5264(CLS372.MTH5414(ﾞٴ0.FLD3447));
                return;
            }
            case 1: {
                ArrayList arrayList1 = new ArrayList(ﾞٴ0.FLD3447);
                CLS372.MTH5405(arrayList1);
                ﾞٴ0.MTH5264(arrayList1);
                return;
            }
            case 2: {
                ArrayList arrayList2 = new ArrayList(ﾞٴ0.MTH5261());
                for(Object object0: ﾞٴ0.FLD3447) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!arrayList2.contains(ˊﾞ0)) {
                        arrayList2.add(ˊﾞ0);
                    }
                }
                ﾞٴ0.MTH5264(arrayList2);
                return;
            }
            default: {
                ArrayList arrayList0 = new ArrayList(ﾞٴ0.FLD3447);
                Collections.reverse(arrayList0);
                ﾞٴ0.MTH5264(arrayList0);
            }
        }
    }
}

