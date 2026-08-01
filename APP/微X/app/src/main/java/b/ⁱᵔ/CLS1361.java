// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1361 implements CLS2 {
    public final JSONObject FLD3796;

    public CLS1361(JSONObject jSONObject0) {
        this.FLD3796 = jSONObject0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        try {
            this.FLD3796.put("userlist", s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

