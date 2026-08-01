// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.יʻ.CLS62;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ᵎʻ.CLS210;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS171 implements CLS18 {
    public final CLS38 FLD275;
    public final int FLD276;

    public CLS171(CLS38 ـʿ0, int v) {
        this.FLD276 = v;
        this.FLD275 = ـʿ0;
        super();
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public final void MTH707(ArrayList arrayList0) {
        String s4;
        String s3;
        JSONObject jSONObject2;
        String s1;
        JSONObject jSONObject0 = null;
        CLS38 ـʿ0 = this.FLD275;
        if(this.FLD276 == 0) {
            ـʿ0.getClass();
            if(arrayList0.isEmpty()) {
                CLS13.MTH426(CLS69.MTH810(), CLS69.MTH795("activation_failed"));
                return;
            }
            for(Object object0: arrayList0) {
                CLS20 ʾﹶ$ⁱٴ0 = (CLS20)object0;
                if(!ʾﹶ$ⁱٴ0.MTH454()) {
                    try {
                        String s = ʾﹶ$ⁱٴ0.FLD70;
                        JSONObject jSONObject1 = CLS38.MTH609(new String(ʾﹶ$ⁱٴ0.FLD71));
                        if(jSONObject1 == null) {
                            continue;
                        }
                        CLS13.MTH434(("url: " + s));
                        CLS13.MTH434(jSONObject1.toString());
                        if(!jSONObject1.optBoolean("same_id")) {
                            if(jSONObject1.optBoolean("already_used") || jSONObject1.optBoolean("wrong_key")) {
                                CLS210 ᐧי0 = new CLS210(jSONObject1, 7);
                                CLS68.FLD326.MTH791(((CLS67)ᐧי0));
                                return;
                            }
                            if(jSONObject1.has("already_licensed")) {
                                s1 = "already_licensed";
                            }
                            else if(jSONObject1.has("expired")) {
                                s1 = "expired";
                            }
                            else {
                                if(!jSONObject1.getBoolean("stat")) {
                                    break;
                                }
                                boolean z = false;
                                if(!jSONObject1.has("a2")) {
                                    z = true;
                                    String s2 = CLS69.MTH795("success");
                                    if(jSONObject1.has("amount")) {
                                        s2 = s2 + " (" + jSONObject1.getString("amount") + "元)";
                                    }
                                    CLS13.MTH426(CLS69.MTH810(), s2);
                                }
                                else if(!jSONObject1.has("reset")) {
                                    z = true;
                                }
                                if(z) {
                                    CLS62.FLD317.MTH754("core", "refreshSettings", new Object[0]);
                                    CLS38.MTH612(s, false);
                                    return;
                                }
                                s1 = "reset_success";
                            }
                            CLS13.MTH431(CLS69.MTH795(s1));
                            return;
                        }
                        CLS13.MTH426(CLS69.MTH810(), CLS69.MTH795("donate_key_same_id"));
                        if(jSONObject1.getBoolean("stat")) {
                            break;
                        }
                        CLS62.FLD317.MTH754("core", "refreshSettings", new Object[0]);
                        CLS38.MTH612(null, false);
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS69.MTH797(throwable0);
                    }
                }
            }
            return;
        }
        ـʿ0.getClass();
        CLS69.MTH801().MTH741(Long.toHexString(System.currentTimeMillis()), "transferkey_time");
        if(arrayList0.isEmpty()) {
            CLS13.MTH431(CLS69.MTH795("transfer_activation_failed"));
            return;
        }
        for(Object object1: arrayList0) {
            CLS20 ʾﹶ$ⁱٴ1 = (CLS20)object1;
            try {
                jSONObject2 = CLS38.MTH609(new String(ʾﹶ$ⁱٴ1.FLD71));
                if(jSONObject2 == null) {
                    continue;
                }
                if(jSONObject2.optBoolean("stat")) {
                    CLS13.MTH431(CLS69.MTH795("transfer_activation_success"));
                    CLS38.MTH612(ʾﹶ$ⁱٴ1.FLD70, false);
                    return;
                }
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
                continue;
            }
            jSONObject0 = jSONObject2;
        }
        if(jSONObject0 != null) {
            try {
                if(jSONObject0.has("transient_time")) {
                    s3 = CLS34.MTH573(Long.parseLong(jSONObject0.getString("transient_time"), 16));
                }
                else {
                    if(jSONObject0.optBoolean("expired")) {
                        s4 = "transfer_activation_expired";
                    }
                    else if(jSONObject0.optBoolean("wrong_key")) {
                        s4 = "transfer_activation_wrong_key";
                    }
                    else if(jSONObject0.optBoolean("same_id")) {
                        s4 = "transfer_activation_same_id";
                    }
                    else if(jSONObject0.optBoolean("no_features")) {
                        s4 = "transfer_activation_no_features";
                    }
                    else {
                        s4 = jSONObject0.optBoolean("tfk_used") ? "transfer_activation_limit_used" : "transfer_activation_failed";
                    }
                    s3 = CLS69.MTH795(s4);
                }
                CLS13.MTH431(s3);
            }
            catch(Throwable throwable2) {
                CLS69.MTH797(throwable2);
            }
        }
    }
}

