// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS61;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS655 implements CLS2 {
    public final String FLD654;
    public final CLS794 FLD655;

    public CLS655(CLS794 ᴵʽ0, String s) {
        this.FLD655 = ᴵʽ0;
        this.FLD654 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS61 ﾞٴ0 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
        String s2 = this.FLD655.FLD1444.MTH5335(s);
        Iterator iterator0 = this.FLD655.FLD1147.MTH1634(this.FLD654).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            if(!CLS426.MTH6126("") && !CLS502.MTH6934(s2, new String[]{""})) {
                if(ﾞٴ0.MTH1314("")) {
                    ﾞٴ0.MTH1335(1, "");
                    ﾞٴ0.MTH1335(3, "");
                }
                CLS426.MTH6120(s, "", true, null);
            }
        }
    }
}

