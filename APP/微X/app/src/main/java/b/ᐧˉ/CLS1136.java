// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1616.CLS524;
import org.json.JSONObject;

public final class CLS1136 implements CLS524 {
    public final JSONObject FLD2569;

    public CLS1136(JSONObject jSONObject0) {
        this.FLD2569 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1616$CLS524
    public final void MTH7175(long v, long v1) {
        try {
            this.FLD2569.put("grab_red_packet_rdelay_min", ((int)v));
            this.FLD2569.put("grab_red_packet_rdelay_max", ((int)v1));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

