// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS387;
import java.util.ArrayList;

public final class CLS710 implements CLS8 {
    public final CLS629 FLD839;

    public CLS710(CLS629 ʻˋ0) {
        this.FLD839 = ʻˋ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        public final class CLS709 implements CLS2 {
            public final Object FLD838;

            public CLS709(Object object0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                long v = CLS27.MTH895().MTH938("mass_send_user_priority", false) ? 0x38EB494B2B3CD335L : 4101452532977292085L;
                CLS21.FLD76.MTH818(CLS370.MTH5289(v), new Object[]{s, this.FLD838});
            }
        }

        CLS387.MTH5601(false, ((CLS140)this.FLD839).MTH3042(), ((CLS2)new CLS709(object0)), -1);
    }
}

