// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import java.util.Set;

public final class CLS728 implements CLS3 {
    public final int FLD891;
    public final String FLD892;
    public final Set FLD893;
    public final CLS3 FLD894;

    public CLS728(Set set0, String s, CLS702 ˊᵔ0, int v) {
        this.FLD891 = v;
        this.FLD893 = set0;
        this.FLD892 = s;
        this.FLD894 = ˊᵔ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS3 ˆٴ0 = this.FLD894;
        String s = this.FLD892;
        Set set0 = this.FLD893;
        switch(this.FLD891) {
            case 0: {
                set0.remove(s);
                ˆٴ0.MTH774();
                return;
            }
            case 1: {
                set0.remove(s);
                ˆٴ0.MTH774();
                return;
            }
            default: {
                set0.remove(s);
                ˆٴ0.MTH774();
            }
        }
    }
}

