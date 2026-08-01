// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS121;
import org.json.JSONObject;

public final class CLS131 implements CLS17 {
    public final CLS38 FLD83;
    public final int FLD84;
    public final CLS121 FLD85;

    public CLS131(CLS38 ـʿ0, CLS121 יʻ0, int v) {
        this.FLD84 = v;
        this.FLD83 = ـʿ0;
        this.FLD85 = יʻ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS21$CLS17
    public final void MTH446(CLS20 ʾﹶ$ⁱٴ0) {
        CLS121 יʻ0 = this.FLD85;
        CLS38 ـʿ0 = this.FLD83;
        switch(this.FLD84) {
            case 0: {
                ـʿ0.getClass();
                JSONObject jSONObject1 = CLS38.MTH609(new String(ʾﹶ$ⁱٴ0.FLD71));
                if(jSONObject1 != null && יʻ0 != null) {
                    יʻ0.MTH1171(jSONObject1);
                }
                return;
            }
            case 1: {
                ـʿ0.getClass();
                try {
                    if(!ʾﹶ$ⁱٴ0.MTH454()) {
                        String s = new String(ʾﹶ$ⁱٴ0.FLD71);
                        if(!TextUtils.isEmpty(s)) {
                            JSONObject jSONObject2 = CLS38.MTH609(s);
                            if(jSONObject2 != null) {
                                יʻ0.MTH1171(jSONObject2.optJSONArray("info"));
                                return;
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                יʻ0.MTH1171(null);
                return;
            }
            default: {
                ـʿ0.getClass();
                JSONObject jSONObject0 = CLS38.MTH609(new String(ʾﹶ$ⁱٴ0.FLD71));
                if(jSONObject0 != null && יʻ0 != null) {
                    יʻ0.MTH1171(jSONObject0);
                }
            }
        }
    }
}

