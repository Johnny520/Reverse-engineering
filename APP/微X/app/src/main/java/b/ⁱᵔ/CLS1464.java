// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS82;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1464 implements CLS11 {
    public final ArrayList FLD4347;
    public final CLS369 FLD4348;
    public final int FLD4349;
    public final CLS82 FLD4350;

    public CLS1464(ArrayList arrayList0, int v, CLS369 ﾞᵎ0, CLS82 יﹳ0) {
        this.FLD4347 = arrayList0;
        this.FLD4349 = v;
        this.FLD4348 = ﾞᵎ0;
        this.FLD4350 = יﹳ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD4347.remove(this.FLD4349);
        this.FLD4348.notifyDataSetChanged();
        CLS54.FLD172.MTH1242(this.FLD4350, this.FLD4349);
    }
}

