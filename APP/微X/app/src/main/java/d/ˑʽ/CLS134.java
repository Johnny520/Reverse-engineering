// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS190;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS121;
import d.ⁱٴ.CLS122;
import d.ⁱٴ.CLS123;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS134 implements CLS123 {
    public final HashMap FLD101;
    public final Object FLD102;
    public final int FLD103;
    public final Object FLD104;
    public final Object FLD105;
    public final Object FLD106;

    public CLS134(Activity activity0, CLS110 ٴˑ0, ArrayList arrayList0, ArrayList arrayList1, HashMap hashMap0) {
        this.FLD103 = 0;
        super();
        this.FLD105 = activity0;
        this.FLD104 = arrayList0;
        this.FLD102 = arrayList1;
        this.FLD101 = hashMap0;
        this.FLD106 = ٴˑ0;
    }

    public CLS134(CLS190 ᵎᐧ0, CLS190 ᵎᐧ1, CLS182 ˆᐧ0, HashMap hashMap0, HashMap hashMap1) {
        this.FLD103 = 1;
        super();
        this.FLD101 = hashMap0;
        this.FLD105 = hashMap1;
        this.FLD104 = ᵎᐧ0;
        this.FLD102 = ᵎᐧ1;
        this.FLD106 = ˆᐧ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        HashMap hashMap0 = this.FLD101;
        Object object0 = this.FLD106;
        Object object1 = this.FLD102;
        Object object2 = this.FLD104;
        Object object3 = this.FLD105;
        if(this.FLD103 == 0) {
            CLS45.MTH655(((Activity)object3), CLS69.MTH795("keycard"), "", "", 1, ((CLS122)new CLS132(((ArrayList)object2), ((ArrayList)object1), hashMap0, ((CLS110)object0))));
            return;
        }
        String s = (String)hashMap0.get("key");
        String s1 = (String)hashMap0.get("limit");
        if(!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1)) {
            if(((HashMap)object3).containsKey(s + s1)) {
                JSONObject jSONObject0 = (JSONObject)((HashMap)object3).get(s + s1);
                ((CLS190)object2).MTH1179("");
                ((CLS190)object1).MTH1179("");
                if(!jSONObject0.optBoolean("k1_valid", false)) {
                    hashMap0.put("key", "");
                    ((CLS190)object2).MTH1179(CLS69.MTH795("transfer_activation_wrong_key"));
                }
                if(!jSONObject0.optBoolean("k2_valid", false)) {
                    hashMap0.put("limit", "");
                    ((CLS190)object1).MTH1179(CLS69.MTH795("invalid"));
                }
                if(jSONObject0.optBoolean("k2_used", false)) {
                    hashMap0.put("limit", "");
                    ((CLS190)object1).MTH1179(CLS69.MTH795("transfer_activation_limit_used"));
                }
                if(jSONObject0.optBoolean("k1_nofeature", false)) {
                    hashMap0.put("key", "");
                    ((CLS190)object2).MTH1179(CLS69.MTH795("transfer_activation_no_features"));
                }
                if(jSONObject0.optBoolean("k1_sameid", false)) {
                    hashMap0.put("key", "");
                    ((CLS190)object2).MTH1179(CLS69.MTH795("transfer_activation_same_id"));
                }
                if(jSONObject0.has("transient_time")) {
                    ((CLS182)object0).MTH1177(0);
                }
                if(jSONObject0.optBoolean("k1_donation_notsupported", false)) {
                    ((CLS190)object2).MTH1179(CLS69.MTH795("transfer_activation_no_donation"));
                }
            }
            else {
                CLS38 ـʿ0 = CLS38.FLD200;
                CLS153 ˑʾ0 = new CLS153(((CLS190)object2), ((CLS190)object1), ((CLS182)object0), ((HashMap)object3), hashMap0);
                ـʿ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    String s2 = CLS1.MTH369();
                    if(!TextUtils.isEmpty(s2)) {
                        JSONObject jSONObject1 = new JSONObject();
                        try {
                            if(CLS13.MTH430()) {
                                jSONObject1.put("xv", true);
                            }
                            jSONObject1.put("k", s);
                            jSONObject1.put("k2", s1);
                            jSONObject1.put("reguser", CLS69.MTH801().MTH740("_reguser", ""));
                            jSONObject1.put("special_fp", CLS69.MTH801().MTH740("_specialfp", ""));
                            jSONObject1.put("at", ـʿ0.FLD195.MTH597());
                            jSONObject1.put("wxid", s2);
                            Object[] arr_object = {CLS69.MTH810()};
                            jSONObject1.put("deviceId", CLS62.FLD317.MTH756("getDeviceId", arr_object));
                            jSONObject1.put("time", Long.toHexString(System.currentTimeMillis()));
                        }
                        catch(Throwable throwable0) {
                            CLS69.MTH797(throwable0);
                        }
                        CLS21 ʾﹶ0 = new CLS21(CLS38.MTH611());
                        ʾﹶ0.FLD73 = "POST";
                        ʾﹶ0.MTH463("cmd", "v2");
                        ʾﹶ0.MTH463("args", CLS38.MTH604(jSONObject1).toString());
                        ʾﹶ0.MTH462(((CLS17)new CLS131(ـʿ0, ((CLS121)ˑʾ0), 0)));
                    }
                }
            }
        }
    }
}

