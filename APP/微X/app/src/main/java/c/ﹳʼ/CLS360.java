// Decompiled by JEB v5.42.0.202606242140

package c.ﹳʼ;

import c.ˎˊ.CLS118;
import java.util.List;

public final class CLS360 {
    public static CLS118 MTH4931(List list0) {
        int v = (list0.size() << 1) - 1;
        if(((CLS359)list0.get(list0.size() - 1)).MTH4930() == null) {
            --v;
        }
        CLS118 ˆٴ0 = new CLS118(v * 12);
        int v1 = 0;
        int v2 = ((CLS359)list0.get(0)).MTH4930().MTH760();
        for(int v3 = 11; v3 >= 0; --v3) {
            if((1 << v3 & v2) != 0) {
                ˆٴ0.MTH2350(v1);
            }
            ++v1;
        }
        for(int v4 = 1; v4 < list0.size(); ++v4) {
            CLS359 ʻᵢ0 = (CLS359)list0.get(v4);
            int v5 = ʻᵢ0.MTH4928().MTH760();
            for(int v6 = 11; v6 >= 0; --v6) {
                if((1 << v6 & v5) != 0) {
                    ˆٴ0.MTH2350(v1);
                }
                ++v1;
            }
            if(ʻᵢ0.MTH4930() != null) {
                int v7 = ʻᵢ0.MTH4930().MTH760();
                for(int v8 = 11; v8 >= 0; --v8) {
                    if((1 << v8 & v7) != 0) {
                        ˆٴ0.MTH2350(v1);
                    }
                    ++v1;
                }
            }
        }
        return ˆٴ0;
    }
}

