// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import org.json.JSONObject;
import t.ˊﾞ.CLS290;
import t.ˊﾞ.CLS295;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS146;

public final class CLS234 implements CLS146 {
    public final int FLD283;
    public final CLS143 FLD284;
    public final ArrayList FLD285;

    public CLS234(ArrayList arrayList0, CLS143 ˆٴ0, int v) {
        this.FLD283 = v;
        this.FLD285 = arrayList0;
        this.FLD284 = ˆٴ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS146
    public final void MTH2177(Object object0) {
        CLS143 ˆٴ0 = this.FLD284;
        ArrayList arrayList0 = this.FLD285;
        switch(this.FLD283) {
            case 0: {
                arrayList0.add(((JSONObject)object0));
                ˆٴ0.MTH2169();
                return;
            }
            case 1: {
                arrayList0.add(((JSONObject)object0));
                ˆٴ0.MTH2169();
                return;
            }
            case 2: {
                arrayList0.add(((CLS290)object0));
                ˆٴ0.MTH2169();
                return;
            }
            default: {
                arrayList0.add(((CLS295)object0));
                ˆٴ0.MTH2169();
            }
        }
    }
}

