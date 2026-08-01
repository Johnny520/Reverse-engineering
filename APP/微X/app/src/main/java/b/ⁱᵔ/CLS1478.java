// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1228;
import java.io.File;

public final class CLS1478 implements CLS8 {
    public final CLS8 FLD4416;

    public CLS1478(CLS8 ـˏ0) {
        this.FLD4416 = ـˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(TextUtils.isEmpty(((String)object0))) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(CLS502.MTH6925(((String)object0)));
        String s = CLS182.MTH3475((((String)object0).endsWith("gif") ? 4101249003067069237L : 0x38EA90C22B3CD335L), stringBuilder0);
        File file0 = CLS25.MTH869(s, new String[0]);
        boolean z = CLS31.MTH1001(file0);
        CLS8 ـˏ0 = this.FLD4416;
        if(!z) {
            if(((String)object0).endsWith("gif")) {
                CLS518.MTH7066(((String)object0), new CLS1228(file0, s, ـˏ0, 7));
                return;
            }
            CLS518.MTH7068(((String)object0), ((CLS516)new CLS1049(file0, s, ـˏ0, 16)));
        }
        else if(ـˏ0 != null) {
            try {
                ـˏ0.MTH786(file0.getAbsolutePath());
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

