// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import d.ˑʽ.CLS10.CLS8;
import d.ˑʽ.CLS10.CLS9;
import d.ˑʽ.CLS148;
import d.ˑʽ.CLS45;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ᐧי.CLS110;
import d.ᵎʻ.CLS210;
import d.ⁱٴ.CLS123;
import java.util.LinkedHashMap;

public final class CLS198 implements CLS123 {
    public final CLS194 FLD595;
    public final int FLD596;

    public CLS198(CLS194 ʼˎ0, int v) {
        this.FLD596 = v;
        this.FLD595 = ʼˎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        CLS194 ʼˎ0 = this.FLD595;
        switch(this.FLD596) {
            case 0: {
                ʼˎ0.getClass();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                if(!CLS71.MTH831(0xFFFF19202DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("donate_keycard_af"), "af");
                }
                if(!CLS71.MTH831(0xFFFF1EF52DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("donate_keycard_mf"), "mf");
                }
                if(!CLS62.FLD317.MTH760("isHiddenEnabled", new Object[0]) && !CLS71.MTH831(0xFFFF1EBE2DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("donate_keycard_sf"), "sf");
                }
                if(!CLS71.MTH831(0xFFFF1E532DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("donate_keycard_x1"), "x1");
                }
                if(!CLS71.MTH831(0xFFFF1E642DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("donate_sub_integrated"), "im");
                }
                if(!CLS71.MTH831(0xFFFF1E312DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("keycard"), "key");
                }
                if(!CLS71.MTH831(0xFFFF1FD02DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("keycard_lookup"), "lookup");
                }
                if(!CLS71.MTH831(0xFFFF1FEF2DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("wechat_pay_input"), "wechat_pay_input");
                }
                if(!TextUtils.isEmpty(CLS69.MTH795("transfer_advanced")) && !CLS71.MTH831(0xFFFF1FAA2DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("transfer_advanced"), "transfer");
                }
                if(!CLS71.MTH831(0xFFFF1F7E2DFB3E45L)) {
                    linkedHashMap0.put(CLS69.MTH795("keycard_feedback"), "feedback");
                }
                if(!linkedHashMap0.isEmpty()) {
                    Activity activity0 = ((CLS101)ʼˎ0).MTH1053();
                    CLS110 ٴˑ0 = new CLS110(activity0, linkedHashMap0.keySet());
                    LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                    String s = CLS69.MTH795("donate_keycard_advanced");
                    String s1 = CLS69.MTH795("donate_keycard_advanced_desc");
                    CLS205 ⁱٴ0 = new CLS205(ʼˎ0, linkedHashMap1, activity0);
                    Dialog[] arr_dialog = {null};
                    arr_dialog[0] = CLS45.MTH661(activity0, s, ((CLS8)new CLS148(activity0, s1, ٴˑ0, arr_dialog, ⁱٴ0, linkedHashMap0)), ((CLS9)new CLS210(null, 4)), null);
                }
                return;
            }
            case 1: {
                ʼˎ0.MTH1042();
                return;
            }
            default: {
                ʼˎ0.MTH1039();
            }
        }
    }
}

