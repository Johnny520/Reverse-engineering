// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85.CLS84;
import b.ˈˈ.CLS85;
import b.יᐧ.CLS154.CLS152;
import b.יᐧ.CLS154.CLS153;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import java.util.Iterator;

public final class CLS1252 implements CLS152, CLS153 {
    public final int FLD3149;
    public final CLS85 FLD3150;
    public final CLS288 FLD3151;

    public CLS1252(CLS288 ˈˊ0, CLS85 ـˏ0, int v) {
        this.FLD3149 = v;
        this.FLD3151 = ˈˊ0;
        this.FLD3150 = ـˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS154$CLS152
    public final boolean MTH3139() {
        CLS294 ˑٴ$ˆٴ0;
        String s;
        CLS85 ـˏ0 = this.FLD3150;
        CLS288 ˈˊ0 = this.FLD3151;
        if(this.FLD3149 == 1) {
            if(ˈˊ0.FLD2977) {
                if(!ـˏ0.MTH1690()) {
                    int v = ـˏ0.FLD330.ordinal();
                    if(v == 0) {
                        CLS66.MTH1458(ـˏ0.FLD337, ـˏ0.FLD340);
                        return true;
                    }
                    switch(v) {
                        case 1: {
                            if(TextUtils.isEmpty(ـˏ0.FLD328)) {
                                s = ـˏ0.FLD337;
                                if(ـˏ0.FLD334 || s.startsWith("wxid") || s.endsWith("@stranger")) {
                                    if(s.endsWith("@stranger") || !s.startsWith("wxid") && !ـˏ0.FLD334) {
                                        CLS66.MTH1458(s, null);
                                        return true;
                                    }
                                    Iterator iterator0 = CLS371.FLD3470.MTH5309().iterator();
                                    while(true) {
                                        if(!iterator0.hasNext()) {
                                            CLS66.MTH1458(s, null);
                                            return true;
                                        }
                                        Object object0 = iterator0.next();
                                        String s1 = (String)object0;
                                        if(!CLS371.FLD3470.MTH5337(s1, s)) {
                                            continue;
                                        }
                                        CLS66.MTH1458(s, s1);
                                        return true;
                                    }
                                }
                            }
                            break;
                        }
                        case 2: {
                        label_21:
                            if(!ـˏ0.MTH1690()) {
                                s = ـˏ0.FLD337;
                                CLS66.MTH1458(s, null);
                                return true;
                            }
                            break;
                        }
                        default: {
                            if(v == 3) {
                                goto label_21;
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if(ˈˊ0.FLD2977) {
            if(ـˏ0.FLD330 == CLS83.FLD319 || !ـˏ0.MTH1690() && ـˏ0.FLD330 == CLS83.FLD321) {
                if(TextUtils.isEmpty(ـˏ0.FLD328)) {
                    String s2 = ـˏ0.FLD337;
                    if(!ـˏ0.FLD334 && !s2.startsWith("wxid") && !s2.endsWith("@stranger")) {
                        CLS295 ˑٴ1 = CLS295.FLD3055;
                        if(ˑٴ1.FLD3052.MTH1745(s2)) {
                            ˑٴ$ˆٴ0 = (CLS294)ˑٴ1.FLD3052.MTH1744(s2);
                            if(ˑٴ$ˆٴ0.FLD3048 == 1) {
                            label_45:
                                ـˏ0.FLD337 = ˑٴ$ˆٴ0.FLD3046;
                                ـˏ0.FLD335 = ˑٴ$ˆٴ0.FLD3045;
                                ـˏ0.FLD339 = ˑٴ$ˆٴ0.FLD3043;
                                ـˏ0.FLD334 = true;
                                ـˏ0.FLD329 = true;
                                ـˏ0.FLD330 = CLS83.FLD321;
                                ـˏ0.FLD338 = CLS372.MTH5413(CLS372.MTH5418("request_friendreq_type", CLS370.MTH5289((ˑٴ$ˆٴ0.FLD3047 == 2 ? 4101467449398711093L : 0x38EB56F82B3CD335L))));
                                int v1 = CLS27.MTH895().MTH927(0, "friendreq_permission_type");
                                int v2 = CLS27.MTH895().MTH927(0, "friendreq_history_type");
                                ـˏ0.MTH1692((v1 == 0 ? CLS84.FLD325 : CLS84.FLD327), v2);
                                ˈˊ0.MTH4735(ـˏ0);
                                return false;
                            }
                            ˈˊ0.MTH4745();
                            ˈˊ0.MTH4741(ˈˊ0.MTH4736());
                            return false;
                        }
                        ˈˊ0.MTH4738(s2);
                        return false;
                    }
                }
                else {
                    CLS295 ˑٴ0 = CLS295.FLD3055;
                    if(ˑٴ0.FLD3052.MTH1745(ـˏ0.FLD328)) {
                        ˑٴ$ˆٴ0 = (CLS294)ˑٴ0.FLD3052.MTH1744(ـˏ0.FLD328);
                        if(ˑٴ$ˆٴ0.FLD3048 != 1) {
                            ˈˊ0.MTH4745();
                            ˈˊ0.MTH4741(ˈˊ0.MTH4736());
                            return false;
                        }
                        goto label_45;
                    }
                    ˈˊ0.MTH4738(ـˏ0.FLD328);
                    return false;
                }
            }
            ˈˊ0.MTH4735(ـˏ0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final boolean MTH4895() {
        if(this.FLD3151.FLD2977) {
            CLS85 ـˏ0 = this.FLD3150;
            if(!ـˏ0.MTH1690()) {
                CLS83 ـˏ$ˆٴ0 = ـˏ0.FLD330;
                if(ـˏ$ˆٴ0 == CLS83.FLD321) {
                    return TextUtils.isEmpty(ـˏ0.FLD328) && (ـˏ0.FLD334 || ـˏ0.FLD337.startsWith("wxid") || ـˏ0.FLD337.endsWith("@stranger")) ? true ^ TextUtils.isEmpty(CLS66.MTH1423(ـˏ0.FLD337)) : true;
                }
                if(ـˏ$ˆٴ0 != CLS83.FLD319 && ـˏ$ˆٴ0 != CLS83.FLD324) {
                    return true ^ TextUtils.isEmpty(CLS66.MTH1423(ـˏ0.FLD337));
                }
            }
        }
        return true;
    }
}

