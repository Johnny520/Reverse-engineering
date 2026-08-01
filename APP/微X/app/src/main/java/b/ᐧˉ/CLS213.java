// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1635;
import org.json.JSONObject;

public final class CLS213 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2047;
    public final CLS1635 FLD2048;
    public final JSONObject FLD2049;

    public CLS213(JSONObject jSONObject0, CLS1635 ﾞᵎ0, int v) {
        this.FLD2047 = v;
        this.FLD2049 = jSONObject0;
        this.FLD2048 = ﾞᵎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1635 ﾞᵎ0 = this.FLD2048;
        JSONObject jSONObject0 = this.FLD2049;
        if(this.FLD2047 == 0) {
            try {
                jSONObject0.put("grab_red_packet_filter_onlyopen_enable", z);
                if(z) {
                    ﾞᵎ0.MTH7437(false);
                    ﾞᵎ0.MTH801(8);
                    jSONObject0.put("grab_red_packet_filter_notopen_enable", false);
                    return;
                }
                ﾞᵎ0.MTH801(0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            jSONObject0.put("grab_red_packet_filter_notopen_enable", z);
            if(z) {
                ﾞᵎ0.MTH801(8);
                ﾞᵎ0.MTH7437(false);
                jSONObject0.put("grab_red_packet_filter_onlyopen_enable", false);
                return;
            }
            ﾞᵎ0.MTH801(0);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

