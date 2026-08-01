// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import java.util.ArrayList;
import org.json.JSONObject;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS54;
import t.ˊﾞ.CLS290;
import t.ˊﾞ.CLS295;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS146;
import t.ⁱʾ.CLS147;

public final class CLS238 implements CLS143 {
    public final int FLD296;
    public final ArrayList FLD297;
    public final CLS216 FLD298;
    public final CLS143 FLD299;

    public CLS238(CLS216 ˎﾞ0, ArrayList arrayList0, CLS143 ˆٴ0, int v) {
        this.FLD296 = v;
        this.FLD298 = ˎﾞ0;
        this.FLD297 = arrayList0;
        this.FLD299 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        CLS143 ˆٴ0 = this.FLD299;
        ArrayList arrayList0 = this.FLD297;
        CLS216 ˎﾞ0 = this.FLD298;
        switch(this.FLD296) {
            case 0: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1140(new JSONObject(), ((CLS146)new CLS234(arrayList0, ˆٴ0, 0)));
                return;
            }
            case 1: {
                ˎﾞ0.getClass();
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("t", "00:00");
                    CLS117.FLD842.getClass();
                    jSONObject0.put("n", new ArrayList(CLS117.FLD842.FLD841.keySet()).get(0));
                    CLS250 ᵔﹳ0 = new CLS250(arrayList0, jSONObject0, ˆٴ0);
                    Activity activity0 = ((CLS10)ˎﾞ0).MTH1048();
                    CLS43.MTH1426(activity0, CLS133.MTH2099("select_time"), ((CLS54)new CLS256(ˎﾞ0, activity0, jSONObject0, 0)), null, ((CLS141)ᵔﹳ0));
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 2: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1140(new JSONObject(), ((CLS146)new CLS234(arrayList0, ˆٴ0, 1)));
                return;
            }
            case 3: {
                ˎﾞ0.getClass();
                CLS295 ﾞˎ0 = new CLS295();
                ﾞˎ0.FLD830 = arrayList0.size();
                ˎﾞ0.MTH1141(((CLS147)ﾞˎ0), ((CLS146)new CLS234(arrayList0, ˆٴ0, 3)));
                return;
            }
            default: {
                ˎﾞ0.getClass();
                CLS290 ˊﾞ0 = new CLS290();
                ˊﾞ0.FLD755 = arrayList0.size();
                ˎﾞ0.MTH1141(((CLS147)ˊﾞ0), ((CLS146)new CLS234(arrayList0, ˆٴ0, 2)));
            }
        }
    }
}

