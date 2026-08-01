// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ˆٴ.CLS66;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ٴـ.CLS896.CLS170;
import b.ⁱᵔ.CLS466;
import java.io.File;
import java.util.ArrayList;

public final class CLS670 implements CLS2 {
    public final String FLD701;
    public final CLS629 FLD702;

    public CLS670(CLS629 ʻˋ0, String s) {
        this.FLD702 = ʻˋ0;
        this.FLD701 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.FLD702.FLD552 = 0;
            CLS466.MTH6509();
            String s2 = CLS66.MTH1410(this.FLD701);
            boolean z = this.FLD702.FLD1445.MTH938("add_img_watermark", false);
            CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS886(new File(this.FLD702.MTH2037(s2, z)))), 2, arrayList0);
            this.FLD702.FLD1447.MTH3029(ˆٴ$ˆٴ0);
        }
    }
}

