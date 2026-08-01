// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ﾞˎ.CLS1622.CLS539;

public final class CLS934 implements CLS16, CLS539 {
    public final int FLD1743;
    public final ContentValues FLD1744;

    public CLS934(ContentValues contentValues0, int v) {
        this.FLD1743 = v;
        this.FLD1744 = contentValues0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        ContentValues contentValues0 = this.FLD1744;
        switch(this.FLD1743) {
            case 1: {
                contentValues0.put("lat", s);
                return;
            }
            case 2: {
                contentValues0.put("lng", s);
                return;
            }
            case 3: {
                contentValues0.put("addr", s);
                return;
            }
            default: {
                contentValues0.put("poi", s);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        ContentValues contentValues0 = this.FLD1744;
        if(this.FLD1743 == 0) {
            if(!TextUtils.isEmpty(s)) {
                String s1 = CLS182.MTH3484(4100629518459130677L, new StringBuilder(), s);
                CLS182.MTH3478(4100629565703770933L, new StringBuilder(), 4100629582883640117L, s, contentValues0, "desc");
                contentValues0.put("msg", s1);
                contentValues0.put("tts", s);
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            CLS182.MTH3478(0x38E92C0B2B3CD335L, new StringBuilder(), 0x38E92C0F2B3CD335L, s, contentValues0, "desc");
            contentValues0.put("tts", s);
        }
    }
}

