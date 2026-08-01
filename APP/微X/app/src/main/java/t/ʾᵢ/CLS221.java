// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import java.util.ArrayList;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS132;
import t.ⁱʾ.CLS141;
import t.ﾞᐧ.CLS177;

public final class CLS221 implements CLS141 {
    public final ArrayList FLD250;
    public final CLS216 FLD251;

    public CLS221(CLS216 ˎﾞ0, ArrayList arrayList0) {
        this.FLD251 = ˎﾞ0;
        this.FLD250 = arrayList0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        CLS117 ˆٴ0 = CLS117.FLD842;
        CLS216 ˎﾞ0 = this.FLD251;
        String s = ˎﾞ0.FLD236.FLD773;
        ˆٴ0.getClass();
        if(!TextUtils.isEmpty(s)) {
            CLS132.MTH2097(s);
            ˆٴ0.FLD841.remove(s);
        }
        this.FLD250.remove(ˎﾞ0.FLD236.FLD773);
        CLS177 ᐧˉ0 = ˎﾞ0.FLD235.FLD1139;
        String s1 = ˎﾞ0.FLD236.FLD773;
        ArrayList arrayList0 = ᐧˉ0.FLD1259;
        if(arrayList0.contains(s1)) {
            arrayList0.remove(s1);
            ᐧˉ0.FLD1260.notifyDataSetChanged();
        }
        ˎﾞ0.FLD236 = null;
        ˎﾞ0.FLD235.FLD1139.MTH2444(0);
    }
}

