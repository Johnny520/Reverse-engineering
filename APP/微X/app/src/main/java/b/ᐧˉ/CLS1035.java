// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1035 implements CLS378, CLS379 {
    public final CLS1112 FLD2163;
    public final Activity FLD2164;

    public CLS1035(CLS1112 ᐧˏ0, Activity activity0) {
        this.FLD2163 = ᐧˏ0;
        this.FLD2164 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2163.getClass();
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1274(this.FLD2163, this.FLD2164, 16)));
        ʻˑ0.MTH7187("add", ((CLS3)new CLS967(this.FLD2163, 9)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1112 ᐧˏ0 = this.FLD2163;
        ᐧˏ0.getClass();
        ᐧˏ0.FLD2457 = new ArrayList();
        for(Object object0: ᐧˏ0.FLD2482) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                ᐧˏ0.FLD2457.add(jSONObject0.getString("n"));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        ᐧˏ0.FLD2459 = new CLS369(this.FLD2164, ᐧˏ0.FLD2457);
        CLS1624 יﹳ0 = new CLS1624(this.FLD2164);
        יﹳ0.MTH7311();
        יﹳ0.MTH7303(ᐧˏ0.FLD2459);
        יﹳ0.MTH7301(new CLS247(ᐧˏ0, 1));
        יﹳ0.MTH7305(new CLS220(0, this.FLD2164, ᐧˏ0));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

