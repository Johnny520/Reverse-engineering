// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS1159;
import b.ⁱʾ.CLS359;

public final class CLS1522 implements CLS3 {
    public final int FLD4670;
    public final Activity FLD4671;
    public final ContentValues FLD4672;
    public final CLS359 FLD4673;

    public CLS1522(int v, Activity activity0, ContentValues contentValues0, CLS359 ⁱˉ0) {
        this.FLD4670 = v;
        this.FLD4672 = contentValues0;
        this.FLD4671 = activity0;
        this.FLD4673 = ⁱˉ0;
        super();
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS359 ⁱˉ0 = this.FLD4673;
        ContentValues contentValues0 = this.FLD4672;
        if(this.FLD4670 == 0) {
            String s = String.valueOf(((double)Integer.parseInt((contentValues0.containsKey("delay") ? contentValues0.getAsString("delay") : "1000"))) / 1000.0);
            CLS523.MTH7165(this.FLD4671, CLS27.MTH889("delay"), "", s, 2, ((CLS16)new CLS1159(contentValues0, ⁱˉ0, 8)));
            return;
        }
        String s1 = String.valueOf(((double)Integer.parseInt((contentValues0.containsKey("delay") ? contentValues0.getAsString("delay") : "1000"))) / 1000.0);
        CLS523.MTH7165(this.FLD4671, CLS27.MTH889("delay"), "", s1, 2, ((CLS16)new CLS1159(contentValues0, ⁱˉ0, 12)));
    }
}

