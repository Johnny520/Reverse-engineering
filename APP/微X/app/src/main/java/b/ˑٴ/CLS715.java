// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.net.Uri;
import b.ʻˑ.CLS8;
import b.ⁱᵔ.CLS466;

public final class CLS715 implements CLS8 {
    public final String FLD852;

    public CLS715(String s) {
        this.FLD852 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(((ContentValues)object0) == null) {
            return;
        }
        boolean z = ((ContentValues)object0).containsKey("file");
        String s = this.FLD852;
        if(z) {
            CLS466.MTH6526(s, ((ContentValues)object0).getAsString("file"));
            return;
        }
        if(((ContentValues)object0).containsKey("uri")) {
            CLS466.MTH6547(s, Uri.parse(((ContentValues)object0).getAsString("uri")));
        }
    }
}

