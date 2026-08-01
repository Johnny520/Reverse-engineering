// Decompiled by JEB v5.42.0.202606242140

package c.ᐧˎ;

import c.ﾞʾ.CLS365;
import java.util.List;

public final class CLS263 {
    public static CLS365 MTH3435(List list0) {
        int v = (list0.size() << 1) - 1;
        if(((CLS264)list0.get(list0.size() - 1)).MTH3442() == null) {
            --v;
        }
        CLS365 ⁱˋ0 = new CLS365(v * 12);
        int v1 = 0;
        int v2 = ((CLS264)list0.get(0)).MTH3442().MTH4821();
        for(int v3 = 11; v3 >= 0; --v3) {
            if((1 << v3 & v2) != 0) {
                ⁱˋ0.MTH5017(v1);
            }
            ++v1;
        }
        for(int v4 = 1; v4 < list0.size(); ++v4) {
            CLS264 ﾞⁱ0 = (CLS264)list0.get(v4);
            int v5 = ﾞⁱ0.MTH3440().MTH4821();
            for(int v6 = 11; v6 >= 0; --v6) {
                if((1 << v6 & v5) != 0) {
                    ⁱˋ0.MTH5017(v1);
                }
                ++v1;
            }
            if(ﾞⁱ0.MTH3442() != null) {
                int v7 = ﾞⁱ0.MTH3442().MTH4821();
                for(int v8 = 11; v8 >= 0; --v8) {
                    if((1 << v8 & v7) != 0) {
                        ⁱˋ0.MTH5017(v1);
                    }
                    ++v1;
                }
            }
        }
        return ⁱˋ0;
    }
}

