// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS295;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;

public final class CLS251 implements CLS141 {
    public final ArrayList FLD344;
    public final CLS216 FLD345;

    public CLS251(CLS216 ˎﾞ0, ArrayList arrayList0) {
        this.FLD345 = ˎﾞ0;
        this.FLD344 = arrayList0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        CLS216 ˎﾞ0 = this.FLD345;
        CLS102 יﹳ0 = ˎﾞ0.FLD236;
        if(יﹳ0 != null) {
            יﹳ0.FLD767.clear();
            for(Object object0: this.FLD344) {
                ˎﾞ0.FLD236.FLD767.add(((CLS295)object0));
            }
            CLS102 יﹳ1 = ˎﾞ0.FLD236;
            יﹳ1.getClass();
            try {
                JSONObject jSONObject0 = יﹳ1.FLD772.has("FloatingActionButton") ? יﹳ1.FLD772.getJSONObject("FloatingActionButton") : new JSONObject();
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: יﹳ1.FLD767) {
                    CLS295 ﾞˎ0 = (CLS295)object1;
                    File file0 = ﾞˎ0.FLD826;
                    if(CLS125.MTH2023(file0)) {
                        CLS132.MTH2092(file0, file0.getName(), new String[]{יﹳ1.FLD773, "icons"});
                        ﾞˎ0.FLD826 = null;
                        ﾞˎ0.FLD829 = file0.getName();
                    }
                    jSONArray0.put(ﾞˎ0.MTH1885());
                }
                jSONObject0.put("items", jSONArray0);
                יﹳ1.FLD772.put("FloatingActionButton", jSONObject0);
                יﹳ1.MTH1813();
                יﹳ1.MTH1827();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }
}

