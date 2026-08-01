// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import java.util.ArrayList;
import java.util.Set;

public final class CLS593 implements CLS12 {
    public final CLS3 FLD440;
    public final CLS587 FLD441;
    public final int FLD442;
    public final String FLD443;
    public final Set FLD444;
    public final String FLD445;
    public final ArrayList FLD446;
    public final int FLD447;

    public CLS593(CLS587 ʽי0, Set set0, String s, String s1, int v, int v1, ArrayList arrayList0, CLS3 ˆٴ0) {
        this.FLD441 = ʽי0;
        this.FLD444 = set0;
        this.FLD443 = s;
        this.FLD445 = s1;
        this.FLD442 = v;
        this.FLD447 = v1;
        this.FLD446 = arrayList0;
        this.FLD440 = ˆٴ0;
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        this.FLD441.getClass();
        this.FLD444.remove(this.FLD443);
        this.FLD441.MTH1788(this.FLD445.substring(0, this.FLD442) + new String(((byte[])object0)) + this.FLD445.substring(this.FLD447 + 2), this.FLD446, this.FLD444, this.FLD440);
    }
}

