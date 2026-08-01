// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import org.json.JSONArray;
import t.ˊﾞ.CLS102;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;

public final class CLS252 implements CLS141 {
    public final ArrayList FLD346;
    public final CLS216 FLD347;

    public CLS252(CLS216 ˎﾞ0, ArrayList arrayList0) {
        this.FLD347 = ˎﾞ0;
        this.FLD346 = arrayList0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        try {
            ArrayList arrayList0 = this.FLD346;
            JSONArray jSONArray0 = new JSONArray();
            for(int v = 0; v < arrayList0.size(); ++v) {
                jSONArray0.put(arrayList0.get(v));
            }
            CLS102 יﹳ0 = this.FLD347.FLD236;
            יﹳ0.getClass();
            try {
                יﹳ0.FLD772.put("ChatFooterHintArray", jSONArray0);
            }
            catch(Throwable throwable1) {
                CLS133.MTH2113(throwable1);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

