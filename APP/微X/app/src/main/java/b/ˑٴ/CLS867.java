// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ـˏ.CLS169;
import b.ـˏ.CLS894;
import b.ٴـ.CLS896.CLS170;
import java.util.ArrayList;

public final class CLS867 implements CLS2 {
    public final ArrayList FLD1440;
    public final CLS629 FLD1441;

    public CLS867(CLS629 ʻˋ0, ArrayList arrayList0) {
        this.FLD1441 = ʻˋ0;
        this.FLD1440 = arrayList0;
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
        ArrayList arrayList1 = this.FLD1440;
        CLS629 ʻˋ0 = this.FLD1441;
        if(arrayList1.size() > 1 && CLS27.MTH895().MTH938("mass_send_user_priority", false)) {
            for(Object object0: arrayList0) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                for(Object object1: arrayList1) {
                    CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)(((CLS894)object1))), "", 0);
                    ʻˋ0.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                }
            }
            return;
        }
        for(Object object2: arrayList1) {
            CLS170 ˆٴ$ˆٴ1 = new CLS170(((CLS169)(((CLS894)object2))), 3, arrayList0);
            ʻˋ0.FLD1447.MTH3029(ˆٴ$ˆٴ1);
        }
    }
}

