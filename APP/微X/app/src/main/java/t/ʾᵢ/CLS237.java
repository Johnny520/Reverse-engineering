// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import java.io.File;
import t.ᵔʾ.CLS125;
import t.ⁱʾ.CLS142;

public final class CLS237 implements CLS142 {
    public final CLS216 FLD295;

    public CLS237(CLS216 ˎﾞ0) {
        this.FLD295 = ˎﾞ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS142
    public final void MTH2167() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS142
    public final void MTH2168(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        File file0 = new File(s);
        if(!CLS125.MTH2023(file0)) {
            return;
        }
        this.FLD295.FLD236.MTH1823("FloatingActionMenuIcon", file0.getName());
        this.FLD295.FLD236.MTH1797(file0.getName(), s);
    }
}

