// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS1025 implements CLS2 {
    public final CLS952 FLD2114;

    public CLS1025(CLS952 ʿˏ0) {
        this.FLD2114 = ʿˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        CLS952 ʿˏ0 = this.FLD2114;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ʿˏ0.FLD2151.MTH922(s, "tts_play_voice_include_list");
            return;
        }
        ʿˏ0.FLD2151.MTH922("", "tts_play_voice_include_list");
    }
}

