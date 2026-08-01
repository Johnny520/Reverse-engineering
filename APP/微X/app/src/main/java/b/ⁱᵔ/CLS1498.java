// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1498 implements CLS11 {
    public final CLS369 FLD4514;
    public final ArrayList FLD4515;
    public final int FLD4516;

    public CLS1498(int v, CLS369 ﾞᵎ0, ArrayList arrayList0) {
        this.FLD4514 = ﾞᵎ0;
        this.FLD4516 = v;
        this.FLD4515 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = (String)this.FLD4514.getItem(this.FLD4516);
        JSONObject jSONObject0 = CLS27.MTH895().MTH921("invite_key_tags");
        jSONObject0.remove(s);
        CLS27.MTH895().MTH922(jSONObject0, "invite_key_tags");
        this.FLD4515.remove(s);
        this.FLD4514.notifyDataSetChanged();
    }
}

