// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1592 implements CLS3 {
    public final int FLD5014;
    public final CLS369 FLD5015;
    public final ArrayList FLD5016;

    public CLS1592(int v, CLS369 ﾞᵎ0, ArrayList arrayList0) {
        this.FLD5014 = v;
        this.FLD5016 = arrayList0;
        this.FLD5015 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS369 ﾞᵎ0 = this.FLD5015;
        ArrayList arrayList0 = this.FLD5016;
        if(this.FLD5014 == 0) {
            arrayList0.clear();
            arrayList0.addAll(CLS371.FLD3470.MTH5373());
            ﾞᵎ0.notifyDataSetChanged();
            return;
        }
        arrayList0.clear();
        ﾞᵎ0.notifyDataSetChanged();
        CLS27.MTH895().MTH932("invite_key_tags");
    }
}

