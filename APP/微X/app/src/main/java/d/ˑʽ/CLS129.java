// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import d.יʻ.CLS69;
import d.ٴˑ.CLS91;
import d.ⁱٴ.CLS123;
import org.json.JSONObject;

public final class CLS129 implements CLS9, CLS17 {
    public final CLS123 FLD63;

    public CLS129(CLS123 ᐧי0) {
        this.FLD63 = ᐧי0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS9
    public final void MTH416(CLS91 ٴˆ0) {
        ٴˆ0.MTH969("refresh", this.FLD63);
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS21$CLS17
    public final void MTH446(CLS20 ʾﹶ$ⁱٴ0) {
        JSONObject jSONObject0;
        CLS123 ᐧי0 = this.FLD63;
        if(!ʾﹶ$ⁱٴ0.MTH454()) {
            try {
                jSONObject0 = null;
                String s = ʾﹶ$ⁱٴ0.MTH455();
                if(!TextUtils.isEmpty(s)) {
                    jSONObject0 = new JSONObject(s);
                }
                goto label_9;
            }
            catch(Throwable throwable0) {
                try {
                    CLS69.MTH797(throwable0);
                label_9:
                    if(jSONObject0 != null) {
                        CLS13.MTH434(("" + jSONObject0));
                        String s1 = jSONObject0.optString("msg");
                        if(!TextUtils.isEmpty(s1)) {
                            CLS13.MTH431(s1);
                        }
                        if(jSONObject0.optInt("code", 0) == 1 && jSONObject0.optInt("status", 0) == 1) {
                            ᐧי0.MTH1174();
                            return;
                        }
                    }
                    return;
                }
                catch(Throwable throwable1) {
                }
            }
            CLS69.MTH797(throwable1);
        }
    }
}

