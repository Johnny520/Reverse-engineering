// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ⁱʾ.CLS350.CLS348;
import b.ⁱʾ.CLS350;
import b.ﾞˎ.CLS1624.CLS540;

public final class CLS1134 implements CLS540 {
    public final int FLD2565;
    public final CLS350 FLD2566;

    public CLS1134(CLS350 ᐧⁱ0, int v) {
        this.FLD2565 = v;
        this.FLD2566 = ᐧⁱ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        CLS350 ᐧⁱ0 = this.FLD2566;
        if(this.FLD2565 == 0) {
            ᐧⁱ0.getClass();
            new CLS348(ᐧⁱ0).filter(s);
            return;
        }
        ᐧⁱ0.getClass();
        new CLS348(ᐧⁱ0).filter(s);
    }
}

