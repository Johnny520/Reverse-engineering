// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ⁱʾ.CLS326.CLS324;
import b.ⁱʾ.CLS326;
import b.ﾞˎ.CLS1624.CLS540;

public final class CLS1485 implements CLS540 {
    public final int FLD4448;
    public final CLS326 FLD4449;

    public CLS1485(CLS326 ˉᐧ0, int v) {
        this.FLD4448 = v;
        this.FLD4449 = ˉᐧ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        CLS326 ˉᐧ0 = this.FLD4449;
        if(this.FLD4448 == 0) {
            ˉᐧ0.getClass();
            new CLS324(ˉᐧ0).filter(s);
            return;
        }
        ˉᐧ0.getClass();
        new CLS324(ˉᐧ0).filter(s);
    }
}

