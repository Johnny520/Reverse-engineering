// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS61;
import java.util.ArrayList;

public final class CLS1483 implements CLS2 {
    public final CLS425 FLD4444;

    public CLS1483(CLS425 ˊﹳ0) {
        this.FLD4444 = ˊﹳ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS61 ﾞٴ0 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
        String s2 = this.FLD4444.FLD4110.MTH5335(s);
        for(Object object0: this.FLD4444.FLD4096.MTH5051()) {
            String s3 = (String)object0;
            if(!CLS426.MTH6126(s3) && !CLS502.MTH6934(s2, new String[]{s3})) {
                if(ﾞٴ0.MTH1314(s3)) {
                    ﾞٴ0.MTH1335(1, s3);
                    ﾞٴ0.MTH1335(3, s3);
                }
                CLS426.MTH6120(s, s3, true, null);
            }
        }
    }
}

