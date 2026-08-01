// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS347;
import b.ﾞˎ.CLS528;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1570 implements CLS8 {
    public final ArrayList FLD4904;
    public final CLS347 FLD4905;

    public CLS1570(CLS347 ᐧי0, ArrayList arrayList0) {
        this.FLD4904 = arrayList0;
        this.FLD4905 = ᐧי0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        try {
            String s = ((JSONObject)object0).getString("name");
            String s1 = ((JSONObject)object0).optString("label");
            String s2 = ((JSONObject)object0).optString("cls");
            CLS528 ʽי0 = new CLS528();
            ʽי0.FLD5165 = s.equals("wexposed") ? CLS27.MTH889("appname") : CLS27.MTH889(s);
            ʽי0.FLD5168 = s;
            ʽי0.FLD5166 = s1;
            ʽי0.FLD5167 = s2;
            this.FLD4904.add("");
            this.FLD4905.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

