// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;
import org.json.JSONArray;

public final class CLS1590 implements CLS8 {
    public final ArrayList FLD5007;
    public final CLS359 FLD5008;

    public CLS1590(CLS359 ⁱˉ0, ArrayList arrayList0) {
        this.FLD5007 = arrayList0;
        this.FLD5008 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ArrayList arrayList0 = CLS412.MTH6012(CLS27.MTH895().MTH937(CLS182.MTH3489(4101203901615493941L, new StringBuilder(), object0), new JSONArray()));
        this.FLD5007.clear();
        this.FLD5007.addAll(arrayList0);
        this.FLD5008.MTH5235(this.FLD5007);
        this.FLD5008.MTH5229();
    }
}

