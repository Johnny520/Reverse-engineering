// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS412;
import java.util.HashSet;

public final class CLS738 implements CLS3 {
    public final int FLD927;
    public final CLS629 FLD928;

    public CLS738(CLS629 ʻˋ0, int v) {
        this.FLD927 = v;
        this.FLD928 = ʻˋ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS629 ʻˋ0 = this.FLD928;
        switch(this.FLD927) {
            case 0: {
                ʻˋ0.getClass();
                CLS395.MTH5736(CLS27.MTH889("send"), ((CLS140)ʻˋ0).MTH3042(), ((CLS8)new CLS710(ʻˋ0)), new HashSet(), false);
                return;
            }
            case 1: {
                ʻˋ0.getClass();
                HashSet hashSet0 = new HashSet();
                hashSet0.add("gif");
                hashSet0.add("mp3");
                hashSet0.add("friendcard");
                if(!ʻˋ0.FLD1447.FLD1438.MTH6895("fav_voice_mass_send")) {
                    hashSet0.add("fav_voice");
                }
                CLS395.MTH5736(CLS27.MTH889("send"), ((CLS140)ʻˋ0).MTH3042(), ((CLS8)new CLS662(ʻˋ0)), hashSet0, true);
                return;
            }
            default: {
                CLS412.MTH6013(((CLS140)ʻˋ0).MTH3042(), CLS27.MTH889("mp3_encode_done"));
            }
        }
    }
}

