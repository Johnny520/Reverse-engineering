// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS12;

public final class CLS1155 implements CLS12 {
    public final int FLD2641;
    public final CLS952 FLD2642;

    public CLS1155(CLS952 ʿˏ0, int v) {
        this.FLD2641 = v;
        this.FLD2642 = ʿˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS952 ʿˏ0 = this.FLD2642;
        if(this.FLD2641 == 0) {
            ʿˏ0.getClass();
            Integer integer0 = ((ContentValues)object0).getAsInteger("startH");
            Integer integer1 = ((ContentValues)object0).getAsInteger("startM");
            ʿˏ0.FLD2151.MTH922(integer0 + ":" + integer1, "auto_tts_do_not_disturb_start");
            return;
        }
        ʿˏ0.getClass();
        Integer integer2 = ((ContentValues)object0).getAsInteger("endH");
        Integer integer3 = ((ContentValues)object0).getAsInteger("endM");
        ʿˏ0.FLD2151.MTH922(integer2 + ":" + integer3, "auto_tts_do_not_disturb_end");
    }
}

