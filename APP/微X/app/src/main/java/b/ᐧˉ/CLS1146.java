// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import org.json.JSONArray;

public final class CLS1146 implements CLS11 {
    public final CLS1112 FLD2594;

    public CLS1146(CLS1112 ᐧˏ0) {
        this.FLD2594 = ᐧˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        this.FLD2594.FLD2482.clear();
        this.FLD2594.FLD2457.clear();
        String s = new JSONArray().toString();
        this.FLD2594.FLD2151.MTH922(s, "block_templates");
        this.FLD2594.FLD2459.notifyDataSetChanged();
    }
}

