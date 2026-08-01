// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS236 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2329;
    public final JSONObject FLD2330;
    public final CLS1173 FLD2331;

    public CLS236(CLS1173 ᵢᵢ0, JSONObject jSONObject0, int v) {
        this.FLD2329 = v;
        this.FLD2331 = ᵢᵢ0;
        this.FLD2330 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1173 ᵢᵢ0 = this.FLD2331;
        JSONObject jSONObject0 = this.FLD2330;
        if(this.FLD2329 == 0) {
            ᵢᵢ0.getClass();
            try {
                jSONObject0.put("vibrate_enable", z);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            if(CLS1173.MTH4443() && (jSONObject0.optBoolean("ringtone_enable", false) || jSONObject0.optBoolean("vibrate_enable", false))) {
                ᵢᵢ0.FLD2718.MTH801(0);
                return;
            }
            ᵢᵢ0.FLD2718.MTH801(8);
            return;
        }
        ᵢᵢ0.getClass();
        try {
            jSONObject0.put("ringtone_enable", z);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        if(CLS1173.MTH4443() && (jSONObject0.optBoolean("ringtone_enable", false) || jSONObject0.optBoolean("vibrate_enable", false))) {
            ᵢᵢ0.FLD2718.MTH801(0);
            return;
        }
        ᵢᵢ0.FLD2718.MTH801(8);
    }
}

