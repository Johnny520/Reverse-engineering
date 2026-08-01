// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import java.io.File;

public final class CLS692 implements CLS3 {
    public final int FLD783;
    public final String FLD784;

    public CLS692(int v, String s) {
        this.FLD783 = v;
        this.FLD784 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD784;
        switch(this.FLD783) {
            case 0: {
                try {
                    CLS426.MTH6117(s);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                CLS66.MTH1368(s, !CLS66.MTH1392(s));
                return;
            }
            case 2: {
                CLS371.FLD3470.MTH5370(s);
                CLS79.FLD292.MTH1633();
                return;
            }
            case 3: {
                CLS372.MTH5412(s, !CLS372.MTH5396(s));
                CLS79.FLD292.MTH1633();
                return;
            }
            case 4: {
                CLS66.MTH1513(s);
                return;
            }
            case 5: {
                CLS31.MTH996(s);
                CLS466.MTH6506(new File(s));
                return;
            }
            default: {
                CLS412.MTH6013(CLS27.MTH900(), CLS27.MTH889("file_written_to") + s);
            }
        }
    }
}

