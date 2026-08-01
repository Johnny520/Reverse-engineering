// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.יʻ.CLS69;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS190;
import d.ⁱٴ.CLS121;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS153 implements CLS121 {
    public final CLS190 FLD175;
    public final CLS182 FLD176;
    public final HashMap FLD177;
    public final HashMap FLD178;
    public final CLS190 FLD179;

    public CLS153(CLS190 ᵎᐧ0, CLS190 ᵎᐧ1, CLS182 ˆᐧ0, HashMap hashMap0, HashMap hashMap1) {
        this.FLD177 = hashMap0;
        this.FLD175 = ᵎᐧ0;
        this.FLD179 = ᵎᐧ1;
        this.FLD178 = hashMap1;
        this.FLD176 = ˆᐧ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS121
    public final void MTH1171(Object object0) {
        CLS190 ᵎᐧ0 = this.FLD175;
        CLS190 ᵎᐧ1 = this.FLD179;
        CLS182 ˆᐧ0 = this.FLD176;
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            String s = jSONObject0.getString("k1");
            String s1 = jSONObject0.getString("k2");
            this.FLD177.put(s + s1, jSONObject0);
            ᵎᐧ0.MTH1179("");
            ᵎᐧ1.MTH1179("");
            boolean z = jSONObject0.optBoolean("k1_valid", false);
            HashMap hashMap0 = this.FLD178;
            if(!z) {
                hashMap0.put("key", "");
                ᵎᐧ0.MTH1179(CLS69.MTH795("transfer_activation_wrong_key"));
            }
            if(!jSONObject0.optBoolean("k2_valid", false)) {
                hashMap0.put("limit", "");
                ᵎᐧ1.MTH1179(CLS69.MTH795("invalid"));
            }
            if(jSONObject0.optBoolean("k2_used", false)) {
                hashMap0.put("limit", "");
                ᵎᐧ1.MTH1179(CLS69.MTH795("transfer_activation_limit_used"));
            }
            if(jSONObject0.optBoolean("k1_nofeature", false)) {
                hashMap0.put("key", "");
                ᵎᐧ0.MTH1179(CLS69.MTH795("transfer_activation_no_features"));
            }
            if(jSONObject0.optBoolean("k1_sameid", false)) {
                hashMap0.put("key", "");
                ᵎᐧ0.MTH1179(CLS69.MTH795("transfer_activation_same_id"));
            }
            if(jSONObject0.has("transient_time")) {
                ᵎᐧ0.MTH1179(CLS34.MTH573(Long.parseLong(jSONObject0.getString("transient_time"), 16)));
                ˆᐧ0.MTH1177(0);
            }
            if(jSONObject0.optBoolean("k1_donation_notsupported", false)) {
                ᵎᐧ0.MTH1179(CLS69.MTH795("transfer_activation_no_donation"));
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }
}

