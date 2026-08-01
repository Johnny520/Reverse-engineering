// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS335;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1559 implements CLS11 {
    public final JSONObject FLD4851;
    public final CLS335 FLD4852;
    public final int FLD4853;
    public final ArrayList FLD4854;
    public final ArrayList FLD4855;

    public CLS1559(JSONObject jSONObject0, ArrayList arrayList0, int v, ArrayList arrayList1, CLS335 ˑٴ0) {
        this.FLD4851 = jSONObject0;
        this.FLD4854 = arrayList0;
        this.FLD4853 = v;
        this.FLD4855 = arrayList1;
        this.FLD4852 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            int v = this.FLD4851.getInt("type");
            int v1 = this.FLD4853;
            if(v == 1) {
                this.FLD4854.remove(v1);
            }
            else if(v == 15) {
                this.FLD4855.remove(v1);
            }
            this.FLD4852.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

