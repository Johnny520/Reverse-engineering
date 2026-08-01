// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ˈˈ.CLS79;
import java.util.ArrayList;

public final class CLS1121 implements CLS8 {
    public final CLS79 FLD2511;
    public final CLS1019 FLD2512;

    public CLS1121(CLS1019 ˎʻ0, CLS79 ˎᵢ0) {
        this.FLD2512 = ˎʻ0;
        this.FLD2511 = ˎᵢ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(object0 == null) {
            return;
        }
        String s = TextUtils.join(",", ((ArrayList)object0));
        this.FLD2512.FLD2151.MTH922(s, "chatroom_container_tags");
        this.FLD2511.MTH1626();
    }
}

