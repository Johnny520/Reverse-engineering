// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import d.ˎˏ.CLS1;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS45;
import d.יʻ.CLS62;
import d.יʻ.CLS66;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS120;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class CLS106 implements View.OnClickListener {
    public final CLS194 FLD610;
    public final int FLD611;
    public final Activity FLD612;

    public CLS106(CLS194 ʼˎ0, Activity activity0, int v) {
        this.FLD611 = v;
        this.FLD610 = ʼˎ0;
        this.FLD612 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS194 ʼˎ0 = this.FLD610;
        if(this.FLD611 == 0) {
            Activity activity0 = this.FLD612;
            ʼˎ0.getClass();
            try {
                JSONObject jSONObject0 = new JSONObject();
                String s = CLS62.FLD317.MTH756("getXpFrameWork", new Object[0]);
                if(!TextUtils.isEmpty(s)) {
                    jSONObject0.put("xp", s);
                }
                jSONObject0.put("wxid", CLS1.MTH369());
                jSONObject0.put("time", System.currentTimeMillis());
                String s1 = CLS66.MTH782(CLS69.MTH806("tg_pass"), jSONObject0.toString());
                CLS13.MTH428(((CLS101)ʼˎ0).MTH1053(), s1);
                CLS13.MTH426(activity0, String.format(CLS69.MTH795("copy_tgpass"), s1));
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            return;
        }
        Activity activity1 = this.FLD612;
        ʼˎ0.getClass();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        if(ʼˎ0.FLD587.MTH710()) {
            linkedHashMap0.put(CLS69.MTH795("generate_transfer_key"), "generate");
        }
        if(!CLS71.MTH831(0xFFFF2BD42DFB3E45L)) {
            linkedHashMap0.put(CLS69.MTH795("transfer_here"), "input");
        }
        CLS110 ٴˑ0 = new CLS110(activity1, linkedHashMap0.keySet());
        CLS45.MTH656(false, activity1, CLS69.MTH795("transfer_advanced"), linkedHashMap0, false, ((CLS120)new CLS195(activity1, 2)), ٴˑ0);
    }
}

