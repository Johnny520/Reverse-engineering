// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

public final class CLS601 implements CLS12 {
    public final Set FLD457;
    public final CLS3 FLD458;
    public final ArrayList FLD459;
    public final String FLD460;
    public final int FLD461;

    public CLS601(Set set0, String s, ArrayList arrayList0, int v, CLS607 ⁱˉ0) {
        this.FLD457 = set0;
        this.FLD460 = s;
        this.FLD459 = arrayList0;
        this.FLD461 = v;
        this.FLD458 = ⁱˉ0;
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        this.FLD457.remove(this.FLD460);
        if(((byte[])object0) != null) {
            String s = CLS31.MTH1013(CLS27.MTH900());
            if(CLS31.MTH1033(new File(s), ((byte[])object0))) {
                CLS31.MTH996(s);
                this.FLD459.set(this.FLD461, s);
            }
        }
        this.FLD458.MTH774();
    }
}

