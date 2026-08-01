// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS12;
import java.util.ArrayList;

public final class CLS1324 implements CLS12 {
    public final int FLD3662;
    public final ArrayList FLD3663;
    public final CLS425 FLD3664;

    public CLS1324(CLS425 ˊﹳ0, ArrayList arrayList0, int v) {
        this.FLD3662 = v;
        this.FLD3664 = ˊﹳ0;
        this.FLD3663 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ArrayList arrayList0 = this.FLD3663;
        CLS425 ˊﹳ0 = this.FLD3664;
        if(this.FLD3662 == 0) {
            String s = ˊﹳ0.FLD4088;
            ˊﹳ0.FLD4091.MTH1646(s, arrayList0);
            for(Object object1: arrayList0) {
                ˊﹳ0.FLD4096.MTH5046(((String)object1));
            }
            ˊﹳ0.FLD4096.notifyDataSetChanged();
            CLS404.MTH5896(s, ˊﹳ0.FLD4096.MTH5051(), null);
            return;
        }
        ˊﹳ0.FLD4100.MTH1156(ˊﹳ0.FLD4106, arrayList0);
        for(Object object2: arrayList0) {
            ˊﹳ0.FLD4096.MTH5046(((String)object2));
        }
        ˊﹳ0.FLD4096.notifyDataSetChanged();
        ˊﹳ0.FLD4091.MTH1653(ˊﹳ0.FLD4088);
    }
}

