// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS290;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;

public final class CLS195 implements CLS141 {
    public final ArrayList FLD151;
    public final CLS216 FLD152;

    public CLS195(CLS216 ˎﾞ0, ArrayList arrayList0) {
        this.FLD152 = ˎﾞ0;
        this.FLD151 = arrayList0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        CLS216 ˎﾞ0 = this.FLD152;
        CLS102 יﹳ0 = ˎﾞ0.FLD236;
        if(יﹳ0 != null) {
            יﹳ0.FLD770.clear();
            for(Object object0: this.FLD151) {
                ˎﾞ0.FLD236.FLD770.add(((CLS290)object0));
            }
            CLS102 יﹳ1 = ˎﾞ0.FLD236;
            יﹳ1.getClass();
            try {
                JSONObject jSONObject0 = יﹳ1.FLD772.has("DrawerList") ? יﹳ1.FLD772.getJSONObject("DrawerList") : new JSONObject();
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: יﹳ1.FLD770) {
                    CLS290 ˊﾞ0 = (CLS290)object1;
                    File file0 = ˊﾞ0.FLD750;
                    if(CLS125.MTH2023(file0)) {
                        CLS132.MTH2092(file0, file0.getName(), new String[]{יﹳ1.FLD773, "icons"});
                        ˊﾞ0.FLD750 = null;
                        ˊﾞ0.FLD757 = file0.getName();
                    }
                    jSONArray0.put(ˊﾞ0.MTH1782());
                }
                jSONObject0.put("items", jSONArray0);
                יﹳ1.FLD772.put("DrawerList", jSONObject0);
                יﹳ1.MTH1813();
                יﹳ1.MTH1798();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }
}

