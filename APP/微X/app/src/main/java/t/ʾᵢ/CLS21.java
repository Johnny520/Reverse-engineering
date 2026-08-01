// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.function.Function;
import org.json.JSONObject;

public final class CLS21 implements Function {
    public final int FLD303;

    public CLS21(int v) {
        this.FLD303 = v;
        super();
    }

    // 去混淆评级： 中等(70)
    // 此方法包含解密的字符串
    @Override
    public final Object apply(Object object0) {
        return this.FLD303 == 0 ? ((JSONObject)object0).optString("t") : "";
    }
}

