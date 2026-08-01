// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱˉ.CLS370;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS847 implements CLS8 {
    public final String FLD1329;
    public final CLS794 FLD1330;

    public CLS847(CLS794 ᴵʽ0, String s) {
        this.FLD1330 = ᴵʽ0;
        this.FLD1329 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ArrayList arrayList0 = this.FLD1330.FLD1147.MTH1634(this.FLD1329);
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            arrayList1.add("");
        }
        long v = CLS27.MTH895().MTH938("mass_send_user_priority", false) ? 4101446361109287733L : 0x38EB404A2B3CD335L;
        CLS21.FLD76.MTH818(CLS370.MTH5289(v), new Object[]{TextUtils.join(",", arrayList1), object0});
    }
}

