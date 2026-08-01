// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.net.Uri;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;

public final class CLS1486 implements CLS8 {
    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(((ContentValues)object0) == null) {
            return;
        }
        String s = CLS21.FLD76.MTH826("getCurrentTalker2", new Object[0]);
        if(((ContentValues)object0).containsKey("file")) {
            CLS466.MTH6526(s, ((ContentValues)object0).getAsString("file"));
            return;
        }
        if(((ContentValues)object0).containsKey("uri")) {
            CLS466.MTH6547(s, Uri.parse(((ContentValues)object0).getAsString("uri")));
        }
    }
}

